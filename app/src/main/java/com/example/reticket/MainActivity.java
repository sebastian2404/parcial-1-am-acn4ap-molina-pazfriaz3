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

    public void mostrarInfo() {
        Toast.makeText(getBaseContext(), "MUSEUM\n" +
                "\n" +
                "TAYLOR FEST\n" +
                "\n" +
                "WILDEST HALLOWEEN\n" +
                "\n" +
                "Viernes 27 de Octubre\n" +
                "\n" +
                "Open Doors: 00 hs ... Till Close ...\n" +
                "\n" +
                "Perú 535 - San Telmo" , Toast.LENGTH_SHORT ).show();
    }
}