package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    //Toast.makeText(MainActivity2.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,home.class);
                    startActivity(intent);
                    Toast.makeText(login.this,"drawer",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(login.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

        TextView inscription = (TextView) findViewById(R.id.inscription);
        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(login.this, sign_up.class);
             startActivity(intent);
                Toast.makeText(login.this,"inscription",Toast.LENGTH_SHORT).show();
            }
            });
    }
}