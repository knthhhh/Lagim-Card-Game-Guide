package com.example.lagimcardgameguideapp2;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.skydoves.expandablelayout.ExpandableLayout;

public class FAQs extends System {

    DrawerLayout drawerLayout;
    AutoCompleteTextView autoCompleteTextView;
    RelativeLayout a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27;
    EditText Message;
    TextView Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        hideSystemBars();

        a1 = findViewById(R.id.answer1);
        a2 = findViewById(R.id.answer2);
        a3 = findViewById(R.id.answer3);
        a4 = findViewById(R.id.answer4);
        a5 = findViewById(R.id.answer5);
        a6 = findViewById(R.id.answer6);
        a7 = findViewById(R.id.answer7);
        a8 = findViewById(R.id.answer8);
        a9 = findViewById(R.id.answer9);
        a10 = findViewById(R.id.answer10);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a1.getVisibility() == View.GONE){
                    expand(a1);
                    a1.setVisibility(View.VISIBLE);
                    b1.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a1);
                    a1.setVisibility(View.GONE);
                    b1.setImageResource(R.drawable.ic_down);
                    overridePendingTransition(0, 0);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a2.getVisibility() == View.GONE){
                    expand(a2);
                    a2.setVisibility(View.VISIBLE);
                    b2.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a2);
                    a2.setVisibility(View.GONE);
                    b2.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a3.getVisibility() == View.GONE){
                    expand(a3);
                    a3.setVisibility(View.VISIBLE);
                    b3.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a3);
                    a3.setVisibility(View.GONE);
                    b3.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a4.getVisibility() == View.GONE){
                    expand(a4);
                    a4.setVisibility(View.VISIBLE);
                    b4.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a4);
                    a4.setVisibility(View.GONE);
                    b4.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a5.getVisibility() == View.GONE){
                    expand(a5);
                    a5.setVisibility(View.VISIBLE);
                    b5.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a5);
                    a5.setVisibility(View.GONE);
                    b5.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a6.getVisibility() == View.GONE){
                    expand(a6);
                    a6.setVisibility(View.VISIBLE);
                    b6.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a6);
                    a6.setVisibility(View.GONE);
                    b6.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a7.getVisibility() == View.GONE){
                    expand(a7);
                    a7.setVisibility(View.VISIBLE);
                    b7.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a7);
                    a7.setVisibility(View.GONE);
                    b7.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a8.getVisibility() == View.GONE){
                    expand(a8);
                    a8.setVisibility(View.VISIBLE);
                    b8.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a8);
                    a8.setVisibility(View.GONE);
                    b8.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a9.getVisibility() == View.GONE){
                    expand(a9);
                    a9.setVisibility(View.VISIBLE);
                    b9.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a9);
                    a9.setVisibility(View.GONE);
                    b9.setImageResource(R.drawable.ic_down);
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a10.getVisibility() == View.GONE){
                    expand(a10);
                    a10.setVisibility(View.VISIBLE);
                    b10.setImageResource(R.drawable.ic_up);
                } else{
                    collapse(a10);
                    a10.setVisibility(View.GONE);
                    b10.setImageResource(R.drawable.ic_down);
                }
            }
        });
//        b18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (a18.getVisibility() == View.GONE){
//                    expand(a18);
//                    a18.setVisibility(View.VISIBLE);
//                    b18.setImageResource(R.drawable.ic_up);
//                } else{
//                    collapse(a18);
//                    a18.setVisibility(View.GONE);
//                    b18.setImageResource(R.drawable.ic_down);
//                }
//            }
//        });

        drawerLayout = findViewById(R.id.drawer_layout);
        autoCompleteTextView = findViewById(R.id.auto_complete_txt);

        String[] items = new String[]{"Gameplay","Card Sleeves","Standard Card Deck","Shop and Shipping","General Information"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        autoCompleteTextView.setAdapter(adapter);

        Message = findViewById(R.id.message);
        Send = findViewById(R.id.send);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"angelmislang18@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, autoCompleteTextView.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT, Message.getText().toString());
                try {
                    startActivity(Intent.createChooser(i, "Send your question..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(FAQs.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    //Drawer Menu
    public void Menu(View view){
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer((GravityCompat.START));
        }
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    public void ClickHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void ClickComponents(View view) {
        Intent intent = new Intent(this, Components.class);
        startActivity(intent);
    }

    public void ClickMechanics(View view) {
        Intent intent = new Intent(this, Mechanics.class);
        startActivity(intent);
    }

    public void ClickCards(View view) {
        Intent intent = new Intent(this, Cards.class);
        startActivity(intent);
        finish();
    }

    public void ClickGallery(View view) {
        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }

    public void ClickAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void ClickFAQs(View view) {
        closeDrawer(drawerLayout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer((drawerLayout));
        overridePendingTransition(0, 0);
    }
}