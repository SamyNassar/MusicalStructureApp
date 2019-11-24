package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class AllSongs extends AppCompatActivity {

    private ArrayList<Song> songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);


        songList = new ArrayList<>();

        songList.add(new Song("Believer",
                "Imagine Dragons", R.drawable.believer));

        songList.add(new Song("Friends",
                "Anne Marie", R.drawable.friends));

        songList.add(new Song("Rolling in the deep",
                "Adele", R.drawable.rolling_in_the_deep));




        SongsAdapter songsAdapter = new SongsAdapter(this, songList);

        ListView listView = findViewById(R.id.songs_listView);

        listView.setAdapter(songsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AllSongs.this, ChosenSong.class);
                intent.putExtra("CurrentSong", songList.get(position));
                startActivity(intent);
            }
        });


    }




}
