package com.example.fisat_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Student_Input extends AppCompatActivity {
    Button k1,k2,k3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_input);
        k1=findViewById(R.id.SubMit);
        k1.setText("Submit");
    }
}