package com.organisation.apitest

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.organisation.apitest.model.BookDataItem
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {
  private val _books = mutableStateOf<List<BookDataItem>>(emptyList())
  val posts: List<BookDataItem>
    get() = _books.value

  fun setPosts(posts: List<BookDataItem>) {
    viewModelScope.launch { _books.value = posts }
  }
}
