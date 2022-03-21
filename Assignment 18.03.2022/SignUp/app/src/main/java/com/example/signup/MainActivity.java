package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name,age,bio,mobno,loc;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName);
        age = findViewById(R.id.editTextTextPersonName6);
        bio = findViewById(R.id.editTextTextPersonName7);
        mobno = findViewById(R.id.editTextTextPersonName8);
        loc = findViewById(R.id.editTextTextPersonName9);
        add = findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uName = name.getText().toString();
                String uAge = age.getText().toString();
                String uBio = bio.getText().toString();
                String uMobno = mobno.getText().toString();
                String uLoc = loc.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keyname",uName);
                intent.putExtra("keyage",uAge);
                intent.putExtra("keybio",uBio);
                intent.putExtra("keymobno",uMobno);
                intent.putExtra("keyloc",uLoc);

                startActivity(intent);
            }
        });
    }
}