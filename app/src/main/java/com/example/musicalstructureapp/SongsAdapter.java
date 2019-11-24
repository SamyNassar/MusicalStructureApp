package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SongsAdapter extends ArrayAdapter<Song> {

    private Context mContext;

    public SongsAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(
                    R.layout.songs_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songName = listItem.findViewById(R.id.title_textView);
        songName.setText(currentSong.getTitle());

        TextView songArtist = listItem.findViewById(R.id.artist_textView);
        songArtist.setText(currentSong.getArtist());

        ImageView imageView = listItem.findViewById(R.id.song_imageView);
        imageView.setImageResource(currentSong.getImageResourceID());



        return listItem;
    }

}
