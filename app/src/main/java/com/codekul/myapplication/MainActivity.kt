package com.codekul.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding = 10
            var name = editText()
            button("hi") {
                onClick {
                    toast("you typed : ${name.text}")
                    alert { "HELLO" }
                }
            }

        }

    }
}
