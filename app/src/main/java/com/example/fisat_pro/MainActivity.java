package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    FloatingActionButton b1;
    Button k1, k2, k3;
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    String choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.floating);
        k1 = findViewById(R.id.Nosstification);
        k2 = findViewById(R.id.approvedMore);
        k3 = findViewById(R.id.DeclinedMore);
        k1.setText("more");
        k2.setText("more");
        k3.setText("more");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Student_Input.class);

                startActivity(intent);

            }
        });

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choose = "1";
                Intent intent = new Intent(getApplicationContext(), AllParameterView.class);
                intent.putExtra("Key", choose);
                startActivity(intent);

            }
        });
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choose = "2";
                Intent intent = new Intent(getApplicationContext(), AllParameterView.class);
                intent.putExtra("Key", choose);
                startActivity(intent);

            }
        });
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choose = "3";
                Intent intent = new Intent(getApplicationContext(), AllParameterView.class);
                intent.putExtra("Key", choose);
                startActivity(intent);

            }
        });
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

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);


        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView1.setLayoutManager(layoutManager1);
        RecyclerViewAdapter adapter1 = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView1.setAdapter(adapter1);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = findViewById(R.id.Declined);
        recyclerView2.setLayoutManager(layoutManager2);
        RecyclerViewAdapter adapter2 = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView2.setAdapter(adapter2);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), LoginOrSignUp.class));
    }
}