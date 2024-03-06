package com.example.reticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void logout(View v){
        Intent intent = new  Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
        mAuth.signOut();
    }

    public void regresar(View v){
        Intent intent = new  Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}