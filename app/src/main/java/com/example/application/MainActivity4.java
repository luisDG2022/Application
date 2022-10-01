package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void pantallaEntradaySalida(View v){
        Intent it=new Intent(this,MainActivity5.class);
        startActivity(it);
    }
    public void pantallaInventario(View v){
        Intent it=new Intent(this,MainActivity6.class);
        startActivity(it);
    }
    public void pantallaListaPedidos(View v){
        Intent it=new Intent(this,MainActivity7.class);
        startActivity(it);
    }
}