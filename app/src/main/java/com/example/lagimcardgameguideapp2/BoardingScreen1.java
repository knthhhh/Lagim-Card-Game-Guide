package com.example.lagimcardgameguideapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class BoardingScreen1 extends System {

    TextView next;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_screen1);
        hideSystemBars();

        next = findViewById(R.id.Next);
        skip = findViewById(R.id.Skip);

        SharedPreferences.Editor sharedPreferencesEditor =
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        sharedPreferencesEditor.putBoolean(
                "boardingscreen", true);
        sharedPreferencesEditor.apply();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoardingScreen1.this, BoardingScreen2.class);
                startActivity(intent);
                finish();
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoardingScreen1.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

    }
}