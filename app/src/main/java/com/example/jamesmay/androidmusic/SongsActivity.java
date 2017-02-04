package com.example.jamesmay.androidmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //        BUTTON 1

        Button play1 = (Button) findViewById(R.id.song_btn_1);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Learing to Walk", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 2

        Button play2 = (Button) findViewById(R.id.song_btn_2);

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: My heart beats for you", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 3

        Button play3 = (Button) findViewById(R.id.song_btn_3);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: This old pickup", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 4

        Button play4 = (Button) findViewById(R.id.song_btn_4);

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Staring at my screen", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 5

        Button play5 = (Button) findViewById(R.id.song_btn_5);

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Talking to myself", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 6

        Button play6 = (Button) findViewById(R.id.song_btn_6);

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Laptop Confessions", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 7

        Button play7 = (Button) findViewById(R.id.song_btn_7);

        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Late night blues", Toast.LENGTH_SHORT).show();
            }
        });

        //        BUTTON 8

        Button play8 = (Button) findViewById(R.id.song_btn_8);

        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: memes and gifs", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
