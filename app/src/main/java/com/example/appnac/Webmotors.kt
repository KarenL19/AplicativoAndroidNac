package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_webmotors.*

class Webmotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webmotors)

        webMT.webViewClient = WebViewClient();
        webMT.settings.javaScriptEnabled= true;
        webMT.settings.displayZoomControls= true;

        webMT.loadUrl("https://www.webmotors.com.br/")
    }
}
