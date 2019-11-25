package com.afifny.pbo.asosiasi.oranggadget;

public class Handphone {
    private String merk, jenis;
    private Pemilik orang;

    public Handphone(String merk, String jenis) {
        this.merk = merk;
        this.jenis = jenis;
    }
    public void setPemilik(Pemilik orang) {
        this.orang = orang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Pemilik getOrang() {
        return orang;
    }

    public void setOrang(Pemilik orang) {
        this.orang = orang;
    }
}
