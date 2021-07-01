package com.example.appphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void playPhrase(View view){
        Button selected=(Button) view;
        String name_of_file=selected.getTag().toString();
        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(name_of_file,"raw",getPackageName()));
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}