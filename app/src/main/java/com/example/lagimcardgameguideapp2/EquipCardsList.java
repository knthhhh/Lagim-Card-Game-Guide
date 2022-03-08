package com.example.lagimcardgameguideapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EquipCardsList extends System {

    TextView textView;
    ImageView imageView1, imageView2, imageView3, bgimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_cards_list);
        hideSystemBars();

        Bundle bundle = getIntent().getExtras();

        textView = findViewById(R.id.Header1);
        imageView1 = findViewById(R.id.card1);
        imageView2 = findViewById(R.id.card2);
        imageView3 = findViewById(R.id.card3);
        bgimg = findViewById(R.id.bgimg);

        textView.setText(getIntent().getStringExtra("Archetype"));
        int bg = bundle.getInt("bg");
        int card1 = bundle.getInt("card1");
        int card2 = bundle.getInt("card2");
        int card3 = bundle.getInt("card3");

        bgimg.setImageResource(bg);
        imageView1.setImageResource(card1);
        imageView2.setImageResource(card2);
        imageView3.setImageResource(card3);

    }
}