package com.example.application;

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
    public void pantallaVenta(View v){
        Intent it=new Intent(this,MainActivity2.class);
        startActivity(it);

    }
    public void pantallaPrincipal(View v){
        Intent it=new Intent(this,MainActivity4.class);
        startActivity(it);
    }

}