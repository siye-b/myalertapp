package com.example.alertapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddContactActivity extends AppCompatActivity {

    EditText nameEditText, surnameEditText, emailEditText;
    Button saveButton;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        nameEditText = findViewById(R.id.name_edit_text);
        surnameEditText = findViewById(R.id.surname_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        saveButton = findViewById(R.id.save_button);

        databaseReference = FirebaseDatabase.getInstance().getReference("users");

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString().trim();
                String surname = surnameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();

                String id = databaseReference.push().getKey();
                User user = new User(name, surname, email);
                databaseReference.child(id).setValue(user);

                Toast.makeText(getApplicationContext(), "Contact saved", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
