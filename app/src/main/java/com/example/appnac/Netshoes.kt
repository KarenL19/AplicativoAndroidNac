package com.example.appnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_netshoes.*

class Netshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)

        webNSH.webViewClient = WebViewClient();
        webNSH.settings.javaScriptEnabled= true;
        webNSH.settings.displayZoomControls= true;

        webNSH.loadUrl("https://www.netshoes.com.br/")
    }
}
