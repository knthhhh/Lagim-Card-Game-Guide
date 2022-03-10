package com.example.lagimcardgameguideapp2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardsDetails extends System {

    ImageView Card, Pair1, Pair2, Pair3, Pair4, Pair5, Pair6, bgImg, Level, bgText;
    TextView Name, SubName, CardType, Archetype, Traits, Ability, Sub4, Sub5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards_details);
        hideSystemBars();

        Bundle bundle = getIntent().getExtras();

        Card = findViewById(R.id.card);
        Pair1 = findViewById(R.id.pair1);
        Pair2 = findViewById(R.id.pair2);
        Pair3 = findViewById(R.id.pair3);
        Pair4 = findViewById(R.id.pair4);
        Pair5 = findViewById(R.id.pair5);
        Pair6 = findViewById(R.id.pair6);
        bgImg = findViewById(R.id.bgimg);
        bgText = findViewById(R.id.bgtext);
        Level = findViewById(R.id.level);
        Name = findViewById(R.id.card_name);
        SubName = findViewById(R.id.sub_name);
        CardType = findViewById(R.id.card_type);
        Archetype = findViewById(R.id.archetype);
        Traits = findViewById(R.id.traits);
        Ability = findViewById(R.id.ability);
        Sub4 = findViewById(R.id.sub4);
        Sub5 = findViewById(R.id.sub5);

        Name.setText(getIntent().getStringExtra("CardName"));
        SubName.setText(getIntent().getStringExtra("SubName"));
        CardType.setText(getIntent().getStringExtra("CardType"));
        Archetype.setText(getIntent().getStringExtra("Archetype"));
        Traits.setText(getIntent().getStringExtra("Traits"));
        Ability.setText(getIntent().getStringExtra("Ability"));

        int bg = bundle.getInt("bgimg");
        int bgtext = bundle.getInt("bgtext");
        int card = bundle.getInt("Card");
        int pair1 = bundle.getInt("Pair1");
        int pair2 = bundle.getInt("Pair2");
        int pair3 = bundle.getInt("Pair3");
        int pair4 = bundle.getInt("Pair4");
        int pair5 = bundle.getInt("Pair5");
        int pair6 = bundle.getInt("Pair6");
        int level = bundle.getInt("Level");

        bgImg.setImageResource(bg);
        bgText.setImageResource(bgtext);
        Card.setImageResource(card);
        Pair1.setImageResource(pair1);
        Pair2.setImageResource(pair2);
        Pair3.setImageResource(pair3);
        Pair4.setImageResource(pair4);
        Pair5.setImageResource(pair5);
        Pair6.setImageResource(pair6);
        Level.setImageResource(level);

        String text1 = "Artifact";
        String text2 = "Use/Effect";
        String text3 = "Traits";
        String text4 = "Abilities";

        if ((CardType.getText().equals("Hiwaga Card")) || (CardType.getText().equals("Kontra Card")) || (CardType.getText().equals("Special Kontra Card")) ){
            Sub4.setText(text1);
            Sub5.setText(text2);
        }else{
            Sub4.setText(text3);
            Sub5.setText(text4);
        }

    }
}