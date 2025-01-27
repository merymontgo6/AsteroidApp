package com.example.munoz_karolayn_asteroids_i;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class AnimaUtils extends AppCompatActivity {

    private ImageView naveImg;
    private boolean inici = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anima_utils);

        naveImg = findViewById(R.id.nave);

        Button moureBoto = findViewById(R.id.moureBoto);
        moureBoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inici) { moureeNave();
                } else { tornarNave();
                }
                inici = !inici;
            }
        });
    }

    private void moureeNave() {
        Animation moureNave = AnimationUtils.loadAnimation(this, R.anim.moure);
        naveImg.startAnimation(moureNave);
    }

    private void tornarNave() {
        Animation tornarNave = AnimationUtils.loadAnimation(this, R.anim.tornar);
        naveImg.startAnimation(tornarNave);
    }
}