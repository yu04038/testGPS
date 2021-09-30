package com.example.test;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("latitude")
    private double latitude;

    @SerializedName("longitude")
    private double longitude;

    @SerializedName("name")
    private String name;

    @SerializedName("speed")
    private double speed;

    @SerializedName("success")
    private boolean success;

    @SerializedName("status")
    private int status;

    @SerializedName("data")
    private Data data;

    public class Data {
        @SerializedName("id")
        int id;

        @SerializedName("name")
        String name;

        @SerializedName("latitude")
        double latitude;

        @SerializedName("longitude")
        double longitude;

        @SerializedName("createdAt")
        String createdAt;

        public int getId() { return id; }

        public void setId(int id) { this.id = id; }

        public String getNameData() {return name;}

        public void setNameData(String name) {
            this.name = name;
        }

        public double getLatitude() {return latitude;}

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() { return longitude;}

        public void setLongitude(double longitude) { this.longitude = longitude;}

        public String getCreatedAt() { return createdAt; }

        public void setCreatedAt(String createdAt) { this.createdAt = createdAt;}
    }

    public Data getData() {
        return data;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public boolean getSuccess() {
        return success;
    }

    public int getStatus() {
        return status;
    }

    public double getSpeed() {return speed;}

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSpeed(double speed) { this.speed = speed;}
}
