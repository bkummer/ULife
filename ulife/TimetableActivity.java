package com.limerick.cs4028.ulife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TimetableActivity extends CategoryActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_timetable);
    }
}

