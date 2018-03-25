package com.limerick.cs4028.ulife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

public class BuildingDetailsActivity extends AppCompatActivity {

    private int buildingId;
    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_details);

        buildingId = (Integer) getIntent().getExtras().get("com.kumballz.brian.EXTRA_BUILDINGID");
        //TODO: check buildingId valid
        Building building = Building.buildings[buildingId];

        TextView tvName = findViewById(R.id.name);
        tvName.setText(building.getName());

        TextView tvDescription = findViewById(R.id.description);
        tvDescription.setText(building.getDescription());

        ImageView ivBuilding = findViewById(R.id.imageBuilding);
        ivBuilding.setImageResource(building.getImageResourceId());
        ivBuilding.setContentDescription(building.getName());

    }

    public void onClickStuff(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }
}
