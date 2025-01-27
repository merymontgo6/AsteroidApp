package com.example.munoz_karolayn_asteroids_i;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnimaDrawable extends AppCompatActivity {
    private ImageView naveImageView;
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

        // Cargar y empezar la animación de frames
        naveImageView.setBackgroundResource(R.drawable.animacio);
        AnimationDrawable naveAnimation = (AnimationDrawable) naveImageView.getBackground();

        // Iniciar la animación al hacer clic en la imagen de la nave
        naveImageView.setOnClickListener(v -> naveAnimation.start());
    }
}