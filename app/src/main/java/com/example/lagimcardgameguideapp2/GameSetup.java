package com.example.lagimcardgameguideapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GameSetup extends System {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_setup);
        hideSystemBars();
    }
}