package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*

class Buscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)

        webBP.webViewClient = WebViewClient();
        webBP.settings.javaScriptEnabled =true;
        webBP.settings.displayZoomControls = true;

        webBP.loadUrl("https://www.buscape.com.br/")

    }
}
