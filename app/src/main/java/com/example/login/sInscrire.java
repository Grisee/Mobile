package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sInscrire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinscrire);
    }

    public void clicked(View view){
        Intent intent = new Intent(this, inscrit.class);
        startActivity(intent);
    }

    public void clicked_connection(View view){
        if (verification(view)){
            Intent intent = new Intent(this, seConnecter.class);
            startActivity(intent);
        }
    }

    private boolean verification(View view){
        EditText login =  
        if(){
            return true;
        }
    }
}