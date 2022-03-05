package com.example.lagimcardgameguideapp2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

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
            img1.setImageResource(R.drawable.ic_witch_btn);
            img2.setImageResource(R.drawable.ic_bestial_btn);
            img3.setImageResource(R.drawable.ic_ghoul_btn);
            img4.setImageResource(R.drawable.ic_giant_btn);
            img5.setImageResource(R.drawable.ic_dwarf_btn);
        }else{
            img1.setImageResource(R.drawable.ic_medium_button);
            img2.setImageResource(R.drawable.ic_mortal_btn);
            img3.setImageResource(R.drawable.ic_warrior_btn);
            img4.setImageResource(R.drawable.ic_halfwarrior_btn);
            img5.setImageResource(R.drawable.ic_special_btn);
        }

//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String string = (String) header.getText();
//                switch (string){
//                    case "LAGIM CARDS":
//                        Intent lagim = new Intent(BattleCardsArchetype.this, ListBattleCards.class);
//                        lagim.putExtra("Archetype","Witch Archetype");
//                        lagim.putExtra("bg", R.drawable.bg_lagim1);
//                        lagim.putExtra("card1", R.drawable.bg_kontra1);
//                        lagim.putExtra("card2", R.drawable.bg_lagim1);
//                        startActivity(lagim);
//                        break;
//                    case "HIWAGA CARDS":
//                        Intent lakas = new Intent(BattleCardsArchetype.this, ListBattleCards.class);
//                        lakas.putExtra("Archetype","Medium Archetype");
//                        lakas.putExtra("bg", R.drawable.bg_kontra1);
//                        lakas.putExtra("card1", R.drawable.archetype_giant);
//                        lakas.putExtra("card2",R.drawable.archetype_dwarf);
//                        startActivity(lakas);
//                        break;
//                }
//            }
//        });
    }
}