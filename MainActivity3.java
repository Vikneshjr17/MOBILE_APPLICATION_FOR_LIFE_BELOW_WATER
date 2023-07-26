package com.example.projectmobileapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    Button btnNews3, btnSpecies3, btnConserve3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnNews3 = findViewById(R.id.btnNews3);
        btnNews3.setOnClickListener(this);

        btnSpecies3 = findViewById(R.id.btnSpecies3);
        btnSpecies3.setOnClickListener(this);

        btnConserve3 = findViewById(R.id.btnConserve3);
        btnConserve3.setOnClickListener(this);
    }


    public void button(View view) {
        Intent buttonIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.independent.co.uk/climate-change/news/us-heatwave-salmon-boiled-alive-b1892230.html"));
        startActivity(buttonIntent);
    }

    public void button1(View view) {
        Intent button1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.independent.co.uk/news/uk/home-news/shark-week-uk-species-sighting-b1885057.html"));
        startActivity(button1Intent);
    }

    public void button2(View view) {
        Intent button1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theguardian.com/australia-news/2023/jan/25/endangered-shark-sold-as-flake-in-south-australia-fish-and-chip-shops-study-finds"));
        startActivity(button1Intent);
    }

    public void button3(View view) {
        Intent button1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theguardian.com/us-news/2023/jan/21/dolphins-new-york-city-bronx-river"));
        startActivity(button1Intent);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btnNews3:
                intent = new Intent(this, MainActivity3.class);
                break;

            case R.id.btnSpecies3:
                intent = new Intent(this, Mainpage.class);
                break;

            case R.id.btnConserve3:
                intent = new Intent(this, Conserve.class);
                break;
        }
        startActivity(intent);

    }
}
