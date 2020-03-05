package com.example.appnac

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        americanas.setOnClickListener({v:View ->

            var AmericanasIntent = Intent(this, Americanas::class.java);
            startActivity(AmericanasIntent)
        })

        buscape.setOnClickListener({v:View ->

            var BuscapeIntent = Intent(this, Buscape::class.java);
            startActivity(BuscapeIntent)
        })

        ebay.setOnClickListener({v:View ->

            var EbayIntent = Intent(this, Ebay::class.java);
            startActivity(EbayIntent)
        })

        magalu.setOnClickListener({v:View ->

            var MagaluIntent = Intent(this, Magalu::class.java);
            startActivity(MagaluIntent)
        })

        mercadolivre.setOnClickListener({v:View ->

            var MercadolivreIntent = Intent(this, Mercadolivre::class.java);
            startActivity(MercadolivreIntent)
        })

        netshoes.setOnClickListener({v:View ->

            var NetshoesIntent = Intent(this, Netshoes::class.java);
            startActivity(NetshoesIntent)
        })

        submarino.setOnClickListener({v:View ->

            var SubmarinoIntent = Intent(this, Submarino::class.java);
            startActivity(SubmarinoIntent)
        })

        webmotors.setOnClickListener({v:View ->

            var WebmotorsIntent = Intent(this, Webmotors::class.java);
            startActivity(WebmotorsIntent)
        })

        btSobre.setOnClickListener ({ v: View? ->
            var BtSobreIntent = Intent(this, Sobre::class.java);
            startActivity(BtSobreIntent);
        })
    }
}
