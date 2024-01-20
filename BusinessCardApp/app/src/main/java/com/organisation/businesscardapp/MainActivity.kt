package com.organisation.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.businesscardapp.ui.theme.BackgroundColor
import com.organisation.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BusinessCardAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = BackgroundColor) { BusinessCard() }
      }
    }
  }
}

@Composable
fun BusinessCard() {
  Text(
    text = "Business Card",
    fontSize = 40.sp,
    fontWeight = FontWeight.ExtraBold,
    textAlign = TextAlign.Center,
  )
  Column(
    modifier = Modifier.padding(top = 100.dp).padding(bottom = 500.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Image(
      painter = painterResource(id = R.drawable.profile),
      contentDescription = null,
      modifier =
        Modifier.size(150.dp).clip(shape = CircleShape).border(2.dp, Color.Black, CircleShape)
    )

    Text(
      text = stringResource(R.string.name),
      color = Color.White,
      fontSize = 21.sp,
      fontStyle = FontStyle.Normal,
      fontWeight = FontWeight.Bold
    )
    Text(
      text = stringResource(R.string.business),
      color = Color.Black,
      fontSize = 18.sp,
      fontStyle = FontStyle.Normal,
      fontWeight = FontWeight.Bold
    )
  }
  Column(
    modifier = Modifier.padding(top = 200.dp).padding(bottom = 70.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Row(modifier = Modifier.fillMaxWidth().padding(start = 40.dp)) {
      val icon = Icons.Default.Phone
      Icon(
        imageVector = icon,
        contentDescription = null,
        modifier = Modifier.padding(start = 70.dp).size(28.dp),
        Color.White
      )
      Text(
        text = stringResource(R.string.phone_number),
        modifier = Modifier.padding(start = 10.dp),
        textAlign = TextAlign.Justify,
        fontSize = 18.sp,
        color = Color.White
      )
    }
    Row(modifier = Modifier.fillMaxWidth().padding(start = 40.dp)) {
      val icon2 = Icons.Default.Email
      Icon(
        imageVector = icon2,
        contentDescription = null,
        modifier = Modifier.padding(start = 70.dp).size(28.dp),
        Color.White
      )
      Text(
        text = stringResource(R.string.email_text),
        modifier = Modifier.padding(start = 10.dp),
        fontSize = 18.sp,
        color = Color.White
      )
    }
    Row(
      modifier = Modifier.fillMaxWidth().padding(start = 40.dp),
    ) {
      val icon3 = Icons.Default.Info
      Icon(
        imageVector = icon3,
        contentDescription = null,
        modifier = Modifier.padding(start = 70.dp).size(28.dp),
        Color.White
      )
      Text(
        text = stringResource(R.string.share_text),
        modifier = Modifier.padding(start = 10.dp),
        fontSize = 18.sp,
        color = Color.White
      )
    }
  }
}
