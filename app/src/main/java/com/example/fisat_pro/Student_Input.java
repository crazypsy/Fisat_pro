package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fisat_pro.parameters.FloodLevel;
import com.example.fisat_pro.parameters.Humidity;
import com.example.fisat_pro.parameters.Pressure;
import com.example.fisat_pro.parameters.RiverLength;
import com.example.fisat_pro.parameters.Temperture;
import com.example.fisat_pro.parameters.WaterLevel;
import com.example.fisat_pro.parameters.Wind;

public class Student_Input extends AppCompatActivity {
    Button k1, k2, k3;
    TextView temp, hum, wat, river, wind, pressure, FloodLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_input);
        // k1=findViewById(R.id.SubMit);
        // k1.setText("Submit");
        temp = findViewById(R.id.Temperture);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Temperture.class);

                startActivity(intent);

            }
        });


        hum = findViewById(R.id.Humidity);
        hum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Humidity.class);

                startActivity(intent);

            }
        });


        wat = findViewById(R.id.WaterLevel);
        wat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), WaterLevel.class);

                startActivity(intent);

            }
        });


        river = findViewById(R.id.RiverWidth);
        river.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), RiverLength.class);

                startActivity(intent);

            }
        });


        wind = findViewById(R.id.Wind);
        wind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Wind.class);

                startActivity(intent);

            }
        });


        FloodLevel = findViewById(R.id.GroundWater);
        FloodLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FloodLevel.class);

                startActivity(intent);

            }
        });


        pressure = findViewById(R.id.Pressure);
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Pressure.class);

                startActivity(intent);

            }
        });

    }
}