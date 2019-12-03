package com.roman.writtingassistent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Day05 extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day05);


        MobileAds.initialize(this,
                "ca-app-pub-5376079706371809~3812378426");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void day_5_tsk1(View view) {
        Intent intent = new Intent(this,Day5Task1.class);
        startActivity(intent);
    }

    public void day_5_tsk2(View view) {
        Intent intent = new Intent(this,Day5Task2.class);
        startActivity(intent);
    }

    public void day_5_tsk3(View view) {
        Intent intent = new Intent(this,Day5Task3.class);
        startActivity(intent);
    }

    public void day_5_tsk4(View view) {
        Intent intent = new Intent(this,Day1Task4.class);
        startActivity(intent);
    }

    public void day_5_tsk5(View view) {
        Intent intent = new Intent(this,Day1Task4.class);
        startActivity(intent);
    }

    public void day_5_tsk6(View view) {
        Intent intent = new Intent(this,Day5Task6.class);
        startActivity(intent);
    }
}
