package com.example.lagimcardgameguideapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Phase1 extends System {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1);
        hideSystemBars();
    }
    public void Phase1ToPhase2(View view){
        Intent intent = new Intent(this, Phase2.class);
        startActivity(intent);
    }
}