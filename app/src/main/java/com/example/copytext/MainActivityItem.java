package com.example.copytext;

public class MainActivityItem {
    int img;
    String titel;

    public MainActivityItem(int img, String titel) {
        this.img = img;
        this.titel = titel;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
