package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtfast = findViewById(R.id.txt_fast);
        TextView txtdeum = findViewById(R.id.txt_medium);
        TextView txtslow = findViewById(R.id.txt_slow);
        TextView txtoff = findViewById(R.id.txt_off);
        ImageView imganh2 = findViewById(R.id.img_quat);

        txtfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation ani = AnimationUtils.loadAnimation(MainActivity2.this, R.anim.fast);
                imganh2.startAnimation(ani);
            }
        });
        txtdeum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animin = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.medium);
                imganh2.startAnimation(animin);
            }
        });
        txtslow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation amin = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.slow);
                imganh2.startAnimation(amin);
            }
        });
        txtoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imganh2.clearAnimation();
            }
        });
    }
}