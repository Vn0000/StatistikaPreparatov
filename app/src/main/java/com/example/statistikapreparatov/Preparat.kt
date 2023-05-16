package com.example.statistikapreparatov

import android.net.Uri

data class Preparat(
    var title: String,
    var description: String,
    var imageId: Uri? = null,
    val Id: Int
)