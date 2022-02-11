package com.example.tareasemana4gabrielhenriquez;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ImageButton vocala;
    private ImageButton vocale;
    private ImageButton vocali;
    private ImageButton vocalo;
    private ImageButton vocalu;
    private ImageButton nombre;
    MediaPlayer voza;
    MediaPlayer voze;
    MediaPlayer vozi;
    MediaPlayer vozo;
    MediaPlayer vozu;
    MediaPlayer vozbre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(ImageButton) findViewById(R.id.imvocal);
        vozbre= MediaPlayer.create(getApplicationContext(),R.raw.vocales);
        nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                vozbre.start();
            }
        });
    vocala=(ImageButton) findViewById(R.id.ima);
        voza= MediaPlayer.create(getApplicationContext(),R.raw.vocala);
        vocala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                voza.start();
            }
        });
        vocale=(ImageButton) findViewById(R.id.ime);
        voze= MediaPlayer.create(getApplicationContext(),R.raw.vocale);
        vocale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                voze.start();
            }
        });
        vocali=(ImageButton) findViewById(R.id.imi);
        vozi= MediaPlayer.create(getApplicationContext(),R.raw.vocali);
        vocali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                vozi.start();
            }
        });
        vocalo=(ImageButton) findViewById(R.id.imo);
        vozo= MediaPlayer.create(getApplicationContext(),R.raw.vocalo);
        vocalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                vozo.start();
            }
        });
        vocalu=(ImageButton) findViewById(R.id.imu);
        vozu= MediaPlayer.create(getApplicationContext(),R.raw.vocalu);
        vocalu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                vozu.start();
            }
        });
    }
}