package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class seConnecter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se_connecter);
    }

    public void clicked(View view){
        Intent intent = new Intent(this, connecter.class);
        startActivity(intent);
    }

    public void clickedLogin(View view){
        Intent intent = new Intent(this, sInscrire.class);
        startActivity(intent);
    }

}