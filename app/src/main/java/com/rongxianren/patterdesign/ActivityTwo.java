package com.rongxianren.patterdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rongxianren.patterdesign.R;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);
    }

    public void actionTwo(View view) {
        Intent intent = new Intent(this, ActivityOne.class);
        startActivity(intent);
    }
}
