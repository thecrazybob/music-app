package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        // Get all the three buttons
        Button browseButton = (Button) findViewById(R.id.browse);
        Button storeButton = (Button) findViewById(R.id.store);

        // Use OnClickListener to Change the Activity
        browseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Playing.this, Browse.class);
                startActivity(intent);
            }

        });

        storeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Playing.this, Store.class);
                startActivity(intent);
            }

        });

    }
}
