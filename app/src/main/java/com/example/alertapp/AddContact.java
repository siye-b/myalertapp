package com.example.alertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class AddContact extends AppCompatActivity {

    Button save;
    EditText name, phone, email;
    DatabaseReference ref, ref2;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        name = findViewById(R.id.editTextTextPersonName);
        phone = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextTextEmailAddress);
        save = findViewById(R.id.button);

        save.setOnClickListener(d ->{

            String Name = name.getText().toString().trim();
            int Phone = Integer.parseInt(phone.getText().toString().trim());
            String Email = email.getText().toString().trim();

            Add_contact(Name, Phone, Email);
            Intent go_to_main = new Intent(AddContact.this,MainActivity.class);
            startActivity(go_to_main);
        });

    }

    public void Add_contact(String n , int p, String e){

    }
}