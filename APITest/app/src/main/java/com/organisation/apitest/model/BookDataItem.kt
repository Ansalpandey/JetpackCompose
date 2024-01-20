package com.organisation.apitest.model

data class BookDataItem(
  val authors: List<String>,
  val categories: List<String>,
  val isbn: String, // 1933988673
  val longDescription:
    String, // Android is an open source mobile phone platform based on the Linux operating system
            // and developed by the Open Handset Alliance, a consortium of over 30 hardware,
            // software and telecom companies that focus on open standards for mobile devices. Led
            // by search giant, Google, Android is designed to deliver a better and more open and
            // cost effective mobile experience.    Unlocking Android: A Developer's Guide provides
            // concise, hands-on instruction for the Android operating system and development tools.
            // This book teaches important architectural concepts in a straightforward writing style
            // and builds on this with practical and useful examples throughout. Based on his mobile
            // development experience and his deep knowledge of the arcane Android technical
            // documentation, the author conveys the know-how you need to develop practical
            // applications that build upon or replace any of Androids features, however small.
            // Unlocking Android: A Developer's Guide prepares the reader to embrace the platform in
            // easy-to-understand language and builds on this foundation with re-usable Java code
            // examples. It is ideal for corporate and hobbyists alike who have an interest, or a
            // mandate, to deliver software functionality for cell phones.    WHAT'S INSIDE:
            // * Android's place in the market      * Using the Eclipse environment for Android
            // development      * The Intents - how and why they are used      * Application
            // classes:            o Activity            o Service            o IntentReceiver
            // * User interface design      * Using the ContentProvider to manage data      *
            // Persisting data with the SQLite database      * Networking examples      * Telephony
            // applications      * Notification methods      * OpenGL, animation & multimedia      *
            // Sample Applications
  val pageCount: Int, // 416
  val shortDescription:
    String, // Unlocking Android: A Developer's Guide provides concise, hands-on instruction for the
            // Android operating system and development tools. This book teaches important
            // architectural concepts in a straightforward writing style and builds on this with
            // practical and useful examples throughout.
  val status: String, // PUBLISH
  val thumbnailUrl:
    String, // https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson.jpg
  val title: String // Unlocking Android
)