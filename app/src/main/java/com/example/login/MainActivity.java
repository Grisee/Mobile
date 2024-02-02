package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view){
        Intent intent = new Intent(this, seConnecter.class);
        startActivity(intent);
    }

    public void clickedInscription(View view){
        Intent intent = new Intent(this, sInscrire.class);
        startActivity(intent);
    }
}