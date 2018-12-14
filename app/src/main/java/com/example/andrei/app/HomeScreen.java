package com.example.andrei.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    public String data1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Intent login = getIntent();
        data1 = login.getStringExtra("mesaj");
        TextView usr = findViewById(R.id.welcomeUsername);
        usr.setText(data1);
    }
}
