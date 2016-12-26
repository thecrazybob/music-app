package com.example.android.musicapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get all the three buttons
        Button playingButton = (Button) findViewById(R.id.playing);
        Button browseButton = (Button) findViewById(R.id.browse);
        Button storeButton = (Button) findViewById(R.id.store);

        // Use OnClickListener to Change the Activity
        playingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Playing.class);
                startActivity(intent);
            }

        });

        browseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Browse.class);
                startActivity(intent);
            }

        });

        storeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Store.class);
                startActivity(intent);
            }

        });
    }

}
