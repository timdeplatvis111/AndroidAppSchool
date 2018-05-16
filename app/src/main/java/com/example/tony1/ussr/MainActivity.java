package com.example.tony1.ussr;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBoven = findViewById(R.id.btnBoven);
        Button btnBeneden = findViewById(R.id.btnBeneden);

        //mp=MediaPlayer.create(this, R.raw.ussr);

        btnBoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("appel", "btnBoven Clicked!");
                navigateToScreen1();
                //mp.start();

                //test
            }
        });

        btnBeneden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("appel", "btnBeneden Clicked!");
                navigateToScreen2();
                //mp.seekTo(0);
                //mp.pause();

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Log.i("appel", "onCreate");
            }
        });

    }

    private void navigateToScreen1()
    {
        Intent intent = new Intent(this, Screen1Activity.class);
        startActivity(intent);
    }

    private void navigateToScreen2()
    {
        Intent intent = new Intent(this, Screen2Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i("appel", "onCreateOptionsMenu");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i("appel", "onOptionsItemSelected");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("appel", "onRestart");
    }
}
