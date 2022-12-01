package com.dummytest

import android.content.Context
import android.view.View
import android.widget.Toast

fun Context.toast(s: String) = Toast.makeText(this, s, Toast.LENGTH_SHORT).show()

fun View.visible() {
    this.visibility = View.VISIBLE
}