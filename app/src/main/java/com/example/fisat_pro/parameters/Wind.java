package com.example.fisat_pro.parameters;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fisat_pro.R;
import com.example.fisat_pro.Student_Input;
import com.example.fisat_pro.customspinner.MaterialSpinner;
import com.google.android.material.snackbar.Snackbar;

public class Wind extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "centimeter",
            "meter ",
            "kilometer",


    };
    private static final String[] WIND_DIRECTIONS = {
            "North",
            "South ",
            "West",
            "East",
            "NorthWest",
            "SouthWest",
            "Northeast",
            "Southeast"

    };
    Button k1;
    MaterialSpinner spinner, spinner1;
    EditText wind;
    String windNumber, windunit, winddirection, set;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wind);

        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        wind = findViewById(R.id.editTextTextWind);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");


        spinner = (MaterialSpinner) findViewById(R.id.editTextTextWindUnit);

        spinner.setItems(ANDROID_VERSIONS);
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
//        spinner.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {
//
//            @Override
//            public void onNothingSelected(MaterialSpinner spinner) {
//                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
//            }
//        });


        spinner1 = (MaterialSpinner) findViewById(R.id.WindDirection);

        spinner1.setItems(WIND_DIRECTIONS);
        spinner1.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
//        spinner1.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {
//
//            @Override
//            public void onNothingSelected(MaterialSpinner spinner) {
//                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
//            }
//        });


        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windNumber = wind.getText().toString();
                windunit = spinner.getText().toString();
                winddirection = spinner1.getText().toString();


                if (windNumber.equals("")) {
                    wind.setError("Measure please");

                } else {

                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("windfull", set);
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    // intent.putExtra("windfull", set);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), Student_Input.class));
    }
}