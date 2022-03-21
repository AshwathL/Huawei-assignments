package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView name,age,bio,mobno,loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.textView19);
        age = findViewById(R.id.textView20);
        bio = findViewById(R.id.textView21);
        mobno = findViewById(R.id.textView22);
        loc = findViewById(R.id.textView23);

        String uName = getIntent().getStringExtra("keyname");
        String uAge = getIntent().getStringExtra("keyage");
        String uBio = getIntent().getStringExtra("keybio");
        String uMobno = getIntent().getStringExtra("keymobno");
        String uLoc = getIntent().getStringExtra("keyloc");

        name.setText(uName);
        age.setText(uAge);
        bio.setText(uBio);
        mobno.setText(uMobno);
        loc.setText(uLoc);

    }
}