package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_mercadolivre.*

class Mercadolivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercadolivre)

        webMLV.webViewClient = WebViewClient();
        webMLV.settings.javaScriptEnabled= true;
        webMLV.settings.displayZoomControls= true;

        webMLV.loadUrl("https://www.mercadolivre.com.br/")
    }
}
