package com.hcdc.liveexercise6alogintonewwindow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Logged Paged");

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String position = intent.getStringExtra("position");

        TextView user2main = findViewById(R.id.login2);
        TextView position2main = findViewById(R.id.position2);

        user2main.setText(username);
        position2main.setText(position);

    }
}