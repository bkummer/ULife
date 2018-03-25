package com.limerick.cs4028.ulife;

/**
 * Created by Brian on 3/24/18.
 */

public class Building {
    private String name;
    private String description;
    private int imageResourceId;
    private double lat;
    private double lng;

    public Building(String name, String description, int imageResourceId, double lat, double lng) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.lat = lat;
        this.lng = lng;
    }


    public static final Building[] buildings = {
            new Building("CSIS", "Building with Computers", R.mipmap.ic_csis_, 52.674594, -8.575550)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
