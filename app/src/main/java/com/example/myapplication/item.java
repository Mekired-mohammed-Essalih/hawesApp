package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class item extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);


        ImageView img;
        img=findViewById(R.id.profile_image);
        TextView uname=(TextView) findViewById(R.id.name_profile);
        TextView udescription=(TextView) findViewById(R.id.country_profile);

        Intent intent = this.getIntent();

        if (intent != null){

            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String country = intent.getStringExtra("country");
            int imageid = intent.getIntExtra("imageid",R.drawable.person);

            uname.setText(name);
            udescription.setText(phone);
            //.setText(country);
            img.setImageResource(imageid);



        }
    }
}