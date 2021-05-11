package com.example.explitcitintent23032021;

import java.io.File;
import java.io.Serializable;

public class DataImages implements Serializable {
    File image;

    public DataImages(File image) {
        this.image = image;
    }
}
