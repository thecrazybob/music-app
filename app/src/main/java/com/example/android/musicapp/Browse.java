package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Browse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        // Get all the three buttons
        Button playingButton = (Button) findViewById(R.id.playing);
        Button storeButton = (Button) findViewById(R.id.store);

        // Use OnClickListener to Change the Activity
        playingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Browse.this, Playing.class);
                startActivity(intent);
            }

        });

        storeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Browse.this, Store.class);
                startActivity(intent);
            }

        });
    }
}
