package com.example.reticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Comprar(View view) {
        Intent siguiente = new Intent(this, MainActivity2.class);
        startActivity(siguiente);
    }

    public void mostrarInfo(View v) {
        Toast.makeText(getBaseContext(), "Cachengue y cumbia " , Toast.LENGTH_SHORT ).show();
    }
}