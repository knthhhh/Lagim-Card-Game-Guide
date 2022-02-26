package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class System extends AppCompatActivity {

    public void hideSystemBars() {
        WindowInsetsControllerCompat windowInsetsController =
                ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController == null) {
            return;
        }
        // Configure the behavior of the hidden system bars
        windowInsetsController.setSystemBarsBehavior(
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        );
        // Hide both the status bar and the navigation bar
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    //Global

    //ToComponents
    public void BackToComponents(View view){
        finish();
    }

    //ToHome
    public void BackToHome(View view){
        finish();
    }

    //Home
    public void LagimLimit(View view){
        Intent intent = new Intent(this, LagimLimit.class);
        startActivity(intent);
    }
    public void Dwellers(View view){
        Intent intent = new Intent(this, Dwellers.class);
        startActivity(intent);
    }
    public void Raiding(View view){
        Intent intent = new Intent(this, Raiding.class);
        startActivity(intent);
    }
    public void Defending(View view){
        Intent intent = new Intent(this, Defending.class);
        startActivity(intent);
    }
    public void TypesOfRaid(View view){
        Intent intent = new Intent(this, TypesOfRaid.class);
        startActivity(intent);
    }
    public void TypesOfDefense(View view){
        Intent intent = new Intent(this, TypesOfDefense.class);
        startActivity(intent);
    }


}
