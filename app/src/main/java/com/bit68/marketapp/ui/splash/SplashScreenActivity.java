package com.bit68.marketapp.ui.splash;

import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;


import com.bit68.marketapp.ui.introduction.IntroductionActivity;

import androidx.appcompat.app.AppCompatActivity;


public class SplashScreenActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Duration of wait
        int SPLASH_DISPLAY_LENGTH = 2000;

        new Handler().postDelayed(() -> {
                startActivity(new Intent(SplashScreenActivity.this, IntroductionActivity.class));
                finish();
        }, SPLASH_DISPLAY_LENGTH);

    }
}
