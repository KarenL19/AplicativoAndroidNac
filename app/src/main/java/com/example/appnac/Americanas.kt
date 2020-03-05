package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_americanas.*

class Americanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        webAM.webViewClient = WebViewClient();
        webAM.settings.javaScriptEnabled = true;
        webAM.settings.displayZoomControls = true;

        webAM.loadUrl("https://www.americanas.com.br/");


    }
}
