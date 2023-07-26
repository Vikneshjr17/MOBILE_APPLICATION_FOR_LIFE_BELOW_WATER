package com.example.projectmobileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class Mainpage extends AppCompatActivity implements View.OnClickListener {

    GridLayout mainGrid;
    Button btnNews, btnSpecies, btnConserve;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        btnNews = findViewById(R.id.btnNews);
        btnNews.setOnClickListener(this);

        btnSpecies = findViewById(R.id.btnSpecies);
        btnSpecies.setOnClickListener(this);

        btnConserve = findViewById(R.id.btnConserve);
        btnConserve.setOnClickListener(this);

        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i=0; i<mainGrid.getChildCount();i ++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (finalI==0){
                        Intent intent = new Intent(Mainpage.this,Categories.class);
                        startActivity(intent);
                    }
                    else if (finalI==1){
                        Intent intent = new Intent(Mainpage.this,Categories2.class);
                        startActivity(intent);
                    }
                    else if (finalI==2){
                        Intent intent = new Intent(Mainpage.this,Categories3.class);
                        startActivity(intent);
                    }
                    else if (finalI==3){
                        Intent intent = new Intent(Mainpage.this,Categories4.class);
                        startActivity(intent);
                    }
                    else if (finalI==4){
                        Intent intent = new Intent(Mainpage.this,Categories5.class);
                        startActivity(intent);
                    }
                    else if (finalI==5){
                        Intent intent = new Intent(Mainpage.this,Categories6.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Mainpage.this,"No Item",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    @Override
    public void onClick(View v) {
         Intent intent = null;
        switch (v.getId()){
            case R.id.btnNews:
                intent = new Intent(this, MainActivity3.class);
            break;

            case R.id.btnSpecies:
                intent = new Intent(this, Mainpage.class);
                break;

            case R.id.btnConserve:
                intent = new Intent(this, Conserve.class);
                break;
        }
        startActivity(intent);
    }
}