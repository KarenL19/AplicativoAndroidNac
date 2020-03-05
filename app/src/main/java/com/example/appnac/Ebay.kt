package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ebay.*

class Ebay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)

        webBY.webViewClient = WebViewClient();
        webBY.settings.javaScriptEnabled = true;
        webBY.settings.displayZoomControls = true;

        webBY.loadUrl("https://www.ebay.com/")
    }
}
