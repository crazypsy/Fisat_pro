package com.example.fisat_pro.parameters;

import android.content.Intent;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidity);
        humidty = findViewById(R.id.editTextTextPersonName);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        spinner = (MaterialSpinner) findViewById(R.id.State);

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

                    set = "2";
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    intent.putExtra("fill", set);
                    startActivity(intent);
                }
            }
        });
    }
}