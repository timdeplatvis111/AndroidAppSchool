package com.example.tony1.ussr;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Screen1Activity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        Button btnUssrPlay = findViewById(R.id.btnUssrPlay);
        Button btnUssrStop = findViewById(R.id.btnUssrStop);

        mp= MediaPlayer.create(this, R.raw.ussr);

        btnUssrPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("appel", "play USSR!!!");

                
                mp.start();
            }
        });

        btnUssrStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("appel", "stop USSR!");
                mp.seekTo(0);
                mp.pause();

            }
        });
    }
}
