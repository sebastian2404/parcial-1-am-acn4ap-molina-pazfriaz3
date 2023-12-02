package com.example.reticket;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;


public class Home extends AppCompatActivity{

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void verEvento(View view) {
        Intent evento = new Intent(this, MainActivity.class);
        startActivity(evento);
    }

    public void logout(View v){
        Intent intent = new  Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
        mAuth.signOut();
    }


}
