package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        textView=findViewById(R.id.textView);
        //getting info from page 1
        Intent i=getIntent();
        String emailx= i.getStringExtra("emailstr");

        //display text
        textView.setText("Welcome "+emailx);

    }
}