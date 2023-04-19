package com.example.hydroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class registeractivitysignup extends AppCompatActivity {
   TextView gotoSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivitysignup);
        gotoSignup = findViewById(R.id.Signup);



        gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registeractivitysignup.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}