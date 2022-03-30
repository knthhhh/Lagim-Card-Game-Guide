package com.example.lagimcardgameguideapp2;

import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class Gallery extends System {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
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
        finish();
    }

    public void ClickComponents(View view) {
        Intent intent = new Intent(this, Components.class);
        startActivity(intent);
        finish();
    }

    public void ClickMechanics(View view) {
        Intent intent = new Intent(this, Mechanics.class);
        startActivity(intent);
        finish();
    }

    public void ClickCards(View view) {
        Intent intent = new Intent(this, Cards.class);
        startActivity(intent);
        finish();
    }

    public void ClickGallery(View view) {
        closeDrawer(drawerLayout);
    }

    public void ClickAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
        finish();
    }

    public void ClickFAQs(View view) {
        Intent intent = new Intent(this, FAQs.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer((drawerLayout));
        overridePendingTransition(0, 0);
    }


    public void img1(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_giant);
        startActivity(intent);
    }

    public void img2(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_tigbanua);
        startActivity(intent);
    }

    public void img3(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_mambabarang);
        startActivity(intent);
    }

    public void img4(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_duwende);
        startActivity(intent);
    }

    public void img5(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_kapre);
        startActivity(intent);
    }

    public void img6(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_aswang);
        startActivity(intent);
    }

    public void img7(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_espiritista);
        startActivity(intent);
    }

    public void img8(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_torment);
        startActivity(intent);
    }

    public void img9(View view){
        Intent intent = new Intent(this, GalleryView.class);
        intent.putExtra("img", R.drawable.img_albularyo);
        startActivity(intent);
    }


}