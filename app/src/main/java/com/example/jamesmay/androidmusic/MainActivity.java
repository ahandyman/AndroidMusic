package com.example.jamesmay.androidmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView podcasts = (TextView) findViewById(R.id.activity_podcast);

        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeActivity_podcast = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(changeActivity_podcast);
            }
        });

        TextView songs = (TextView) findViewById(R.id.activity_songs);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeActivity_songs = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(changeActivity_songs);
            }
        });

        TextView favorites = (TextView) findViewById(R.id.activity_favorites);

        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeActivity_favorites = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(changeActivity_favorites);
            }
        });


    }
}
