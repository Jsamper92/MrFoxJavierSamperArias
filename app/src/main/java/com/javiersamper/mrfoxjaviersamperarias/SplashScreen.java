package com.javiersamper.mrfoxjaviersamperarias;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView tvLogo;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = (ImageView) findViewById(R.id.imageView);
        tvLogo = (TextView) findViewById(R.id.tvLogo);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.animlogo);
        Animation myanim2=AnimationUtils.loadAnimation(this,R.anim.textview);

        Typeface mytypeface= Typeface.createFromAsset(getAssets(),"Fonts/AmaticSC-Regular.ttf");
        tvLogo=(TextView) findViewById(R.id.tvLogo);
        tvLogo.setTypeface(mytypeface);

        imageView.startAnimation(myanim);
        tvLogo.startAnimation(myanim2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashScreen.this,Login.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}
