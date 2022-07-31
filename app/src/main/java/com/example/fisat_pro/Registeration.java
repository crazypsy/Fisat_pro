package com.example.fisat_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Registeration extends AppCompatActivity {
int key;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        t1=findViewById(R.id.textView);

        Intent callerIntent=getIntent();
        key=Integer.parseInt(callerIntent.getStringExtra("Key"));
        if(key==1){
            t1.setText("Student");

        }
        else {
            t1.setText("Teacher");
        }
    }
}