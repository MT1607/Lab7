package com.gs.firebase1;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.Nullable;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import kotlin.Unit;

public class activity_ketqua extends Activity {
    CircularProgressBar circularProgressBar;
    TextView score;
    int correct,wrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);

        correct=getIntent().getIntExtra("correct",0);
        wrong=getIntent().getIntExtra("wrong",0);

        circularProgressBar = findViewById(R.id.circularProgressBar);
        score = findViewById(R.id.score);

        circularProgressBar.setProgress(correct);
        score.setText(correct+"/10");


    }


}