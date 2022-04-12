package com.example.musicserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.startButton);
        Button stopButton = findViewById(R.id.stopButton);

        startButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MusicService.class);
            startService(intent);
        });

        stopButton.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity.this, MusicService.class);
            stopService(intent2);
        });
    }
}