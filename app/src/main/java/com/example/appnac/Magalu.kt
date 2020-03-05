package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_magalu.*

class Magalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        webML.webViewClient = WebViewClient();
        webML.settings.javaScriptEnabled= true;
        webML.settings.displayZoomControls= true;

        webML.loadUrl("https://www.magazineluiza.com.br/")

    }
}
