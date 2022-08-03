package com.example.fisat_pro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.example.fisat_pro.bubblenavigation.BubbleNavigationLinearView;
import com.example.fisat_pro.bubblenavigation.listener.BubbleNavigationChangeListener;

public class Teacher_home extends AppCompatActivity {
    Fragment selectedFragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);
        BubbleNavigationLinearView bubbleNavigation = findViewById(R.id.bubbleNavigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

        bubbleNavigation.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                switch (position) {
                    case 0:
                        selectedFragment = new HomeFragment();
                        break;
                    case 1:
                        selectedFragment = new SearchFragment();
                        break;
                    case 2:
                        selectedFragment = new StarredFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();
            }
        });

    }
}