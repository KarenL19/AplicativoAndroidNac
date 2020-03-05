package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_submarino.*

class Submarino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submarino)

        webSUB.webViewClient = WebViewClient();
        webSUB.settings.javaScriptEnabled= true;
        webSUB.settings.displayZoomControls= true;

        webSUB.loadUrl("https://www.submarino.com.br/")
    }
}
