package com.example.fisat_pro;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fisat_pro.Adapters.ParameterAdapter;

import java.util.ArrayList;

public class AllParameterView extends AppCompatActivity {
    TextView t1;
    int key;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_parameter_view);

        t1 = findViewById(R.id.TextHeading);

        Intent callerIntent = getIntent();
        key = Integer.parseInt(callerIntent.getStringExtra("Key"));

        if (key == 1) {
            t1.setText("To be checked");

        } else if (key == 2) {
            t1.setText("Approved Data");
        } else {
            t1.setText("Declined Data");
        }
        getImages();
    }

    private void getImages() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Aug 6");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Aug 1");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("July 5");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("July 8");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("July 9");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("July 20");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("July 21");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("July 22");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("July 23");

        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        ParameterAdapter adapter = new ParameterAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}