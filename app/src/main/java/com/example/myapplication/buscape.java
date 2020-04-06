package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class buscape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscape);
        WebView webview= findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.buscape.com.br/?og=19220&gclid=CjwKCAjwg6b0BRBMEiwANd1_SNGQCpjNE7C4Uz56OCDywxqwABPPtxH-RXiBAlTp4Uy40onHizlyUhoCQNcQAvD_BwE");
    }
    public void onVoltar (View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }
}
