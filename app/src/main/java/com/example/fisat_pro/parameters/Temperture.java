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

public class Temperture extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "Celcious",
            "kelvin",
            "Farhheat",


    };
    Button k1;
    EditText temperature;
    MaterialSpinner spinner;
    String temperatureNumber, temperatureunit, set;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperture);
        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        temperature = findViewById(R.id.editTextTextTemperture);

        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        spinner = (MaterialSpinner) findViewById(R.id.TemperatureUnit);

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

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temperatureNumber = temperature.getText().toString();
                temperatureunit = spinner.getText().toString();


                if (temperatureNumber.equals("")) {
                    temperature.setError("Measure please");

                } else {

                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("temerap", set);
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
//                    intent.putExtra("temerap", set);
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