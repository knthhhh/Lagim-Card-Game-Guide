package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BattleCardsArchetype extends System {

    ImageView imageView;
    TextView header, text1, text2, Archetype1, Archetype2, Archetype3, Archetype4, Archetype5;
    ImageView img1, img2, img3, img4, img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_cards_archetype);
        hideSystemBars();

        imageView = findViewById(R.id.bgimg);
        header = findViewById(R.id.Header1);
        text1 = findViewById(R.id.TextContent1);
        text2 = findViewById(R.id.TextContent2);
        img1 = findViewById(R.id.btn1);
        img2 = findViewById(R.id.btn2);
        img3 = findViewById(R.id.btn3);
        img4 = findViewById(R.id.btn4);
        img5 = findViewById(R.id.btn5);
        Archetype1 = findViewById(R.id.archetype1);
        Archetype2 = findViewById(R.id.archetype2);
        Archetype3 = findViewById(R.id.archetype3);
        Archetype4 = findViewById(R.id.archetype4);
        Archetype5 = findViewById(R.id.archetype5);

        header.setText(getIntent().getStringExtra("Header"));
        text1.setText(getIntent().getStringExtra("Text1"));
        text2.setText(getIntent().getStringExtra("Text2"));

        if(header.getText().equals("LAGIM CARDS")){
            imageView.setImageResource(R.drawable.bg_lagimarchetype);
        }else{
            imageView.setImageResource(R.drawable.bg_lakasarchetype);
        }

        if (header.getText().equals("LAGIM CARDS")){
            img1.setImageResource(R.drawable.lagim_witch);
            img2.setImageResource(R.drawable.lagim_bestial);
            img3.setImageResource(R.drawable.lagim_ghoul);
            img4.setImageResource(R.drawable.lagim_giant);
            img5.setImageResource(R.drawable.lagim_dwarf);
            Archetype1.setText("Witch");
            Archetype2.setText("Bestial");
            Archetype3.setText("Ghoul");
            Archetype4.setText("Giant");
            Archetype5.setText("Dwarf");
        }else{
            img1.setImageResource(R.drawable.lakas_medium);
            img2.setImageResource(R.drawable.lakas_mortal);
            img3.setImageResource(R.drawable.lakas_warrior);
            img4.setImageResource(R.drawable.lakas_halfmortal);
            img5.setImageResource(R.drawable.lakas_special);
            Archetype1.setText("Medium");
            Archetype2.setText("Mortal");
            Archetype3.setText("Warrior");
            Archetype4.setText("Half Mortal");
            Archetype5.setText("Special");
        }

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("LAGIM CARDS")){
                    Intent lagim = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lagim.putExtra("Archetype","Witch Archetype");
                    lagim.putExtra("card1", R.drawable.card_mambabarang);
                    lagim.putExtra("card2", R.drawable.card_mangkukulam);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Medium Archetype");
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
                    lagim.putExtra("card4", R.drawable.card_sigbin);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Mortal Archetype");
                    lakas.putExtra("card4", R.drawable.card_amihan);
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
                    lagim.putExtra("card1", R.drawable.card_manananggal);
                    lagim.putExtra("card2", R.drawable.card_aswang);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Warrior Archetype");
                    lakas.putExtra("card4", R.drawable.card_dante);
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
                    lagim.putExtra("card1", R.drawable.card_kapre);
                    lagim.putExtra("card2", R.drawable.card_tikbalang);
                    lagim.putExtra("card3", R.drawable.card_bungisngis);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Half Mortal Archetype");
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
                    lagim.putExtra("card1", R.drawable.card_duwende);
                    lagim.putExtra("card2", R.drawable.card_nunosapunso);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(BattleCardsArchetype.this, BattleCardsList.class);
                    lakas.putExtra("Archetype","Special Archetype");
                    startActivity(lakas);
                }
            }
        });
    }
}