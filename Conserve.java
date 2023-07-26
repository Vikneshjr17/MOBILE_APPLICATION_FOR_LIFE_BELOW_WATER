package com.example.projectmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Conserve extends AppCompatActivity implements View.OnClickListener {
    Button btnNews2, btnSpecies2, btnConserve2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conserve);

        btnNews2 = findViewById(R.id.btnNews2);
        btnNews2.setOnClickListener(this);

        btnSpecies2 = findViewById(R.id.btnSpecies2);
        btnSpecies2.setOnClickListener(this);

        btnConserve2 = findViewById(R.id.btnConserve2);
        btnConserve2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btnNews2:
                intent = new Intent(this, MainActivity3.class);
                break;

            case R.id.btnSpecies2:
                intent = new Intent(this, Mainpage.class);
                break;

            case R.id.btnConserve2:
                intent = new Intent(this, Conserve.class);
                break;
        }
        startActivity(intent);

    }
}
