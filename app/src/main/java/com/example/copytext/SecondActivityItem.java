package com.example.copytext;

public class SecondActivityItem {
    private String txtSms;
    private int imgCopy;
    private  int imgShare;

    public SecondActivityItem(String txtSms, int imgCopy, int imgShare) {
        this.txtSms = txtSms;
        this.imgCopy = imgCopy;
        this.imgShare = imgShare;
    }

    public String getTxtSms() {
        return txtSms;
    }

    public void setTxtSms(String txtSms) {
        this.txtSms = txtSms;
    }

    public int getImgCopy() {
        return imgCopy;
    }

    public void setImgCopy(int imgCopy) {
        this.imgCopy = imgCopy;
    }

    public int getImgShare() {
        return imgShare;
    }

    public void setImgShare(int imgShare) {
        this.imgShare = imgShare;
    }
}
