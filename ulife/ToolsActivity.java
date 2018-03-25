package com.limerick.cs4028.ulife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ToolsActivity extends CategoryActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_tools);
    }


    public void onClickTimerActivity(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }


    public void onClickToDoListActivity(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }
}