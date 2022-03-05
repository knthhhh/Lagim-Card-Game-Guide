package com.example.lagimcardgameguideapp2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EquipCardsArchetype extends System {

    ImageView imageView;
    TextView header;
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
        imageView = findViewById(R.id.bgimg);
        header = findViewById(R.id.Header1);
        Bundle bundle = getIntent().getExtras();
        String get = bundle.getString("Header");
        int img = bundle.getInt("bg");

        imageView.setImageResource(img);
        header.setText(getIntent().getStringExtra("Header"));

        if (header.getText().equals("HIWAGA CARDS")){
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
    }
}