package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BattleCardsList extends System {

    TextView textView;
    ImageView imageView1, imageView2, imageView3, bgimg;
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

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList.clear();
                ArrayList.add("Mambabarang");
                ArrayList.add("(Hex-Bringer)");
                ArrayList.add("Lagim Card");
                ArrayList.add("Witch");
                ArrayList.add("Hailing form a highborn bloodline of witches, the evil Mambabarang uses insects as a medium to torture, kill, or inflict hexes upon their victims.");
                ArrayList.add("SOULREAPER: Defending player automatically lose 1 soul coin.");
                if (textView.getText().equals("Witch Archetype")){
                    Intent mambabarang = new Intent(BattleCardsList.this, CardsDetails.class);
                    mambabarang.putExtra("CardName",ArrayList.get(0));
                    mambabarang.putExtra("SubName",ArrayList.get(1));
                    mambabarang.putExtra("CardType",ArrayList.get(2));
                    mambabarang.putExtra("Archetype",ArrayList.get(3));
                    mambabarang.putExtra("Traits",ArrayList.get(4));
                    mambabarang.putExtra("Ability",ArrayList.get(5));
                    mambabarang.putExtra("Card", R.drawable.card_mambabarang);
                    mambabarang.putExtra("Pair1", R.drawable.card_mangkukulam);
                    mambabarang.putExtra("Pair2", R.drawable.card_alakdan_at_alupihan);
                    mambabarang.putExtra("Pair3", R.drawable.card_sumpangmanika);
                    mambabarang.putExtra("Pair4", R.drawable.card_altar_ng_kulam);
                    mambabarang.putExtra("Level", R.drawable.level_five);
                    mambabarang.putExtra("bgimg", R.drawable.bg_card);
                    mambabarang.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(mambabarang);
                }else if (textView.getText().equals("Medium Archetype")){
                    ArrayList.clear();
                    ArrayList.add("Albularyo");
                    ArrayList.add("(Shaman)");
                    ArrayList.add("Lakas Card");
                    ArrayList.add("Medium");
                    ArrayList.add("The Albularyo comes form an old and noble clan of healers whose traditional healing arts are known to cure even the most supernatural ailments.");
                    ArrayList.add("DISSOLVE: After successful defense, select and keep a random card from another player’s hand. If it is a Lagim card, discard it to the Graveyard pile.");
                    Intent mambabarang = new Intent(BattleCardsList.this, CardsDetails.class);
                    mambabarang.putExtra("CardName",ArrayList.get(0));
                    mambabarang.putExtra("SubName",ArrayList.get(1));
                    mambabarang.putExtra("CardType",ArrayList.get(2));
                    mambabarang.putExtra("Archetype",ArrayList.get(3));
                    mambabarang.putExtra("Traits",ArrayList.get(4));
                    mambabarang.putExtra("Ability",ArrayList.get(5));
                    mambabarang.putExtra("Card", R.drawable.card_albularyo);
                    mambabarang.putExtra("Pair1", R.drawable.card_espiritista);
                    mambabarang.putExtra("Pair2", R.drawable.card_orasyonatinsenso);
                    mambabarang.putExtra("Pair3", R.drawable.card_buntot_pagi);
                    mambabarang.putExtra("Pair4", R.drawable.card_agimat);
                    mambabarang.putExtra("bgimg", R.drawable.bg_card);
                    mambabarang.putExtra("bgtext", R.drawable.bg_card_text_medium);
                    startActivity(mambabarang);
                }
            }
        });
    }
}