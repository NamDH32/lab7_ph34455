package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imganh = findViewById(R.id.img_logo);
        TextView txtwell = findViewById(R.id.txt_wellcom);

        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.baner);
        txtwell.startAnimation(anim2);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.test1);
        imganh.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}