package com.example.intentextra;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton btnTransition;
    EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTransition = findViewById(R.id.materialButton);
        edText = findViewById(R.id.Text);

        btnTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = edText.getText().toString().trim();
                if (text.isEmpty()) {
                    edText.setError("Поле должно быть заполненно");
                } else {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("text",text);
                    startActivity(intent);
                }


            }
        });

    }

}