package com.example.munoz_karolayn_asteroids_i;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TranDrawable extends AppCompatActivity {
    private boolean inici = true;
    private TransitionDrawable transitionDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tran_drawable);

        ImageView imageView = findViewById(R.id.imageView);
        transitionDrawable = (TransitionDrawable) getResources().getDrawable(R.drawable.transicio);
        imageView.setBackground(transitionDrawable);

        Button canvi = findViewById(R.id.changeBackgroundButton);
        canvi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (inici) { transitionDrawable.startTransition(2000);
                } else { transitionDrawable.reverseTransition(2000);
                }
                inici = !inici;
            }
        });
    }
}
