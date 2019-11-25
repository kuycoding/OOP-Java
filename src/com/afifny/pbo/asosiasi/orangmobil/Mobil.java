package com.afifny.pbo.asosiasi.orangmobil;

public class Mobil {
    private String nopol, merk;
    private Pemilik orang;

    public void setMobil(String nopol, String merk) {
        this.nopol = nopol;
        this.merk = merk;
    }
    //relasi antara mobil dg pemilik (orangy)
    public void setPemilik(Pemilik orang) {
        this.orang = orang;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
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
