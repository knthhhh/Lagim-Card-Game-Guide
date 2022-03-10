package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BattleCardsList extends System {

    TextView textView;
    ImageView imageView1, imageView2, imageView3, bgimg, Header;
    ArrayList<String> ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_cards_list);
        hideSystemBars();

        ArrayList = new ArrayList<>();
        Bundle bundle = getIntent().getExtras();

        textView = findViewById(R.id.Header1);
        imageView1 = findViewById(R.id.card1);
        imageView2 = findViewById(R.id.card2);
        imageView3 = findViewById(R.id.card3);
        Header = findViewById(R.id.titlebg);
        bgimg = findViewById(R.id.bgimg);

        textView.setText(getIntent().getStringExtra("Archetype"));
        int bg = bundle.getInt("bg");
        int card1 = bundle.getInt("card1");
        int card2 = bundle.getInt("card2");
        int card3 = bundle.getInt("card3");
        int bgheader = bundle.getInt("titlebg");

        bgimg.setImageResource(bg);
        imageView1.setImageResource(card1);
        imageView2.setImageResource(card2);
        imageView3.setImageResource(card3);
        Header.setImageResource(bgheader);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Witch Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Mambabarang");
                    ArrayList.add("(Hex-Bringer)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Witch");
                    ArrayList.add("Hailing form a highborn bloodline of witches, the evil Mambabarang uses insects as a medium to torture, kill, or inflict hexes upon their victims.");
                    ArrayList.add("SOULREAPER: Defending player automatically lose 1 soul coin.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_mambabarang);
                    intent.putExtra("Pair1", R.drawable.card_mangkukulam);
                    intent.putExtra("Pair2", R.drawable.card_alakdan_at_alupihan);
                    intent.putExtra("Pair3", R.drawable.card_sumpangmanika);
                    intent.putExtra("Pair4", R.drawable.card_altar_ng_kulam);
                    intent.putExtra("Level", R.drawable.level_five);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Medium Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Albularyo");
                    ArrayList.add("(Shaman)");
                    ArrayList.add("Lakas Card");
                    ArrayList.add("Medium");
                    ArrayList.add("The Albularyo comes form an old and noble clan of healers whose traditional healing arts are known to cure even the most supernatural ailments.");
                    ArrayList.add("DISSOLVE: After successful defense, select and keep a random card from another player’s hand. If it is a Lagim card, discard it to the Graveyard pile.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_albularyo);
                    intent.putExtra("Pair1", R.drawable.card_espiritista);
                    intent.putExtra("Pair2", R.drawable.card_orasyonatinsenso);
                    intent.putExtra("Pair3", R.drawable.card_buntot_pagi);
                    intent.putExtra("Pair4", R.drawable.card_agimat);
                    intent.putExtra("Pair6", R.drawable.card_gasera);
                    intent.putExtra("Level", R.drawable.level_five);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_large);
                    startActivity(intent);
                }else if (textView.getText().equals("Ghoul Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Mananggal");
                    ArrayList.add("(Viscera Sucker)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Ghoul");
                    ArrayList.add("Disguised during the day, at night detaches its torso and sprouts bat-like wings to hunt. It commonly feeds on the unborn babies of pregnant women.");
                    ArrayList.add("IMPALE: Defending cards/s total entity level reduced by 1.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_manananggal);
                    intent.putExtra("Pair1", R.drawable.card_aswang);
                    intent.putExtra("Pair2", R.drawable.card_dugo_at_langis);
                    intent.putExtra("Pair3", R.drawable.card_tiktikatbuwan);
                    intent.putExtra("Level", R.drawable.level_four);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Mortal Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Amihan");
                    ArrayList.add("(Lightbringer)");
                    ArrayList.add("Lakas Card");
                    ArrayList.add("Mortal");
                    ArrayList.add("Fair and gentle lady of the Barrio, Amihan's radiant beauty is known far and wide; alluring all, from the noblest of men to even the most hideous of giants.");
                    ArrayList.add("ENCHANT: After successful defense, sacrifice any 1 Hiwaga card from hand to the Graveyard pile to enchant (aquire) a Giant card from the deck to the dwell on another Baryo.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_amihan);
                    intent.putExtra("Pair1", R.drawable.card_tabakbawangatasin);
                    intent.putExtra("Pair2", R.drawable.card_sibatatsulo);
                    intent.putExtra("Pair3", R.drawable.card_agimat);
                    intent.putExtra("Pair4", R.drawable.card_gasera);
                    intent.putExtra("Level", R.drawable.level_three);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Giant Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Kapre");
                    ArrayList.add("(Tree-Dweller)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Giant");
                    ArrayList.add("Beastly cigar-smoking giants inhabiting large trees, the peculiar Kapres are mischievous to children, and are easily smitten with youthful maidens.");
                    ArrayList.add("SILENCE DANTE: When this card becomes a Dweller on a Baryo, the player’s DANTE card is disabled for 1 turn and cannot be used to defend.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_kapre);
                    intent.putExtra("Pair1", R.drawable.card_tikbalang);
                    intent.putExtra("Pair2", R.drawable.card_bungisngis);
                    intent.putExtra("Pair3", R.drawable.card_punongacacia);
                    intent.putExtra("Level", R.drawable.level_three);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Warrior Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Dante");
                    ArrayList.add("(Woodsman)");
                    ArrayList.add("Lakas Card");
                    ArrayList.add("Warrior");
                    ArrayList.add("A young man known for his courage and devotion, Dante has sworn to use his strength and skill to defeat the vicious enitites of Lagim forest.");
                    ArrayList.add("BOOST: Dante’s entity level is increased by 3 when  equipped with Amihan.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_dante);
                    intent.putExtra("Pair1", R.drawable.card_sibatatsulo);
                    intent.putExtra("Pair2", R.drawable.card_tabakbawangatasin);
                    intent.putExtra("Pair3", R.drawable.card_gasera);
                    intent.putExtra("Pair4", R.drawable.card_agimat);
                    intent.putExtra("Level", R.drawable.level_three);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Dwarf Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Duwende");
                    ArrayList.add("(Hobgoblin)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Dwarf");
                    ArrayList.add("Tiny, human-like beings that reside both in forests and in human dwelings, Duwendes are spiteful, and bestow illness and misfortune when offended. ");
                    ArrayList.add("STUN: After succcessful defense, select and keep a random card from another player’s hand. If it is a Lagim card, discard it to the Graveyard pile.  ");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_duwende);
                    intent.putExtra("Pair1", R.drawable.card_nunosapunso);
                    intent.putExtra("Pair2", R.drawable.card_bungo_at_tungkod);
                    intent.putExtra("Level", R.drawable.level_two);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_small);
                    startActivity(intent);
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Witch Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Mangkukulam");
                    ArrayList.add("(Witch)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Witch");
                    ArrayList.add("The vengeful mangkukulam uses black magic to cast curses, and is known to hex victims using a vodoo doll, needles, and a strand of the victim's hair.");
                    ArrayList.add("SOULREAPER: Defending player automatically lose 1 soul coin.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_mangkukulam);
                    intent.putExtra("Pair1", R.drawable.card_mambabarang);
                    intent.putExtra("Pair2", R.drawable.card_alakdan_at_alupihan);
                    intent.putExtra("Pair3", R.drawable.card_sumpangmanika);
                    intent.putExtra("Pair4", R.drawable.card_altar_ng_kulam);
                    intent.putExtra("Level", R.drawable.level_five);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
            }else if (textView.getText().equals("Medium Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Espiritista");
                    ArrayList.add("(Invoker)");
                    ArrayList.add("Lakas Card");
                    ArrayList.add("Medium");
                    ArrayList.add("The Espiritista is a warden of faith, invoking spirits and divine powers to heal the sick, cast out evil, and perform miraculous deeds.");
                    ArrayList.add("PREDICT: After a successful defense, player may choose to guess 1 card in opponent’s hand. If correct: Discard selected card. Claim 1 soul from opponent. If incorrect: Pay 1 soul to the opponent.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_espiritista);
                    intent.putExtra("Pair1", R.drawable.card_albularyo);
                    intent.putExtra("Pair2", R.drawable.card_buntot_pagi);
                    intent.putExtra("Pair3", R.drawable.card_orasyonatinsenso);
                    intent.putExtra("Pair4", R.drawable.card_gasera);
                    intent.putExtra("Pair6", R.drawable.card_agimat);
                    intent.putExtra("Level", R.drawable.level_five);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_large);
                    startActivity(intent);
                }else if (textView.getText().equals("Ghoul Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Aswang");
                    ArrayList.add("(Ghoul)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Ghoul");
                    ArrayList.add("This beguiling shape-shifter feasts on both animal and human flesh and blood. It can roam freely in daylight, but is more powerful in the  darkness.");
                    ArrayList.add("IMPALE: Defending cards/s total entity level reduced by 1.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_aswang);
                    intent.putExtra("Pair1", R.drawable.card_manananggal);
                    intent.putExtra("Pair2", R.drawable.card_dugo_at_langis);
                    intent.putExtra("Pair3", R.drawable.card_tiktikatbuwan);
                    intent.putExtra("Level", R.drawable.level_four);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Giant Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Tikbalang");
                    ArrayList.add("(Werehouse)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Giant");
                    ArrayList.add("A sly beast with the head and legs of a horse and the torso of a man. The Tikbalang is notorious for deceiving humans and leading travelers astray.");
                    ArrayList.add("SILENCE AMIHAN:  When this card becomes a Dweller on a Baryo, the player’s AMIHAN card is disabled for 1 turn.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_tikbalang);
                    intent.putExtra("Pair1", R.drawable.card_kapre);
                    intent.putExtra("Pair2", R.drawable.card_bungisngis);
                    intent.putExtra("Pair3", R.drawable.card_punongacacia);
                    intent.putExtra("Level", R.drawable.level_three);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }else if (textView.getText().equals("Dwarf Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Nuno Sa Punso");
                    ArrayList.add("(Goblin of the Mound)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Dwarf");
                    ArrayList.add("An elder creature that lives underground in mounds, it is sinister and invokes tragedy upon those who would dare intrude upon its dwelling.");
                    ArrayList.add("AGGRESSIVE STUN: When this card becomes a Dweller on a Baryo, it disables the first 2 cards from the line of defense, together with their equip cards. This ability remains active  while dwelling in the Baryo.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_nunosapunso);
                    intent.putExtra("Pair1", R.drawable.card_duwende);
                    intent.putExtra("Pair2", R.drawable.card_bungo_at_tungkod);
                    intent.putExtra("Level", R.drawable.level_two);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_small);
                    startActivity(intent);
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals("Giant Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Bungisngis");
                    ArrayList.add("(Cyclops)");
                    ArrayList.add("Lagim Card");
                    ArrayList.add("Giant");
                    ArrayList.add("A one-eyed giant that is always smiling, showing its monstrous teeth. It has a voracious appetite for animal meat and uses its superb hearing to hunt.");
                    ArrayList.add("SILENCE: Amihan Card is disabled and cannot be used to defend.");
                    Intent intent = new Intent(BattleCardsList.this, CardsDetails.class);
                    intent.putExtra("CardName",ArrayList.get(0));
                    intent.putExtra("SubName",ArrayList.get(1));
                    intent.putExtra("CardType",ArrayList.get(2));
                    intent.putExtra("Archetype",ArrayList.get(3));
                    intent.putExtra("Traits",ArrayList.get(4));
                    intent.putExtra("Ability",ArrayList.get(5));
                    intent.putExtra("Card", R.drawable.card_bungisngis);
                    intent.putExtra("Pair1", R.drawable.card_tikbalang);
                    intent.putExtra("Pair2", R.drawable.card_kapre);
                    intent.putExtra("Pair3", R.drawable.card_punongacacia);
                    intent.putExtra("Level", R.drawable.level_three);
                    intent.putExtra("bgimg", R.drawable.bg_card);
                    intent.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(intent);
                }
            }
        });
    }
}