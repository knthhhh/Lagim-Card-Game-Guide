package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import java.util.Objects;

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
        Objects.requireNonNull(getSupportActionBar()).hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    //Global
    public void Back(View view){
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

    //Social Media
    public void facebook(View view){
        String url = "https://www.facebook.com/LAGIMGAME";
        Intent fb = new Intent(Intent.ACTION_VIEW);
        fb.setData(Uri.parse(url));
        startActivity(fb);
    }
    public void instagram(View view){
        String url = "https://www.instagram.com/lagimcardgame/?hl=en";
        Intent ig = new Intent(Intent.ACTION_VIEW);
        ig.setData(Uri.parse(url));
        startActivity(ig);
    }
    public void youtube(View view){
        String url = "https://www.youtube.com/c/LagimCardGame";
        Intent yt = new Intent(Intent.ACTION_VIEW);
        yt.setData(Uri.parse(url));
        startActivity(yt);
    }
    public void kickstarter(View view){
        String url = "https://www.kickstarter.com/projects/fictionminds/lagim-card-game";
        Intent fb = new Intent(Intent.ACTION_VIEW);
        fb.setData(Uri.parse(url));
        startActivity(fb);
    }

}
