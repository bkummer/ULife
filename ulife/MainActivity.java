package com.limerick.cs4028.ulife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_main);
    }


    public void onClickTimetableActivity(View view){
        Intent intent = new Intent(this, TimetableActivity.class);
        startActivity(intent);
    }

    public void onClickNavigationActivity(View view) {
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);
    }
    public void onClickDiningActivity(View view) {
        Intent intent = new Intent(this, DiningActivity.class);
        startActivity(intent);
    }
    public void onClickULLifeHacksActivity(View view) {
        Intent intent = new Intent(this, ULLifeHacksActivity.class);
        startActivity(intent);
    }
    public void onClickToolsActivity(View view) {
        Intent intent = new Intent(this, ToolsActivity.class);
        startActivity(intent);
    }
    public void onClickSocialActivity(View view) {
        Intent intent = new Intent(this, SocialActivity.class);
        startActivity(intent);
    }
}