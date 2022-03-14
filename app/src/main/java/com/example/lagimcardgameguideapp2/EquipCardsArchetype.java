package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EquipCardsArchetype extends System {

    ImageView imageView;
    TextView header, Archetype1, Archetype2, Archetype3, Archetype4, Archetype5;
    ImageView img1, img2, img3, img4, img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_cards_archetype);
        hideSystemBars();

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

        imageView = findViewById(R.id.bgimg);
        header = findViewById(R.id.Header1);
        Bundle bundle = getIntent().getExtras();
        String get = bundle.getString("Header");
        int img = bundle.getInt("bg");

        imageView.setImageResource(img);
        header.setText(getIntent().getStringExtra("Header"));

        if (header.getText().equals("HIWAGA CARDS")){
            img1.setImageResource(R.drawable.hiwaga_witch);
            img2.setImageResource(R.drawable.lagim_bestial);
            img3.setImageResource(R.drawable.hiwaga_ghoul);
            img4.setImageResource(R.drawable.hiwaga_giant);
            img5.setImageResource(R.drawable.hiwaga_dwarf);
            Archetype1.setText("Witch");
            Archetype2.setText("Bestial");
            Archetype3.setText("Ghoul");
            Archetype4.setText("Giant");
            Archetype5.setText("Dwarf");
        }else{
            img1.setImageResource(R.drawable.kontra_medium);
            img2.setImageResource(R.drawable.kontra_mortal);
            img3.setImageResource(R.drawable.kontra_warrior);
            img4.setImageResource(R.drawable.kontra_halfmortal);
            img5.setImageResource(R.drawable.kontra_special);
            Archetype1.setText("Medium");
            Archetype2.setText("Mortal");
            Archetype3.setText("Warrior");
            Archetype4.setText("Half Mortal");
            Archetype5.setText("Special");
        }

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("HIWAGA CARDS")){
                    Intent lagim = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lagim.putExtra("Archetype","Witch Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_sumpangmanika);
                    lagim.putExtra("card2", R.drawable.card_alakdan_at_alupihan);
                    lagim.putExtra("card3", R.drawable.card_altar_ng_kulam);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lakas.putExtra("Archetype","Medium Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("titlebg", R.drawable.bg_title_cards_gray);
                    lakas.putExtra("card1", R.drawable.card_buntot_pagi);
                    lakas.putExtra("card2",R.drawable.card_orasyonatinsenso);
                    startActivity(lakas);
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("HIWAGA CARDS")){
                    Intent lagim = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lagim.putExtra("Archetype","Bestial Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lakas.putExtra("Archetype","Mortal Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("titlebg", R.drawable.bg_title_cards_gray);
                    lakas.putExtra("card1", R.drawable.card_tabakbawangatasin);
                    startActivity(lakas);
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("HIWAGA CARDS")){
                    Intent lagim = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lagim.putExtra("Archetype","Ghoul Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_tiktikatbuwan);
                    lagim.putExtra("card2", R.drawable.card_dugo_at_langis);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lakas.putExtra("Archetype","Warrior Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("titlebg", R.drawable.bg_title_cards_gray);
                    lakas.putExtra("card1", R.drawable.card_sibatatsulo);
                    startActivity(lakas);
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("HIWAGA CARDS")){
                    Intent lagim = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lagim.putExtra("Archetype","Giant Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_punongacacia);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lakas.putExtra("Archetype","Half Mortal Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("titlebg", R.drawable.bg_title_cards_gray);
                    startActivity(lakas);
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (header.getText().equals("HIWAGA CARDS")){
                    Intent lagim = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lagim.putExtra("Archetype","Dwarf Archetype");
                    lagim.putExtra("bg", R.drawable.bg_lagim);
                    lagim.putExtra("card1", R.drawable.card_bungo_at_tungkod);
                    startActivity(lagim);
                } else {
                    Intent lakas = new Intent(EquipCardsArchetype.this, EquipCardsList.class);
                    lakas.putExtra("Archetype","Special Archetype");
                    lakas.putExtra("bg", R.drawable.bg_kontra);
                    lakas.putExtra("titlebg", R.drawable.bg_title_cards_gray);
                    lakas.putExtra("card1", R.drawable.card_agimat);
                    lakas.putExtra("card2", R.drawable.card_gasera);
                    startActivity(lakas);
                }
            }
        });

    }
}