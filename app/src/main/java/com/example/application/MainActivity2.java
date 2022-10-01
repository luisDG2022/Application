package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void productoCC(View v){
        Intent it=new Intent(this,MainActivity3.class);
        startActivity(it);
    }
    public void productoCP(View v){
        Intent it=new Intent(this,MainActivity3.class);
        startActivity(it);
    }
    public void productoP(View v){
        Intent it=new Intent(this,MainActivity3.class);
        startActivity(it);
    }
    public void productoT(View v){
        Intent it=new Intent(this,MainActivity3.class);
        startActivity(it);
    }
    public void productoCem(View v){
        Intent it=new Intent(this,MainActivity3.class);
        startActivity(it);
    }
}