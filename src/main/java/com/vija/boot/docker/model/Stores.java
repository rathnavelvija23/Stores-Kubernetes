package com.vija.boot.docker.model;

public class Stores {

    private int storeId;
    private String storeName;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Stores(int storeId, String storeName) {
        this.storeId = storeId;
        this.storeName = storeName;
    }
}
