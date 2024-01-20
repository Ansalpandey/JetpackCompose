package com.organisation.apitest

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.organisation.apitest.data.RetrofitInstance
import com.organisation.apitest.model.BookDataItem
import java.io.IOException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException

@Composable
fun BookList() {
  val viewModel: BookViewModel = viewModel()

  LaunchedEffect(key1 = true) {
    try {
      val books = withContext(Dispatchers.IO) { RetrofitInstance.api.getBooks() }
      viewModel.setPosts(books)
    } catch (e: HttpException) {
      // Handle HTTP exception
    } catch (e: IOException) {
      // Handle IO exception
    }
  }

  Surface { LazyColumn { items(viewModel.posts) { books -> BookItem(books) } } }
}

@Composable
fun BookItem(books: BookDataItem) {
  // Customize the appearance of each post item
  Card { Text(text = books.title) }
}

@Composable
@Preview
fun BookListPreview() {
  BookList()
}
