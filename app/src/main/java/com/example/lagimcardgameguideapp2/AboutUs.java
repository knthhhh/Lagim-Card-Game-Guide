package com.example.lagimcardgameguideapp2;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends System {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        hideSystemBars();

        drawerLayout = findViewById(R.id.drawer_layout);

    }
    //Drawer Menu
    public void Menu(View view){
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer((GravityCompat.START));
        }
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    public void ClickHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void ClickComponents(View view) {
        Intent intent = new Intent(this, Components.class);
        startActivity(intent);
    }

    public void ClickMechanics(View view) {
        Intent intent = new Intent(this, Mechanics.class);
        startActivity(intent);
    }

    public void ClickGallery(View view) {
        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }

    public void ClickAboutUs(View view) {
        closeDrawer(drawerLayout);
    }

    public void ClickFAQs(View view) {
        Intent intent = new Intent(this, FAQs.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer((drawerLayout));
        overridePendingTransition(0, 0);
    }
}