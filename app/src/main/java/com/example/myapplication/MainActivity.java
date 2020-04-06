package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAmericanas(View view){
        Intent web1 =  new Intent(this,americanas.class);
        startActivity(web1);
    }
    public void onMercadol(View view){
        Intent web2 = new Intent(this,Mercadolivre.class);
        startActivity(web2);
    }
    public void  onBuscape(View view){
        Intent web3 = new Intent(this,buscape.class);
        startActivity(web3);
    }
    public void  onMagalu(View view) {
        Intent web3 = new Intent(this, magalu.class);
        startActivity(web3);
    }
    public void onSobre(View view){
        Intent sobre = new Intent(this, com.example.myapplication.sobre.class);
        startActivity(sobre);
    }
}
