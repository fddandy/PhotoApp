package com.example.daria.photoapp;

public class Image {

    private byte[] img;

    Image(byte[] image) {
        this.img = image;
    }

    public byte[] getImage() {
        return img;
    }
}
