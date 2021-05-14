package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebVisor extends AppCompatActivity {
    WebView wv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv1 = (WebView)findViewById(R.id.wv1);
        //Recuperar valores por el internet
        String URL = getIntent().getStringExtra("SitioWeb");
        //Permitira al usuario navegar solo por el intenet
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("htpp://"+URL);
        /*wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        wv1.loadUrl("htpp://" + URL);*/

    }






    public void cerra(View view) {
        finish();
    }
}