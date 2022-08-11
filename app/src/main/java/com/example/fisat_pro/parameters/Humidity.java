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

public class Humidity extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "volume",
            "milliliter ",
            "percentage",


    };
    Button k1;
    MaterialSpinner spinner;
    EditText humidty;
    String HumidityNumber, humidityunit, set;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidity);
        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        humidty = findViewById(R.id.editTextTextPersonName);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        spinner = (MaterialSpinner) findViewById(R.id.HumidityUnit);

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
                HumidityNumber = humidty.getText().toString();
                humidityunit = spinner.getText().toString();


                if (HumidityNumber.equals("")) {
                    humidty.setError("Measure please");

                } else {

                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("humidity", set);
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    //  intent.putExtra("humidity", set);
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