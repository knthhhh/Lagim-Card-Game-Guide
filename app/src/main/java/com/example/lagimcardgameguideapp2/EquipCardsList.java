package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EquipCardsList extends System {

    TextView textView;
    ImageView imageView1, imageView2, imageView3, imageView4, bgimg, Header;
    ArrayList<String> ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_cards_list);
        hideSystemBars();

        Bundle bundle = getIntent().getExtras();
        ArrayList = new ArrayList<>();

        textView = findViewById(R.id.Header1);
        imageView1 = findViewById(R.id.card1);
        imageView2 = findViewById(R.id.card2);
        imageView3 = findViewById(R.id.card3);
        imageView4 = findViewById(R.id.card4);
        Header = findViewById(R.id.titlebg);
        bgimg = findViewById(R.id.bgimg);

        textView.setText(getIntent().getStringExtra("Archetype"));
        int card1 = bundle.getInt("card1");
        int card2 = bundle.getInt("card2");
        int card3 = bundle.getInt("card3");
        int card4 = bundle.getInt("card4");

        imageView1.setImageResource(card1);
        imageView2.setImageResource(card2);
        imageView3.setImageResource(card3);
        imageView4.setImageResource(card4);

        if (textView.getText().equals("Witch Archetype") ||
                (textView.getText().equals("Ghoul Archetype") ||
                        (textView.getText().equals("Medium Archetype") ||
                                (textView.getText().equals("Special Archetype"))))){
            imageView4.setImageDrawable(null);
        }

        if (textView.getText().equals("Witch Archetype") ||
                (textView.getText().equals("Ghoul Archetype") ||
                        (textView.getText().equals("Bestial Archetype") ||
                                (textView.getText().equals("Giant Archetype") ||
                                        (textView.getText().equals("Dwarf Archetype")))))){
            Header.setImageResource(R.drawable.bg_title_cards_maroon);
            bgimg.setImageResource(R.drawable.bg_lagim_cardlist);
        }else{
            Header.setImageResource(R.drawable.bg_title_cards_gray);
            bgimg.setImageResource(R.drawable.bg_kontra);
        }

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Witch Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Sumpa ng Manika");
                    ArrayList.add("(Vodoo Doll)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Witch");
                    ArrayList.add("A worn and wretched doll, cursed to inflict misery and torment upon its owner's unfortunate victim.");
                    ArrayList.add("SUMMON: Two(2) Sumpa ng Manika summons a witch card from forest deck.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_sumpangmanika);
                    intent.putExtra("Pair1", R.drawable.card_mambabarang);
                    intent.putExtra("Pair2", R.drawable.card_mangkukulam);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }else if (textView.getText().equals("Medium Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Buntot Pagi");
                    ArrayList.add("(Stingray Tail)");
                    ArrayList.add("Kontra Card");
                    ArrayList.add("Medium");
                    ArrayList.add("The stingray tail is an effective talisman and fine weapon against certain evil beings.");
                    ArrayList.add("NULLIFY: When equipped with a Shaman, all abilities of opposing cards are nullified and do not take effect. +1 to defense Entity Level.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_buntot_pagi);
                    intent.putExtra("Pair1", R.drawable.card_espiritista);
                    intent.putExtra("Pair2", R.drawable.card_albularyo);
                    intent.putExtra("Level", R.drawable.level_two_sun);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }else if (textView.getText().equals("Ghoul Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Tiktik at Buwan");
                    ArrayList.add("(Black Crow & Full Moon)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Ghoul");
                    ArrayList.add("The black crow caws forebodingly against the night sky, and the clouds part to reveal the full moon. A bad omen.");
                    ArrayList.add("SUMMON: Two(2) Tiktik at Buwan summons a ghoul card from forest deck.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_tiktikatbuwan);
                    intent.putExtra("Pair1", R.drawable.card_aswang);
                    intent.putExtra("Pair2", R.drawable.card_manananggal);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }else if (textView.getText().equals("Special Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Agimat");
                    ArrayList.add("(Amulet)");
                    ArrayList.add("Special Kontra Card");
                    ArrayList.add("Special");
                    ArrayList.add("A rare charm of mystical power that protects the bearer from evil curses and sinister sorcery. It feels remarkably reassuring, and warm to the touch.");
                    ArrayList.add("NULLIFY: When equipped, this Amulet nullifies all negative abilities. Increase the entity level of this card by the [x]number of active defense cards in the Baryo.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_agimat);
                    intent.putExtra("Pair1", R.drawable.card_dante);
                    intent.putExtra("Pair2", R.drawable.card_amihan);
                    intent.putExtra("Pair3", R.drawable.card_albularyo);
                    intent.putExtra("Pair4", R.drawable.card_espiritista);
                    intent.putExtra("Level", R.drawable.level_two_sun);
                    intent.putExtra("bgtext", R.drawable.bg_carddetails_text_medium);
                    startActivity(intent);
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Witch Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Alakdan at Alupihan");
                    ArrayList.add("(Scorpion & Centipede)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Witch");
                    ArrayList.add("Vicious predators that poison their prey with incredibly toxic venom; each one a fitting medium for unspeakable witchcraft.");
                    ArrayList.add("IMPALE: Equip to witch card, reduces defending cards/s total entity level by 1.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_alakdan_at_alupihan);
                    intent.putExtra("Pair1", R.drawable.card_mambabarang);
                    intent.putExtra("Pair2", R.drawable.card_mangkukulam);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }else if (textView.getText().equals("Medium Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Orasyon at Insenso");
                    ArrayList.add("(Prayer & Incense)");
                    ArrayList.add("Kontra Card");
                    ArrayList.add("Medium");
                    ArrayList.add("The prayers of the faithful will be heard, and divine protection will be bestowed upon those who believe.");
                    ArrayList.add("NULLIFY: When equipped with a Shaman, all abilities of opposing cards are nullified and do not take effect.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_orasyonatinsenso);
                    intent.putExtra("Pair1", R.drawable.card_albularyo);
                    intent.putExtra("Pair2", R.drawable.card_espiritista);
                    intent.putExtra("Level", R.drawable.level_two_sun );
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }else if (textView.getText().equals("Ghoul Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Dugo at Langis");
                    ArrayList.add("(Blood & Oil)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Ghoul");
                    ArrayList.add("Implements of  a wicked transfiguration. The odor is thick and pungent, like clotted infected wounds.");
                    ArrayList.add("SUMMON: Two (2) Dugo at Langis summons a ghoul card from forest deck.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_dugo_at_langis);
                    intent.putExtra("Pair1", R.drawable.card_aswang);
                    intent.putExtra("Pair2", R.drawable.card_manananggal);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }else if (textView.getText().equals("Special Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Gasera");
                    ArrayList.add("(Gas Lamp)");
                    ArrayList.add("Special Kontra Card");
                    ArrayList.add("Special");
                    ArrayList.add("The lamp bathes you in a warm light, illuminating the path through the dark forest.");
                    ArrayList.add("PEEK: Take a peek on the top 2 cards from the Forest. Player can switch the order of the cards.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_gasera);
                    intent.putExtra("Pair1", R.drawable.card_dante);
                    intent.putExtra("Pair2", R.drawable.card_amihan);
                    intent.putExtra("Pair3", R.drawable.card_albularyo);
                    intent.putExtra("Pair4", R.drawable.card_espiritista);
                    intent.putExtra("Level", R.drawable.level_two_sun);
                    intent.putExtra("bgtext", R.drawable.bg_carddetails_text_medium);
                    startActivity(intent);
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Witch Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Altar ng Kulam");
                    ArrayList.add("(Witch Altar)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Witch");
                    ArrayList.add("An altar of malevolent magic, upon which infernal sacrifices are made.");
                    ArrayList.add("SUMMON: Two (2) Altar ng Kulam summons a witch card from forest deck.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_altar_ng_kulam);
                    intent.putExtra("Pair1", R.drawable.card_mambabarang);
                    intent.putExtra("Pair2", R.drawable.card_mangkukulam);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Giant Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Puno ng Acacia");
                    ArrayList.add("(Acacia Tree)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Giant");
                    ArrayList.add("A strong creepy, gigantic tree to shelter strong, gigantic beings.");
                    ArrayList.add("IMPALE: Equip to Giant card, reduces defending card/s total entity level by 1.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_punongacacia);
                    intent.putExtra("Pair1", R.drawable.card_tikbalang);
                    intent.putExtra("Pair2", R.drawable.card_kapre);
                    intent.putExtra("Pair3", R.drawable.card_bungisngis);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext", R.drawable.bg_carddetails_text_medium);
                    startActivity(intent);
                } else if (textView.getText().equals("Dwarf Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Bungo at Tungkod");
                    ArrayList.add("(Skull & Staff)");
                    ArrayList.add("Hiwaga Card");
                    ArrayList.add("Dwarf");
                    ArrayList.add("Instruments of magic utilized by elder beings to channel their dark energies. Aged and sturdy.");
                    ArrayList.add("IMPALE: Equip to dwarf card reduces defending card/s total entity level by 1. REVEAL: Two (2) Bungo at Tungkod cards, player reveals deck on hand.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_bungo_at_tungkod);
                    intent.putExtra("Pair1", R.drawable.card_nunosapunso);
                    intent.putExtra("Pair2", R.drawable.card_duwende);
                    intent.putExtra("Level", R.drawable.level_two_moon);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                } else if (textView.getText().equals("Mortal Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Tabak, Bawang, at Asin");
                    ArrayList.add("(Blade, Garlic, & Salt)");
                    ArrayList.add("Kontra Card");
                    ArrayList.add("Mortal");
                    ArrayList.add("It is said that these items can be used to ward off or attack evil creatures like the Aswangs.");
                    ArrayList.add("NULLIFY: When equipped with a Mortal, all abilities of opposing cards are nullified and do not take effect. +1 to defense Entity Level.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_tabakbawangatasin);
                    intent.putExtra("Pair1", R.drawable.card_dante);
                    intent.putExtra("Pair2", R.drawable.card_amihan);
                    intent.putExtra("Level", R.drawable.level_two_sun);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                } else if (textView.getText().equals("Warrior Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Sibat at Sulo");
                    ArrayList.add("(Spear & Torch)");
                    ArrayList.add("Kontra Card");
                    ArrayList.add("Warrior");
                    ArrayList.add("\"By this torch, I can see in the darkness. By this spear, I can cut through the night.\"");
                    ArrayList.add("NULLIFY: When equipped with a Warrior, all abilities of opposing cards are nullified and do not take effect  +1 to defense Entity level.");
                    Intent intent = new Intent(EquipCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_sibatatsulo);
                    intent.putExtra("Pair1", R.drawable.card_dante);
                    intent.putExtra("Pair2", R.drawable.card_amihan);
                    intent.putExtra("Level", R.drawable.level_two_sun);
                    intent.putExtra("bgtext2", R.drawable.bg_carddetails_text_small);
                    startActivity(intent);
                }
            }
        });

    }
}