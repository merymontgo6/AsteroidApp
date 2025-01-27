package com.example.munoz_karolayn_asteroids_i;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button jugarBoton = findViewById(R.id.jugarBoto);
        jugarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TranDrawable.class);
                startActivity(intent);
            }
        });

        Button aniU = findViewById(R.id.aniU);
        aniU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimaUtils.class);
                startActivity(intent);
           }
        });

        Button animaDra3 = findViewById(R.id.animaDra3);
        animaDra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimaDrawable.class);
               startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.acercaDe) {
            llancarAboutThat();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void llancarAboutThat(View view) {
        Intent i = new Intent(this, AboutThatActivity.class);
        startActivity(i);
    }

    public void llancarAboutThat() {
        Intent i = new Intent(this, AboutThatActivity.class);
        startActivity(i);
    }
    public void sortir(View view) {
        finish();
        System.exit(0);
    }
}