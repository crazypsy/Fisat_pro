package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import com.example.fisat_pro.parameters.FloodLevel;
import com.example.fisat_pro.parameters.Humidity;
import com.example.fisat_pro.parameters.Pressure;
import com.example.fisat_pro.parameters.RainFall;
import com.example.fisat_pro.parameters.RiverLength;
import com.example.fisat_pro.parameters.Temperture;
import com.example.fisat_pro.parameters.WaterLevel;
import com.example.fisat_pro.parameters.Wind;

public class Student_Input extends AppCompatActivity {
    Button k1, k2, k3;
    //    TextView temp, hum, wat, river, wind, pressure, FloodLevel;
    CardView temp, hum, wat, river, wind, pressure, FloodLevel, Rain;
    Layout layout;
    int keyy = 0;
    String blah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_input);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Preview");


        temp = findViewById(R.id.Temperature);

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PreviewData.class);

                startActivity(intent);

            }
        });

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


        wat = findViewById(R.id.GroundWater);
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


        FloodLevel = findViewById(R.id.FloodLevel);
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


        Rain = findViewById(R.id.RainFall);
        Rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), RainFall.class);

                startActivity(intent);

            }
        });
        Intent callerIntent1 = getIntent();
        blah = callerIntent1.getStringExtra("fill");
        if (blah != null) {
            keyy = Integer.parseInt(blah);
        } else {
            FloodLevel.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            pressure.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            wind.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            river.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            wat.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            hum.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            temp.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
            Rain.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }
        if (keyy == 1) {
            FloodLevel.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_400));
        } else if (keyy == 2) {
            hum.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_400));
        } else {

            hum.setCardBackgroundColor(ContextCompat.getColor(this, R.color.red_700));
        }


        //  Rain.setCardBackgroundColor(ContextCompat.getColor(this,R.color.green_400));

    }
}