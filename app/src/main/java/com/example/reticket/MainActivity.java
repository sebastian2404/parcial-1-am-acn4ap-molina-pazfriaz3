package com.example.reticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Comprar(View view) {
        Intent siguiente = new Intent(this, CarritoActivity.class);
        startActivity(siguiente);
    }

    public void Carrito(View view) {
        Intent siguiente = new Intent(this, carritoActivityVacio.class);
        startActivity(siguiente);
    }

    public void Agregar(View view) {
        Intent siguiente = new Intent(this, CarritoActivity.class);
        startActivity(siguiente);
    }

    public void mostrarInfo(View v) {
        Toast.makeText(getBaseContext(), "Cachengue y cumbia " , Toast.LENGTH_SHORT ).show();
    }

    public void logout(View v){
        Intent intent = new  Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
        mAuth.signOut();

    }


}