package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fisat_pro.customspinner.MaterialSpinner;
import com.google.android.material.snackbar.Snackbar;

public class Registeration extends AppCompatActivity {
int key;
TextView t1;
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private static final String[] ANDROID_VERSIONS = {
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow",
            "Nougat",
            "Oreo"
    };
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

        radioSexGroup = (RadioGroup) findViewById(R.id.radioGrp);



// get selected radio button from radioGroup
        int selectedId = radioSexGroup.getCheckedRadioButtonId();
// find the radiobutton by returned id
        radioSexButton = (RadioButton) findViewById(selectedId);



//State details Spinner

        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.State);

        spinner.setItems(ANDROID_VERSIONS);
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        spinner.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });


//District details Spinner

        MaterialSpinner district = (MaterialSpinner) findViewById(R.id.District);

        district.setItems(ANDROID_VERSIONS);
        district.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        district.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });

        //Block details Spinner
        MaterialSpinner block = (MaterialSpinner) findViewById(R.id.Block);

        block.setItems(ANDROID_VERSIONS);
        block.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        block.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });
        //Panchayth details Spinner
        MaterialSpinner panchath = (MaterialSpinner) findViewById(R.id.Panchayth);

        panchath.setItems(ANDROID_VERSIONS);
        panchath.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        panchath.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });
        //School details Spinner
        MaterialSpinner school = (MaterialSpinner) findViewById(R.id.School);

        school.setItems(ANDROID_VERSIONS);
        school.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        school.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), RegisterChoose.class));
    }


}