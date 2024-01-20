package com.organisation.apitest.data

import com.organisation.apitest.model.BookDataItem
import retrofit2.http.GET

interface ApiInterface {
  @GET("books.json") suspend fun getBooks(): List<BookDataItem>
}
