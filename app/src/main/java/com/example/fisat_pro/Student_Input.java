package com.example.fisat_pro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    int keyy = 0, flood = 0, humidity = 0, press = 0, rain = 0, riverlength = 0, temper = 0, ground = 0, windd = 0, sum = 0;
    String blah = "0", flood_f, humidity_f, pressure_f, rainfall_f, river_f, temp_f, ground_f, wind_f;

    SharedPreferences sh;

    TextView comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_input);
        comment = findViewById(R.id.demooops);
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

        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        flood_f = sh.getString("flood", "0");

        temp_f = sh.getString("temerap", "0");
        rainfall_f = sh.getString("rainfall", "0");
        river_f = sh.getString("riverlength", "0");
        humidity_f = sh.getString("humidity", "0");
        pressure_f = sh.getString("pressure", "0");
        ground_f = sh.getString("groundwaterl", "0");
        wind_f = sh.getString("windfull", "0");


        if (flood_f != blah) {
            flood = Integer.parseInt(flood_f);
        }

        if (temp_f != blah) {
            temper = Integer.parseInt(temp_f);
        }

        if (rainfall_f != blah) {
            rain = Integer.parseInt(rainfall_f);
        }

        if (river_f != blah) {
            riverlength = Integer.parseInt(river_f);
        }

        if (humidity_f != blah) {
            humidity = Integer.parseInt(humidity_f);
        }


        if (pressure_f != blah) {
            press = Integer.parseInt(pressure_f);
        }

        if (ground_f != blah) {
            ground = Integer.parseInt(ground_f);
        }

        if (wind_f != blah) {
            windd = Integer.parseInt(wind_f);
        }


        //in integer

        if (flood == 1) {
            FloodLevel.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            FloodLevel.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));

        }


        if (press == 1) {
            pressure.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            pressure.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }


        if (windd == 1) {
            wind.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            wind.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }


        if (riverlength == 1) {
            river.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            river.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }


        if (ground == 1) {
            wat.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            wat.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }


        if (humidity == 1) {
            hum.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            hum.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }


        if (temper == 1) {
            temp.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {
            temp.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }


        if (rain == 1) {
            Rain.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_A400));
        } else {

            Rain.setCardBackgroundColor(ContextCompat.getColor(this, R.color.grey_500));
        }
        sum = flood + humidity + press + rain + riverlength + temper + ground + windd;
        if (sum == 8) {
            k1.setVisibility(Button.VISIBLE);
            comment.setVisibility(TextView.GONE);
        } else {
            k1.setVisibility(Button.GONE);
            comment.setVisibility(TextView.VISIBLE);
        }


        //  Rain.setCardBackgroundColor(ContextCompat.getColor(this,R.color.green_400));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}