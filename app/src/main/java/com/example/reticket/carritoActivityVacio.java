package com.example.reticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class carritoActivityVacio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito_vacio);
    }

    public void Volver(View view) {
        Intent siguiente = new Intent(this, Home.class);
        startActivity(siguiente);
    }
}