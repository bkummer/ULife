package com.limerick.cs4028.ulife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiningActivity extends CategoryActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_dining);
    }

    public void onClickOnCampus(View view){
        Intent intent = new Intent(this, OnCampusActivity.class);
        startActivity(intent);
    }

    public void onClickNearCampus(View view){
        Intent intent = new Intent(this, NearCampusActivity.class);
        startActivity(intent);
    }
}

