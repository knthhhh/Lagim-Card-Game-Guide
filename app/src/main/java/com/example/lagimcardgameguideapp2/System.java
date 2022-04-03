package com.example.lagimcardgameguideapp2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import java.util.Objects;

public class System extends AppCompatActivity {

    public void hideSystemBars() {
//        Objects.requireNonNull(getSupportActionBar()).hide();
        WindowInsetsControllerCompat windowInsetsController =
                ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController == null) {
            return;
        }
        // Configure the behavior of the hidden system bars
        windowInsetsController.setSystemBarsBehavior(
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        );
        // Hide both the status bar and the navigation bar
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars());
        Objects.requireNonNull(getSupportActionBar()).hide();
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    //Global
    public void Back(View view){
        finish();
    }

    //Home
    public void LagimLimit(View view){
        Intent intent = new Intent(this, LagimLimit.class);
        startActivity(intent);
    }
    public void Dwellers(View view){
        Intent intent = new Intent(this, Dwellers.class);
        startActivity(intent);
    }
    public void Raiding(View view){
        Intent intent = new Intent(this, Raiding.class);
        startActivity(intent);
    }
    public void Defending(View view){
        Intent intent = new Intent(this, Defending.class);
        startActivity(intent);
    }
    public void TypesOfRaid(View view){
        Intent intent = new Intent(this, TypesOfRaid.class);
        startActivity(intent);
    }
    public void TypesOfDefense(View view){
        Intent intent = new Intent(this, TypesOfDefense.class);
        startActivity(intent);
    }

    //Social Media
    public void facebook(View view){
        String url = "https://www.facebook.com/LAGIMGAME";
        Intent fb = new Intent(Intent.ACTION_VIEW);
        fb.setData(Uri.parse(url));
        startActivity(fb);
    }
    public void instagram(View view){
        String url = "https://www.instagram.com/lagimcardgame/?hl=en";
        Intent ig = new Intent(Intent.ACTION_VIEW);
        ig.setData(Uri.parse(url));
        startActivity(ig);
    }
    public void youtube(View view){
        String url = "https://www.youtube.com/c/LagimCardGame";
        Intent yt = new Intent(Intent.ACTION_VIEW);
        yt.setData(Uri.parse(url));
        startActivity(yt);
    }
    public void kickstarter(View view){
        String url = "https://www.kickstarter.com/projects/fictionminds/lagim-card-game";
        Intent fb = new Intent(Intent.ACTION_VIEW);
        fb.setData(Uri.parse(url));
        startActivity(fb);
    }

    public static void expand(final View v) {
        int matchParentMeasureSpec = View.MeasureSpec.makeMeasureSpec(((View) v.getParent()).getWidth(), View.MeasureSpec.EXACTLY);
        int wrapContentMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        v.measure(matchParentMeasureSpec, wrapContentMeasureSpec);
        final int targetHeight = v.getMeasuredHeight();

        // Older versions of android (pre API 21) cancel animations for views with a height of 0.
        v.getLayoutParams().height = 1;
        v.setVisibility(View.VISIBLE);
        Animation a = new Animation()
        {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                v.getLayoutParams().height = interpolatedTime == 1
                        ? RelativeLayout.LayoutParams.WRAP_CONTENT
                        : (int)(targetHeight * interpolatedTime);
                v.requestLayout();
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };

        // Expansion speed of 1dp/ms
        a.setDuration((int)(targetHeight / v.getContext().getResources().getDisplayMetrics().density));
        v.startAnimation(a);
    }

    public static void collapse(final View v) {
        final int initialHeight = v.getMeasuredHeight();

        Animation a = new Animation()
        {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                if(interpolatedTime == 1){
                    v.setVisibility(View.GONE);
                }else{
                    v.getLayoutParams().height = initialHeight - (int)(initialHeight * interpolatedTime);
                    v.requestLayout();

                }
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };

        // Collapse speed of 1dp/ms
        a.setDuration((int)(initialHeight / v.getContext().getResources().getDisplayMetrics().density));
        v.startAnimation(a);

    }

}
