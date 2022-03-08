package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BattleCardsArchetype extends System {

    ImageView imageView;
    TextView header, text;
    ImageView img1, img2, img3, img4, img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_cards_archetype);
        hideSystemBars();

        imageView = findViewById(R.id.bgimg);
        header = findViewById(R.id.Header1);
        text = findViewById(R.id.TextContent);
        img1 = findViewById(R.id.btn1);
        img2 = findViewById(R.id.btn2);
        img3 = findViewById(R.id.btn3);
        img4 = findViewById(R.id.btn4);
        img5 = findViewById(R.id.btn5);

        Bundle bundle = getIntent().getExtras();
        String get = bundle.getString("Header");
        int img = bundle.getInt("bg");

        imageView.setImageResource(img);
        header.setText(getIntent().getStringExtra("Header"));
        text.setText(getIntent().getStringExtra("Text"));

        if (header.getText().equals("LAGIM CARDS")){
            img1.setImageResource(R.drawable.lagim_witch);
            img2.setImageResource(R.drawable.lagim_bestial);
            img3.setImageResource(R.drawable.lagim_ghoul);
            img4.setImageResource(R.drawable.lagim_giant);
            img5.setImageResource(R.drawable.lagim_dwarf);
        }else{
            img1.setImageResource(R.drawable.lakas_medium);
            img2.setImageResource(R.drawable.lakas_mortal);
            img3.setImageResource(R.drawable.lakas_warrior);
            img4.setImageResource(R.drawable.lakas_halfmortal);
            img5.setImageResource(R.drawable.lakas_special);
        }

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("LAGIM CARDS")){
                    Intent lagim = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lagim.putExtra("Archetype","Witch Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_mambabarang);
                    lagim.putExtra("card2", R.drawable.card_manananggal);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Medium Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("card1", R.drawable.card_albularyo);
                    lakas.putExtra("card2",R.drawable.card_espiritista);
                    startActivity(lakas);
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("LAGIM CARDS")){
                    Intent lagim = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lagim.putExtra("Archetype","Bestial Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Mortal Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("card1", R.drawable.card_amihan);
                    startActivity(lakas);
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("LAGIM CARDS")){
                    Intent lagim = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lagim.putExtra("Archetype","Ghoul Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_manananggal);
                    lagim.putExtra("card2", R.drawable.card_aswang);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Warrior Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("card1", R.drawable.card_dante);
                    startActivity(lakas);
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("LAGIM CARDS")){
                    Intent lagim = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lagim.putExtra("Archetype","Giant Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_kapre);
                    lagim.putExtra("card2", R.drawable.card_tikbalang);
                    lagim.putExtra("card3", R.drawable.card_bungisngis);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Half Mortal Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    startActivity(lakas);
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("LAGIM CARDS")){
                    Intent lagim = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lagim.putExtra("Archetype","Dwarf Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_duwende);
                    lagim.putExtra("card2", R.drawable.card_nunosapunso);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Special Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    startActivity(lakas);
                }
            }
        });
    }
}