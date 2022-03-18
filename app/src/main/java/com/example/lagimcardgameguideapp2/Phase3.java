package com.example.lagimcardgameguideapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Phase3 extends System {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3);
        hideSystemBars();
    }
    public void Phase3ToPhase1(View view){
        Intent intent = new Intent(this, Phase1.class);
        startActivity(intent);
        finish();
    }
    public void Phase3ToPhase2(View view){
        Intent intent = new Intent(this, Phase2.class);
        startActivity(intent);
        finish();
    }
}