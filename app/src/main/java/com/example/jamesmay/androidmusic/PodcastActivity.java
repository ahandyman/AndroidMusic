package com.example.jamesmay.androidmusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

//        btn 1
        Button play1 = (Button) findViewById(R.id.podcast_btn_1);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: NPR", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 2
        Button play2 = (Button) findViewById(R.id.podcast_btn_2);

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Simple Programmer", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 3
        Button play3 = (Button) findViewById(R.id.podcast_btn_3);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Android Buffet", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 4
        Button play4 = (Button) findViewById(R.id.podcast_btn_4);

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: This Week in Google", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 5
        Button play5 = (Button) findViewById(R.id.podcast_btn_5);

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Codepen Radio", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 6
        Button play6 = (Button) findViewById(R.id.podcast_btn_6);

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Small Talk", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 7
        Button play7 = (Button) findViewById(R.id.podcast_btn_7);

        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Fragmented", Toast.LENGTH_SHORT).show();
            }
        });

        //        btn 8
        Button play8 = (Button) findViewById(R.id.podcast_btn_8);

        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Now Playing: Android Developers Backstage", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
