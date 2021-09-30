package com.example.test;

import com.google.gson.annotations.SerializedName;

public class Name {
    @SerializedName("success")
    boolean success;

    @SerializedName("status")
    int status;

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
}
