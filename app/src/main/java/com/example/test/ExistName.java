package com.example.test;

import com.google.gson.annotations.SerializedName;

public class ExistName {
    @SerializedName("success")
    boolean success;

    @SerializedName("status")
    int status;

    @SerializedName("data")
    String data;

    public int getStatus() {
        return status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
