package com.rongxianren.patterdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_one);
    }

    public void actionOne(View view) {
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("--------onResume-------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("--------onStart----------");
    }
}
