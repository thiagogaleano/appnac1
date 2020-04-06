package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class magalu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magalu);
        WebView webview= findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.magazineluiza.com.br/?partner_id=974&gclid=CjwKCAjwg6b0BRBMEiwANd1_SPHHK4ZwE5RZDmSGZMo_SvTkBvELV-_7k3XqgwXBh08xdVGjfWQnsxoC3KIQAvD_BwE");
    }
    public void onVoltar (View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }
}
