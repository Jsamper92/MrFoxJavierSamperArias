package com.javiersamper.mrfoxjaviersamperarias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void login(View view){
        Intent intent = new Intent(this,ScrollingActivity.class);
        startActivity(intent);

    }
}
