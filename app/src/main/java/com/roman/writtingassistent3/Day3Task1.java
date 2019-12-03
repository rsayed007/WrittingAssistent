package com.roman.writtingassistent3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Day3Task1 extends AppCompatActivity {
    TextView day3Task1;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3_task1);

        MobileAds.initialize(this,
                "ca-app-pub-5376079706371809~3812378426");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        day3Task1 = findViewById(R.id.day_3_tsk1);
        day3Task1.setMovementMethod(new ScrollingMovementMethod());
    }
}
