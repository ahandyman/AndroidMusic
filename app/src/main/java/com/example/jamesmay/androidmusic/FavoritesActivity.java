package com.example.jamesmay.androidmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

//        btn 1
        Button play1 = (Button) findViewById(R.id.favorite_btn_1);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: The Coding Song", Toast.LENGTH_SHORT).show();
            }
        });

//        btn 2
        Button play2 = (Button) findViewById(R.id.favorite_btn_2);

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Fun with Udacity", Toast.LENGTH_SHORT).show();
            }
        });
//        btn 3
        Button play3 = (Button) findViewById(R.id.favorite_btn_3);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Learning to fail: A success story", Toast.LENGTH_SHORT).show();
            }
        });
//        btn 4
        Button play4 = (Button) findViewById(R.id.favorite_btn_4);

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Up late", Toast.LENGTH_SHORT).show();
            }
        });
//        btn 5
        Button play5 = (Button) findViewById(R.id.favorite_btn_5);

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Is it morning already", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
