package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CardsDetails extends System {

    ImageView Card, Pair1, Pair2, Pair3, Pair4, Pair5, bgImg, Level, bgText, bgText2, bgText3, sigbinbg;
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
        bgImg = findViewById(R.id.bgimg);
        bgText = findViewById(R.id.bgtext);
        bgText2 = findViewById(R.id.bgtext2);
        bgText3 = findViewById(R.id.bgtext3);
        sigbinbg = findViewById(R.id.bgtext4);
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

        int bgtext = bundle.getInt("bgtext");
        int bgtext2 = bundle.getInt("bgtext2");
        int bgtext3 = bundle.getInt("bgtext3");
        int bgtext4 = bundle.getInt("bgtext4");
        int card = bundle.getInt("Card");
        int pair1 = bundle.getInt("Pair1");
        int pair2 = bundle.getInt("Pair2");
        int pair3 = bundle.getInt("Pair3");
        int pair4 = bundle.getInt("Pair4");
        int pair5 = bundle.getInt("Pair5");
        int level = bundle.getInt("Level");

        bgText.setImageResource(bgtext);
        bgText2.setImageResource(bgtext2);
        bgText3.setImageResource(bgtext3);
        sigbinbg.setImageResource(bgtext4);
        Card.setImageResource(card);
        Pair1.setImageResource(pair1);
        Pair2.setImageResource(pair2);
        Pair3.setImageResource(pair3);
        Pair4.setImageResource(pair4);
        Pair5.setImageResource(pair5);
        Level.setImageResource(level);

        String text1 = "Artifact";
        String text2 = "Use/Effect";
        String text3 = "Traits";
        String text4 = "Abilities";

        if (CardType.getText().equals("Lagim Card")){
            Sub4.setText(text3);
            Sub5.setText(text4);
            bgImg.setImageResource(R.drawable.bg_lagimcards);
        } else if (CardType.getText().equals("Lakas Card")){
            Sub4.setText(text3);
            Sub5.setText(text4);
            bgImg.setImageResource(R.drawable.bg_lakascards);
        } else if (CardType.getText().equals("Hiwaga Card")){
            Sub4.setText(text1);
            Sub5.setText(text2);
            bgImg.setImageResource(R.drawable.bg_hiwagacards);
        } else{
            Sub4.setText(text1);
            Sub5.setText(text2);
            bgImg.setImageResource(R.drawable.bg_kontracards);
        }

        Pair1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().equals("Mambabarang")){ //done
                    Card.setImageResource(R.drawable.card_altar_ng_kulam);
                    Name.setText("Altar ng Kulam");
                    SubName.setText("(Witch Altar)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("An altar of malevolent magic, upon which infernal sacrifices are made.");
                    Ability.setText("SUMMON: Two(2) Altar ng Kulam summons a witch card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_mambabarang);
                    Pair2.setImageResource(R.drawable.card_mangkukulam);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Mangkukulam")){ //done
                    Card.setImageResource(R.drawable.card_sumpangmanika);
                    Name.setText("Sumpa ng Manika");
                    SubName.setText("(Vodoo Doll)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("A worn and wretched doll, cursed to inflict misery and torment upon its owner's unfortunate victim.");
                    Ability.setText("SUMMON: Two(2) Sumpa ng Manika summons a witch card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_mambabarang);
                    Pair2.setImageResource(R.drawable.card_mangkukulam);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Alakdan at Alupihan") || (Name.getText().equals("Sumpa ng Manika") || (Name.getText().equals("Altar ng Kulam")))){ //done
                    Card.setImageResource(R.drawable.card_mambabarang);
                    Name.setText("Mambabarang");
                    SubName.setText("(Hex-Bringer)");
                    Level.setImageResource(R.drawable.level_five_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("Hailing form a highborn bloodline of witches, the evil Mambabarang uses insects as a medium to torture, kill, or inflict hexes upon their victims.");
                    Ability.setText("SOULREAPER: Defending player automatically lose 1 soul coin.");
                    Pair1.setImageResource(R.drawable.card_altar_ng_kulam);
                    Pair2.setImageResource(R.drawable.card_alakdan_at_alupihan);
                    Pair3.setImageResource(R.drawable.card_sumpangmanika);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                } else if (Name.getText().equals("Aswang")){ //done
                    Card.setImageResource(R.drawable.card_dugo_at_langis);
                    Name.setText("Dugo at Langis");
                    SubName.setText("(Blood & Oil)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Ghoul");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("Implements of  a wicked transfiguration. The odor is thick and pungent, like clotted infected wounds.");
                    Ability.setText("SUMMON: Two(2) Dugo at Langis summons a ghoul card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_aswang);
                    Pair2.setImageResource(R.drawable.card_manananggal);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Manananggal")){ //done
                    Card.setImageResource(R.drawable.card_tiktikatbuwan);
                    Name.setText("Tiktik at Buwan");
                    SubName.setText("(Black Crow & Full Moon)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Ghoul");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("The black crow caws forebodingly against the night sky, and the clouds part to reveal the full moon. A bad omen.");
                    Ability.setText("SUMMON: Two(2) Tiktik at Buwan summons a ghoul card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_aswang);
                    Pair2.setImageResource(R.drawable.card_manananggal);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Dugo at Langis") || (Name.getText().equals("Tiktik at Buwan"))){ //done
                    Card.setImageResource(R.drawable.card_aswang);
                    Name.setText("Aswang");
                    SubName.setText("(Ghoul)");
                    Level.setImageResource(R.drawable.level_four_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Ghoul");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("This beguiling shape-shifter feasts on both animal and human flesh and blood. It can roam freely in daylight, but is more powerful in the  darkness.");
                    Ability.setText("IMPALE: Defending cards/s total entity level reduced by 1.");
                    Pair1.setImageResource(R.drawable.card_dugo_at_langis);
                    Pair2.setImageResource(R.drawable.card_tiktikatbuwan);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Puno ng Acacia")){ //done
                    Card.setImageResource(R.drawable.card_tikbalang);
                    Name.setText("Tikbalang");
                    SubName.setText("(Werehouse)");
                    Level.setImageResource(R.drawable.level_three_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Giant");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("A sly beast with the head and legs of a horse and the torso of a man. The Tikbalang is notorious for deceiving humans and leading travelers astray.");
                    Ability.setText("SILENCE AMIHAN:  When this card becomes a Dweller on a Baryo, the player’s AMIHAN card is disabled for 1 turn.");
                    Pair5.setImageResource(R.drawable.card_punongacacia);
                    Pair1.setImageDrawable(null);
                    Pair2.setImageDrawable(null);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText.setImageDrawable(null);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Bungo at Tungkod")){ //done
                    Card.setImageResource(R.drawable.card_nunosapunso);
                    Name.setText("Nuno Sa Punso");
                    SubName.setText("(Goblin of the Mound)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Dwarf");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("An elder creature that lives underground in mounds, it is sinister and invokes tragedy upon those who would dare intrude upon its dwelling.");
                    Ability.setText("AGGRESSIVE STUN: When this card becomes a Dweller on a Baryo, it disables the first 2 cards from the line of defense, together with their equip cards. This ability remains active  while dwelling in the Baryo.");
                    Pair5.setImageResource(R.drawable.card_bungo_at_tungkod);
                    Pair1.setImageDrawable(null);
                    Pair2.setImageDrawable(null);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText.setImageDrawable(null);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Albularyo") || (Name.getText().equals("Espiritista"))){ //done
                    Card.setImageResource(R.drawable.card_orasyonatinsenso);
                    Name.setText("Orasyon at Insenso");
                    SubName.setText("(Prayer & Incense)");
                    CardType.setText("Kontra Card");
                    Archetype.setText("Medium");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("The prayers of the faithful will be heard, and divine protection will be bestowed upon those who believe.");
                    Ability.setText("NULLIFY: When equipped with a Shaman, all abilities of opposing cards are nullified and do not take effect.");
                    Pair1.setImageResource(R.drawable.card_espiritista);
                    Pair2.setImageResource(R.drawable.card_albularyo);
                    Pair3.setImageDrawable(null);
                    Pair4.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Orasyon at Insenso") || (Name.getText().equals("Buntot Pagi"))){ //done
                    Card.setImageResource(R.drawable.card_espiritista);
                    Name.setText("Espiritista");
                    SubName.setText("(Invoker)");
                    CardType.setText("Lakas Card");
                    Archetype.setText("Medium");
                    Level.setImageResource(R.drawable.level_five_sun);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("The Espiritista is a warden of faith, invoking spirits and divine powers to heal the sick, cast out evil, and perform miraculous deeds.");
                    Ability.setText("PREDICT: After a successful defense, player may choose to guess 1 card in opponent’s hand. If correct: Discard selected card. Claim 1 soul from opponent. If incorrect: Pay 1 soul to the opponent.");
                    Pair1.setImageResource(R.drawable.card_orasyonatinsenso);
                    Pair2.setImageResource(R.drawable.card_buntot_pagi);
                    Pair3.setImageResource(R.drawable.card_gasera);
                    Pair4.setImageResource(R.drawable.card_agimat);
                    bgImg.setImageResource(R.drawable.bg_lakascards);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                } else if (Name.getText().equals("Amihan")){ //done
                    Card.setImageResource(R.drawable.card_tabakbawangatasin);
                    Name.setText("Tabak, Bawang, at Asin");
                    SubName.setText("(Blade, Garlic, & Salt)");
                    Level.setImageResource(R.drawable.level_two_sun);
                    CardType.setText("Kontra Card");
                    Archetype.setText("Mortal");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("It is said that these items can be used to ward off or attack evil creatures like the Aswangs.");
                    Ability.setText("NULLIFY: When equipped with a Mortal, all abilities of opposing cards are nullified and do not take effect. +1 to defense Entity Level.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageDrawable(null);
                    Pair4.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Tabak, Bawang, at Asin") || (Name.getText().equals("Sibat at Sulo") || (Name.getText().equals("Agimat") || (Name.getText().equals("Gasera"))))){ //done
                    Card.setImageResource(R.drawable.card_dante);
                    Name.setText("Dante");
                    SubName.setText("(Woodsman)");
                    Level.setImageResource(R.drawable.level_three_sun);
                    CardType.setText("Lakas Card");
                    Archetype.setText("Warrior");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("A young man known for his courage and devotion, Dante has sworn to use his strength and skill to defeat the vicious enitites of Lagim forest.");
                    Ability.setText("BOOST: Dante’s entity level is increased by 3 when  equipped with Amihan.");
                    Pair1.setImageResource(R.drawable.card_sibatatsulo);
                    Pair2.setImageResource(R.drawable.card_tabakbawangatasin);
                    Pair3.setImageResource(R.drawable.card_gasera);
                    Pair4.setImageResource(R.drawable.card_agimat);
                    bgImg.setImageResource(R.drawable.bg_lakascards);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                } else if (Name.getText().equals("Dante")){ //done
                    Card.setImageResource(R.drawable.card_sibatatsulo);
                    Name.setText("Sibat at Sulo");
                    SubName.setText("(Spear & Torch)");
                    Level.setImageResource(R.drawable.level_two_sun);
                    CardType.setText("Kontra Card");
                    Archetype.setText("Warrior");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("\"By this torch, I can see in the darkness. By this spear, I can cut through the night.\"");
                    Ability.setText("NULLIFY: When equipped with a Warrior, all abilities of opposing cards are nullified and do not take effect  +1 to defense Entity level.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageDrawable(null);
                    Pair4.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                }


            }

    });

        Pair2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().equals("Mambabarang")){ //done
                    Card.setImageResource(R.drawable.card_alakdan_at_alupihan);
                    Name.setText("Alakdan at Alupihan");
                    SubName.setText("(Scorpion & Centipede)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("Vicious predators that poison their prey with incredibly toxic venom; each one a fitting medium for unspeakable witchcraft.");
                    Ability.setText("IMPALE: Equip to witch card, reduces defending cards/s total entity level by 1.");
                    Pair1.setImageResource(R.drawable.card_mambabarang);
                    Pair2.setImageResource(R.drawable.card_mangkukulam);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Mangkukulam")) { //done
                    Card.setImageResource(R.drawable.card_altar_ng_kulam);
                    Name.setText("Altar ng Kulam");
                    SubName.setText("(Witch Altar)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("An altar of malevolent magic, upon which infernal sacrifices are made.");
                    Ability.setText("SUMMON: Two(2) Altar ng Kulam summons a witch card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_mambabarang);
                    Pair2.setImageResource(R.drawable.card_mangkukulam);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Sumpa ng Manika") || (Name.getText().equals("Alakdan at Alupihan")) || (Name.getText().equals("Altar ng Kulam"))) { //done
                    Card.setImageResource(R.drawable.card_mangkukulam);
                    Name.setText("Mangkukulam");
                    SubName.setText("(Witch)");
                    CardType.setText("Lagim Card");
                    Archetype.setText("Witch");
                    Level.setImageResource(R.drawable.level_five_moon);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("The vengeful mangkukulam uses black magic to cast curses, and is known to hex victims using a vodoo doll, needles, and a strand of the victim's hair.");
                    Ability.setText("SOULREAPER: Defending player automatically lose 1 soul coin.");
                    Pair1.setImageResource(R.drawable.card_sumpangmanika);
                    Pair2.setImageResource(R.drawable.card_altar_ng_kulam);
                    Pair3.setImageResource(R.drawable.card_alakdan_at_alupihan);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                } else if(Name.getText().equals("Aswang")){ //done
                    Card.setImageResource(R.drawable.card_tiktikatbuwan);
                    Name.setText("Tiktik at Buwan");
                    SubName.setText("(Black Crow & Full Moon)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Ghoul");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("The black crow caws forebodingly against the night sky, and the clouds part to reveal the full moon. A bad omen.");
                    Ability.setText("SUMMON: Two(2) Tiktik at Buwan summons a ghoul card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_aswang);
                    Pair2.setImageResource(R.drawable.card_manananggal);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Manananggal")){ //done
                    Card.setImageResource(R.drawable.card_dugo_at_langis);
                    Name.setText("Dugo at Langis");
                    SubName.setText("(Blood & Oil)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Ghoul");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("Implements of  a wicked transfiguration. The odor is thick and pungent, like clotted infected wounds.");
                    Ability.setText("SUMMON: Two(2) Dugo at Langis summons a ghoul card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_aswang);
                    Pair2.setImageResource(R.drawable.card_manananggal);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Tiktik at Buwan") || (Name.getText().equals("Dugo at Langis"))){ //done
                    Card.setImageResource(R.drawable.card_manananggal);
                    Name.setText("Manananggal");
                    SubName.setText("(Viscera Sucker)");
                    CardType.setText("Lagim Card");
                    Archetype.setText("Ghoul");
                    Level.setImageResource(R.drawable.level_four_moon);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("Disguised during the day, at night detaches its torso and sprouts bat-like wings to hunt. It commonly feeds on the unborn babies of pregnant women.");
                    Ability.setText("IMPALE: Defending cards/s total entity level reduced by 1.");
                    Pair1.setImageResource(R.drawable.card_tiktikatbuwan);
                    Pair2.setImageResource(R.drawable.card_dugo_at_langis);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Puno ng Acacia")){ //done
                    Card.setImageResource(R.drawable.card_kapre);
                    Name.setText("Kapre");
                    SubName.setText("(Tree-Dweller)");
                    Level.setImageResource(R.drawable.level_three_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Giant");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("Beastly cigar-smoking giants inhabiting large trees, the peculiar Kapres are mischievous to children, and are easily smitten with youthful maidens.");
                    Ability.setText("SILENCE DANTE: When this card becomes a Dweller on a Baryo, the player’s DANTE card is disabled for 1 turn and cannot be used to defend.");
                    Pair5.setImageResource(R.drawable.card_punongacacia);
                    Pair1.setImageDrawable(null);
                    Pair2.setImageDrawable(null);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText2.setImageDrawable(null);
                    bgText.setImageDrawable(null);
                    bgText3.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Bungo at Tungkod")){ //done
                    Card.setImageResource(R.drawable.card_nunosapunso);
                    Name.setText("Duwende");
                    SubName.setText("((Hobgoblin)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Dwarf");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("Tiny, human-like beings that reside both in forests and in human dwelings, Duwendes are spiteful, and bestow illness and misfortune when offended. ");
                    Ability.setText("STUN: After succcessful defense, select and keep a random card from another player’s hand. If it is a Lagim card, discard it to the Graveyard pile.  ");
                    Pair5.setImageResource(R.drawable.card_bungo_at_tungkod);
                    Pair1.setImageDrawable(null);
                    Pair2.setImageDrawable(null);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText3.setImageResource(R.drawable.bg_carddetails_text_small);
                    bgText2.setImageDrawable(null);
                    bgText.setImageDrawable(null);
                } else if (Name.getText().equals("Albularyo") || (Name.getText().equals("Espiritista"))){ //done
                    Card.setImageResource(R.drawable.card_buntot_pagi);
                    Name.setText("Buntot Pagi");
                    SubName.setText("(Stingray Tail)");
                    CardType.setText("Kontra Card");
                    Archetype.setText("Medium");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("The stingray tail is an effective talisman and fine weapon against certain evil beings.");
                    Ability.setText("NULLIFY: When equipped with a Shaman, all abilities of opposing cards are nullified and do not take effect. +1 to defense Entity Level.");
                    Pair1.setImageResource(R.drawable.card_espiritista);
                    Pair2.setImageResource(R.drawable.card_albularyo);
                    Pair3.setImageDrawable(null);
                    Pair4.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Orasyon at Insenso") || (Name.getText().equals("Buntot Pagi"))){ //done
                    Card.setImageResource(R.drawable.card_albularyo);
                    Name.setText("Albularyo");
                    SubName.setText("((Shaman)");
                    CardType.setText("Lakas Card");
                    Archetype.setText("Medium");
                    Level.setImageResource(R.drawable.level_five_sun);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("The Albularyo comes form an old and noble clan of healers whose traditional healing arts are known to cure even the most supernatural ailments.");
                    Ability.setText("DISSOLVE: After successful defense, select and keep a random card from another player’s hand. If it is a Lagim card, discard it to the Graveyard pile.");
                    Pair1.setImageResource(R.drawable.card_orasyonatinsenso);
                    Pair2.setImageResource(R.drawable.card_buntot_pagi);
                    Pair3.setImageResource(R.drawable.card_agimat);
                    Pair4.setImageResource(R.drawable.card_gasera);
                    bgImg.setImageResource(R.drawable.bg_lakascards);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                } else if (Name.getText().equals("Amihan")){ //done
                    Card.setImageResource(R.drawable.card_sibatatsulo);
                    Name.setText("Sibat at Sulo");
                    SubName.setText("(Spear & Torch)");
                    Level.setImageResource(R.drawable.level_two_sun);
                    CardType.setText("Kontra Card");
                    Archetype.setText("Warrior");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("\"By this torch, I can see in the darkness. By this spear, I can cut through the night.\"");
                    Ability.setText("NULLIFY: When equipped with a Warrior, all abilities of opposing cards are nullified and do not take effect  +1 to defense Entity level.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageDrawable(null);
                    Pair4.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                } else if (Name.getText().equals("Tabak, Bawang, at Asin") || (Name.getText().equals("Sibat at Sulo") || (Name.getText().equals("Agimat") || (Name.getText().equals("Gasera"))))){ //done
                    Card.setImageResource(R.drawable.card_amihan);
                    Name.setText("Amihan");
                    SubName.setText("(Lightbringer)");
                    CardType.setText("Lakas Card");
                    Archetype.setText("Mortal");
                    Level.setImageResource(R.drawable.level_three_sun);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("Fair and gentle lady of the Barrio, Amihan's radiant beauty is known far and wide; alluring all, from the noblest of men to even the most hideous of giants.");
                    Ability.setText("ENCHANT: After successful defense, sacrifice any 1 Hiwaga card from hand to the Graveyard pile to enchant (aquire) a Giant card from the deck to the dwell on another Baryo. ");
                    Pair1.setImageResource(R.drawable.card_tabakbawangatasin);
                    Pair2.setImageResource(R.drawable.card_sibatatsulo);
                    Pair3.setImageResource(R.drawable.card_agimat);
                    Pair4.setImageResource(R.drawable.card_gasera);
                    bgImg.setImageResource(R.drawable.bg_lakascards);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                } else if (Name.getText().equals("Dante")){ //done
                    Card.setImageResource(R.drawable.card_tabakbawangatasin);
                    Name.setText("Tabak, Bawang, at Asin");
                    SubName.setText("(Blade, Garlic, & Salt)");
                    Level.setImageResource(R.drawable.level_two_sun);
                    CardType.setText("Kontra Card");
                    Archetype.setText("Mortal");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("It is said that these items can be used to ward off or attack evil creatures like the Aswangs.");
                    Ability.setText("NULLIFY: When equipped with a Mortal, all abilities of opposing cards are nullified and do not take effect. +1 to defense Entity Level.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageDrawable(null);
                    Pair4.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                }
            }
        });

        Pair3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().equals("Mambabarang")){ //done
                    Card.setImageResource(R.drawable.card_sumpangmanika);
                    Name.setText("Sumpa ng Manika");
                    SubName.setText("(Vodoo Doll)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("A worn and wretched doll, cursed to inflict misery and torment upon its owner's unfortunate victim.");
                    Ability.setText("SUMMON: Two(2) Sumpa ng Manika summons a witch card from forest deck.");
                    Pair1.setImageResource(R.drawable.card_mambabarang);
                    Pair2.setImageResource(R.drawable.card_mangkukulam);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Mangkukulam")) { //done
                    Card.setImageResource(R.drawable.card_alakdan_at_alupihan);
                    Name.setText("Alakdan at Alupihan");
                    SubName.setText("(Scorpion & Centipede)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Witch");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("Vicious predators that poison their prey with incredibly toxic venom; each one a fitting medium for unspeakable witchcraft.");
                    Ability.setText("IMPALE: Equip to witch card, reduces defending cards/s total entity level by 1.");
                    Pair1.setImageResource(R.drawable.card_mambabarang);
                    Pair2.setImageResource(R.drawable.card_mangkukulam);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Puno ng Acacia")){ //done
                    Card.setImageResource(R.drawable.card_bungisngis);
                    Name.setText("Bungisngis");
                    SubName.setText("(Cyclops)");
                    Level.setImageResource(R.drawable.level_three_moon);
                    CardType.setText("Lagim Card");
                    Archetype.setText("Giant");
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("A one-eyed giant that is always smiling, showing its monstrous teeth. It has a voracious appetite for animal meat and uses its superb hearing to hunt.");
                    Ability.setText("SILENCE: Amihan Card is disabled and cannot be used to defend.");
                    Pair5.setImageResource(R.drawable.card_punongacacia);
                    Pair1.setImageDrawable(null);
                    Pair2.setImageDrawable(null);
                    Pair3.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_lagimcards);
                    bgText3.setImageResource(R.drawable.bg_carddetails_text_small);
                    bgText2.setImageDrawable(null);
                    bgText.setImageDrawable(null);
                } else if (Name.getText().equals("Albularyo")){ //done
                    Card.setImageResource(R.drawable.card_agimat);
                    Name.setText("Agimat");
                    SubName.setText("(Amulet)");
                    CardType.setText("Special Kontra Card");
                    Archetype.setText("Special");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("A rare charm of mystical power that protects the bearer from evil curses and sinister sorcery. It feels remarkably reassuring, and warm to the touch.");
                    Ability.setText("NULLIFY: When equipped, this Amulet nullifies all negative abilities. Increase the entity level of this card by the [x]number of active defense cards in the Baryo.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageResource(R.drawable.card_espiritista);
                    Pair4.setImageResource(R.drawable.card_albularyo);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Espiritista") || (Name.getText().equals("Dante"))){ //done
                    Card.setImageResource(R.drawable.card_gasera);
                    Name.setText("Gasera");
                    SubName.setText("(Gas Lamp)");
                    CardType.setText("Special Kontra Card");
                    Archetype.setText("Special");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("The lamp bathes you in a warm light, illuminating the path through the dark forest.");
                    Ability.setText("PEEK: Take a peek on the top 2 cards from the Forest. Player can switch the order of the cards.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageResource(R.drawable.card_espiritista);
                    Pair4.setImageResource(R.drawable.card_albularyo);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Amihan")){ //done
                    Card.setImageResource(R.drawable.card_agimat);
                    Name.setText("Agimat");
                    SubName.setText("(Amulet)");
                    CardType.setText("Special Kontra Card");
                    Archetype.setText("Special");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("A rare charm of mystical power that protects the bearer from evil curses and sinister sorcery. It feels remarkably reassuring, and warm to the touch.");
                    Ability.setText("NULLIFY: When equipped, this Amulet nullifies all negative abilities. Increase the entity level of this card by the [x]number of active defense cards in the Baryo.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageResource(R.drawable.card_espiritista);
                    Pair4.setImageResource(R.drawable.card_albularyo);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Agimat") || (Name.getText().equals("Gasera"))){ //done
                    Card.setImageResource(R.drawable.card_espiritista);
                    Name.setText("Espiritista");
                    SubName.setText("(Invoker)");
                    CardType.setText("Lakas Card");
                    Archetype.setText("Medium");
                    Level.setImageResource(R.drawable.level_five_sun);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("The Espiritista is a warden of faith, invoking spirits and divine powers to heal the sick, cast out evil, and perform miraculous deeds.");
                    Ability.setText("PREDICT: After a successful defense, player may choose to guess 1 card in opponent’s hand. If correct: Discard selected card. Claim 1 soul from opponent. If incorrect: Pay 1 soul to the opponent.");
                    Pair1.setImageResource(R.drawable.card_orasyonatinsenso);
                    Pair2.setImageResource(R.drawable.card_buntot_pagi);
                    Pair3.setImageResource(R.drawable.card_gasera);
                    Pair4.setImageResource(R.drawable.card_agimat);
                    bgImg.setImageResource(R.drawable.bg_lakascards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                }
            }
        });

        Pair4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().equals("Albularyo") || (Name.getText().equals("Amihan"))){ //done
                    Card.setImageResource(R.drawable.card_gasera);
                    Name.setText("Gasera");
                    SubName.setText("(Gas Lamp)");
                    CardType.setText("Special Kontra Card");
                    Archetype.setText("Special");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("The lamp bathes you in a warm light, illuminating the path through the dark forest.");
                    Ability.setText("PEEK: Take a peek on the top 2 cards from the Forest. Player can switch the order of the cards.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageResource(R.drawable.card_espiritista);
                    Pair4.setImageResource(R.drawable.card_albularyo);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Espiritista") || (Name.getText().equals("Dante"))){ //done
                    Card.setImageResource(R.drawable.card_agimat);
                    Name.setText("Agimat");
                    SubName.setText("(Amulet)");
                    CardType.setText("Special Kontra Card");
                    Archetype.setText("Special");
                    Level.setImageResource(R.drawable.level_two_sun);
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("A rare charm of mystical power that protects the bearer from evil curses and sinister sorcery. It feels remarkably reassuring, and warm to the touch.");
                    Ability.setText("NULLIFY: When equipped, this Amulet nullifies all negative abilities. Increase the entity level of this card by the [x]number of active defense cards in the Baryo.");
                    Pair1.setImageResource(R.drawable.card_dante);
                    Pair2.setImageResource(R.drawable.card_amihan);
                    Pair3.setImageResource(R.drawable.card_espiritista);
                    Pair4.setImageResource(R.drawable.card_albularyo);
                    bgImg.setImageResource(R.drawable.bg_kontracards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Gasera") || (Name.getText().equals("Agimat"))){
                    Card.setImageResource(R.drawable.card_albularyo);
                    Name.setText("Albularyo");
                    SubName.setText("((Shaman)");
                    CardType.setText("Lakas Card");
                    Archetype.setText("Medium");
                    Level.setImageResource(R.drawable.level_five_sun);
                    Sub4.setText("Traits");
                    Sub5.setText("Abilities");
                    Traits.setText("The Albularyo comes form an old and noble clan of healers whose traditional healing arts are known to cure even the most supernatural ailments.");
                    Ability.setText("DISSOLVE: After successful defense, select and keep a random card from another player’s hand. If it is a Lagim card, discard it to the Graveyard pile.");
                    Pair1.setImageResource(R.drawable.card_orasyonatinsenso);
                    Pair2.setImageResource(R.drawable.card_buntot_pagi);
                    Pair3.setImageResource(R.drawable.card_agimat);
                    Pair4.setImageResource(R.drawable.card_gasera);
                    bgImg.setImageResource(R.drawable.bg_lakascards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                }
            }
        });

        Pair5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().equals("Kapre") || (Name.getText().equals("Tikbalang") || (Name.getText().equals("Bungisngis")))){ //done
                    Card.setImageResource(R.drawable.card_punongacacia);
                    Name.setText("Puno ng Acacia");
                    SubName.setText("(Acacia Tree)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Giant");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("A strong creepy, gigantic tree to shelter strong, gigantic beings.");
                    Ability.setText("IMPALE: Equip to Giant card, reduces defending card/s total entity level by 1.");
                    Pair1.setImageResource(R.drawable.card_tikbalang);
                    Pair2.setImageResource(R.drawable.card_kapre);
                    Pair3.setImageResource(R.drawable.card_bungisngis);
                    Pair5.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText.setImageResource(R.drawable.bg_carddetails_text_medium);
                    bgText2.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                } else if (Name.getText().equals("Duwende") || (Name.getText().equals("Nuno Sa Punso"))){ //done
                    Card.setImageResource(R.drawable.card_bungo_at_tungkod);
                    Name.setText("Bungo at Tungkod");
                    SubName.setText("(Skull & Staff)");
                    Level.setImageResource(R.drawable.level_two_moon);
                    CardType.setText("Hiwaga Card");
                    Archetype.setText("Dwarf");
                    Sub4.setText("Artifact");
                    Sub5.setText("Use/Effect");
                    Traits.setText("Instruments of magic utilized by elder beings to channel their dark energies. Aged and sturdy.");
                    Ability.setText("IMPALE: Equip to dwarf card reduces defending card/s total entity level by 1. REVEAL: Two(2) Bungo at Tungkod cards, player reveals deck on hand.");
                    Pair1.setImageResource(R.drawable.card_nunosapunso);
                    Pair2.setImageResource(R.drawable.card_duwende);
                    Pair5.setImageDrawable(null);
                    bgImg.setImageResource(R.drawable.bg_hiwagacards);
                    bgText2.setImageResource(R.drawable.bg_carddetails_text_small);
                    bgText.setImageDrawable(null);
                    bgText3.setImageDrawable(null);
                }
            }
        });
    }
}