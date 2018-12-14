package com.example.andrei.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        String data1 = String.valueOf(username.getText());
        String data2 = String.valueOf(password.getText());
        if(data1.equals("admin") && data2.equals("admin")){
            Intent login = new Intent(this, HomeScreen.class);
            login.putExtra("mesaj", data1);
            startActivity(login);
        }
        else showToast();
    }
    public void register(View view) {
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }

    public void showToast(){
        Context context = getApplicationContext();
        CharSequence text = "Nume sau parola gresite!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
