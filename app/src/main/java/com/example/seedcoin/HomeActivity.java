package com.example.seedcoin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardmappe = findViewById(R.id.cardmappe);
        cardmappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MappeActivity.class);
                startActivity(intent);
            }
        });

        CardView cardimpostazioni = findViewById(R.id.cardimpostazioni);
        cardimpostazioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ImpostazioniActivity.class);
                startActivity(intent);
            }
        });

        CardView cardmioprofilo = findViewById(R.id.cardmioprofilo);
        cardmioprofilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MioProfiloActivity.class);
                startActivity(intent);
            }
        });

        CardView cardsocial = findViewById(R.id.cardsocial);
        cardsocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),SocialActivity.class);
                startActivity(intent);
            }
        });

        CardView carddonare = findViewById(R.id.carddonare);
        carddonare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),DonareActivity.class);
                startActivity(intent);
            }
        });

        CardView cardpartecipa = findViewById(R.id.cardpartecipa);
        cardpartecipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),PartecipaActivity.class);
                startActivity(intent);
            }
        });


        CardView cardcestini = findViewById(R.id.cardcestini);
        cardcestini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),CestiniActivity.class);
                startActivity(intent);
            }
        });

        CardView cardprodotti = findViewById(R.id.cardprodotti);
        cardprodotti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),ProdottiActivity.class);
                startActivity(intent);
            }
        });


        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(),"data:" + bundle.getString("some"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}