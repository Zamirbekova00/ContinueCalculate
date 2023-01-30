package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("koko", "onCreate: SecondActivity");

        TextView textView = findViewById(R.id.g_text);
        textView.setText(getIntent().getStringExtra("result"));

        //обработка красной кнопки
        Button redButton = findViewById(R.id.red_button);
        redButton.setOnClickListener(view -> {
            finishAffinity();
        });
    }
}