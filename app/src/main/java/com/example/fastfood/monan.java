package com.example.fastfood;

public class monan {
    int idAnh;
    String tenMA;
    int giaTien;

    public monan(int idAnh, String tenMA, int giaTien) {
        this.idAnh = idAnh;
        this.tenMA = tenMA;
        this.giaTien = giaTien;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }

    public String getTenMA() {
        return tenMA;
    }

    public void setTenMA(String tenMA) {
        this.tenMA = tenMA;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
}
