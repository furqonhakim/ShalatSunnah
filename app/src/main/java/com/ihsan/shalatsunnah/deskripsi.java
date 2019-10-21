package com.ihsan.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class deskripsi extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        webView = findViewById(R.id.webView);


        Intent deskripsi = getIntent();
                getSupportActionBar().setDisplayShowHomeEnabled(true);


        String link = deskripsi.getStringExtra("sunnah");


        //agar jacascriptnya bisa terbaca
        webView.getSettings().getJavaScriptEnabled();



        //agar gamabrnya otomatis di masukkan
        webView.getSettings().setLoadsImagesAutomatically(true);


        //untuk memasukkan linknya
        webView.loadUrl(link);
    }
}
