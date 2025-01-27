package com.example.munoz_karolayn_asteroids_i;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnimaDrawable extends AppCompatActivity {
    private ImageView naveImageView;
    private AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_anima_drawable);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.aniDra2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        naveImageView = findViewById(R.id.nave);
        Button moverButton = findViewById(R.id.moureBoto);

        moverButton.setOnClickListener(v -> {
            naveImageView.setBackgroundResource(R.drawable.animacio);
            animation = (AnimationDrawable) naveImageView.getBackground();
            animation.start();
        });
    }
}