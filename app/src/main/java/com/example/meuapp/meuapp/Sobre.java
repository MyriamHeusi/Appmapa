package com.example.meuapp.meuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);
    }
    public void voltar(View v){
        Intent acao=new Intent(this,MeuApp.class);
        startActivity(acao);
        finish();
    }
}
