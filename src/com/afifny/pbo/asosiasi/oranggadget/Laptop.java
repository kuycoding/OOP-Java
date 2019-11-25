package com.afifny.pbo.asosiasi.oranggadget;

public class Laptop {
    private String merk;
    private Pemilik orang;

    public Laptop(String merk) {
        this.merk = merk;
    }
    //relasi antar laptop denga orang
    public void  setPemilik(Pemilik orang) {
        this.orang = orang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Pemilik getOrang() {
        return orang;
    }

    public void setOrang(Pemilik orang) {
        this.orang = orang;
    }
}
