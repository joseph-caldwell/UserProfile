package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.picture);

        TextView school = (TextView) findViewById(R.id.name);
        school.setText(R.string.name);


        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(R.string.birthday);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("America");
    }
}