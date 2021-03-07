package com.example.seedcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AccediActivity extends AppCompatActivity {

    ImageButton sub;
    ImageView imageseedicon;
    Animation frombottom, fromtop;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accedi);

        sub = (ImageButton) findViewById(R.id.sub);
        imageseedicon = (ImageView) findViewById(R.id.imageseedicon);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        sub.setAnimation(frombottom);
        imageseedicon.setAnimation(fromtop);
    }

    public void btniniziamoclick(View view) {
        Log.d("AccediActivity", "Accedi Button Click");

        Intent intent1 = new Intent(this, LiquidActivity.class);
        startActivity(intent1);
    }
}