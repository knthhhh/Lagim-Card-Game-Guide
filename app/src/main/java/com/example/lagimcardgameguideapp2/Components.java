package com.example.lagimcardgameguideapp2;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Components extends System {

    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        hideSystemBars();

        drawerLayout = findViewById(R.id.drawer_layout);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.component);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , Home.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.component:
                        startActivity(new Intent(getApplicationContext()
                                , Components.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.mechanics:
                        startActivity(new Intent(getApplicationContext()
                                , Mechanics.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.cards:
                        startActivity(new Intent(getApplicationContext()
                                , Cards.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                }
                return false;
            }
        });

    }
    //Drawer Menu
    public void ClickMenu(View view){
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
        closeDrawer(drawerLayout);
    }

    public void ClickMechanics(View view) {
        Intent intent = new Intent(this, Mechanics.class);
        startActivity(intent);
        finish();
    }

    public void ClickCards(View view) {
        Intent intent = new Intent(this, Cards.class);
        startActivity(intent);
    }

    public void ClickGallery(View view) {
        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }

    public void ClickAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
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

    //Components
    public void ComponentsToCardAnatomy(View view) {
        Intent intent = new Intent(this, CardAnatomy.class);
        startActivity(intent);
    }

    public void ComponentsToBoardDetails(View view) {
        Intent intent = new Intent(this, GameBoard.class);
        startActivity(intent);
    }

    public void ComponentsToBaryoDetails(View view) {
        Intent intent = new Intent(this, BaryoCardDetails.class);
        startActivity(intent);
    }

    public void ComponentsToForestDetails(View view) {
        Intent intent = new Intent(this, ForestCardDetails.class);
        startActivity(intent);
    }
}