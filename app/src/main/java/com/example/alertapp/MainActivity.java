package com.example.alertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    TextView go_reg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton mFAB = findViewById(R.id.floatingActionButton);
        mFAB.setOnClickListener(v -> startActivity(new Intent(this , AddContact.class)));

        go_reg = findViewById(R.id.textView);

        go_reg.setOnClickListener(d ->{
            Intent a = new Intent(this, Home.class);
            startActivity(a);
        });

    }
}