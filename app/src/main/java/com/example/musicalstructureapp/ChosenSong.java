package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class ChosenSong extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);



        Song currentSong = (Song) getIntent().getSerializableExtra("CurrentSong");

        setTitle(currentSong.getTitle());

        TextView songName = findViewById(R.id.title_textView);
        songName.setText(currentSong.getTitle());

        TextView songArtist = findViewById(R.id.artist_textView);
        songArtist.setText(currentSong.getArtist());

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(currentSong.getImageResourceID());


    }
}
