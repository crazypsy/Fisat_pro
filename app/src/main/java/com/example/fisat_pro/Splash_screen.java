package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView text1, text2;
    private static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.topanim);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottomanim);

        image=findViewById(R.id.profile_image);
        text1=findViewById(R.id.textView3);

        //aimation seting
        image.setAnimation(topAnim);
        text1.setAnimation(bottomAnim);
        //  text2.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_screen.this, LoginOrSignUp.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}