package com.example.drawernavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Marks extends AppCompatActivity {

    TextView textView;
    ArrayList<String> ansArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        int count = intent.getIntExtra("Count", -1);
        textView.setText("Your result is " + count +"/10");
    }

    public void GoBack(View view) {

        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}