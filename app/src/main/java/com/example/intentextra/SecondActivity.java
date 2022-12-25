package com.example.intentextra;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView photo;
    String WhatsApp;
    String Chrome;

    String Youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        photo = findViewById(R.id.ava);

        Bundle argument = getIntent().getExtras();
        String text = argument.getString("text");
        if (argument != null) {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
        switch (text) {
            case "WhatsApp":
                photo.setImageResource(R.drawable.whatsappicon);
                break;

            case "Chrome":
                photo.setImageResource(R.drawable.chromeicon);
                break;

            case "Youtube":
                photo.setImageResource(R.drawable.youtubeicon);
                break;

        }
    }
}