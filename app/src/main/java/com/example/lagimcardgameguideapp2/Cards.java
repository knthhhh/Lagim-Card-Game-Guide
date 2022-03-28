package com.example.lagimcardgameguideapp2;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Cards extends System {

    DrawerLayout drawerLayout;
    ImageButton lagim, lakas, hiwaga, kontra;
    ArrayList<String> Content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        hideSystemBars();

        lagim = findViewById(R.id.lagimbtn);
        lakas = findViewById(R.id.lakasbtn);
        hiwaga = findViewById(R.id.hiwagabtn);
        kontra = findViewById(R.id.kontrabtn);
        Content = new ArrayList<String>();

        drawerLayout = findViewById(R.id.drawer_layout);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.cards);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home:
                    startActivity(new Intent(getApplicationContext()
                            , Home.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.component:
                    startActivity(new Intent(getApplicationContext()
                            , Components.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.mechanics:
                    startActivity(new Intent(getApplicationContext()
                            , Mechanics.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.cards:
                    startActivity(new Intent(getApplicationContext()
                            , Cards.class));
                    overridePendingTransition(0, 0);
                    return true;
            }
            return false;
        }
    });

        lagim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Content.clear();
                Content.add("LAGIM CARDS");
                Content.add("The symbol that represents the clan of each entity. The Archetype symbol is displayed beside a card’s ability and determines the pairing of character cards with their equip cards.");
                Content.add("FOREST CARDS of the same ARCHETYPE automatically stack together, increasing their total ENTITY LEVEL.");
                Intent intent = new Intent(Cards.this, BattleCardsArchetype.class);
                intent.putExtra("Header",Content.get(0));
                intent.putExtra("Text1",Content.get(1));
                intent.putExtra("Text2",Content.get(2));
                startActivity(intent);
            }
        });

        lakas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Content.clear();
                Content.add("LAKAS CARDS");
                Content.add("LAKAS CARDS of different ARCHETYPES can be played together during battle but each card can only equip KONTRA CARDS of the same Archetype (except for Special Kontra cards).");
                Content.add("Special Kontra cards can be identified by this symbol, and they can be paired with all Lakas Card Archetypes.");
                Intent intent = new Intent(Cards.this, BattleCardsArchetype.class);
                intent.putExtra("Header",Content.get(0));
                intent.putExtra("Text1",Content.get(1));
                intent.putExtra("Text2",Content.get(2));
                startActivity(intent);
            }
        });

        hiwaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Content.clear();
                Content.add("HIWAGA CARDS");
                Intent intent = new Intent(Cards.this, EquipCardsArchetype.class);
                intent.putExtra("Header",Content.get(0));
                startActivity(intent);
            }
        });

        kontra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Content.clear();
                Content.add("KONTRA CARDS");
                Intent intent = new Intent(Cards.this, EquipCardsArchetype.class);
                intent.putExtra("Header",Content.get(0));
                startActivity(intent);
            }
        });

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

    public void ClickCards(View view) {
        closeDrawer(drawerLayout);
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
}