package com.example.alertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Home extends AppCompatActivity {

    Button Reg;
    EditText name, email, phone, pass;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name = findViewById(R.id.editTextTextPersonName2);
        email = findViewById(R.id.editTextTextEmailAddress2);
        phone = findViewById(R.id.editTextPhone2);
        pass = findViewById(R.id.editTextTextPassword);

        Reg = (Button) findViewById(R.id.button2);
        Reg.setOnClickListener(r ->{

            String Name = name.getText().toString().trim();
            String Email = email.getText().toString().trim();
            String Pass = pass.getText().toString().trim();
            String Phone = phone.getText().toString().trim();

            /*if(Name.length() == 0){
                name.setError("Enter your username");
            }
            if(Email.length() == 0){
                email.setError("Enter email");
            }
            if (phone == null){
                phone.setError("Enter your phone number");
            }
            if (Pass.length() ==0){
                pass.setError("");
            }
            else {*/
                Toast.makeText(Home.this, "user registered  2222", Toast.LENGTH_SHORT).show();
                Register(Name, Email, Pass , Phone);

            //}
        });

    }

    public void Register(String n_name, String e_email, String p_pass ,String p_phone){
        Toast.makeText(Home.this, "user registered  45465326", Toast.LENGTH_SHORT).show();
        auth.createUserWithEmailAndPassword( e_email, p_pass).addOnCompleteListener(task-> {
            if (task.isSuccessful()) {

                //User user = new User (e_email, p_phone, n_name, p_pass);
                User user = new User("siye@gmail.com","5257653222","siye","123456");
                Toast.makeText(this, "user registered_TESTING", Toast.LENGTH_SHORT).show();
                FirebaseDatabase.getInstance().getReference("Users")
                        .child(auth.getCurrentUser().getUid())
                        .setValue(user).addOnCompleteListener(tas -> {
                            if(tas.isSuccessful()){

                                startActivity(new Intent(Home.this,MainActivity.class));
                                Toast.makeText(Home.this, "user registered", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(Home.this, "failed to register user", Toast.LENGTH_SHORT).show();

                            }
                        });

            } else {
                Toast.makeText(Home.this, task.getException().getMessage() , Toast.LENGTH_SHORT).show();
            }
        });
    }

}