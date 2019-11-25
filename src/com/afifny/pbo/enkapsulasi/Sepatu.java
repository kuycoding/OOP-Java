package com.afifny.pbo.enkapsulasi;

public class Sepatu {
    private String sepatu, warna;
    private int ukuran;

    public Sepatu(String sepatu, String warna, int ukuran) {
        this.sepatu = sepatu;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    public String getSepatu() {
        return sepatu;
    }

    public void setSepatu(String sepatu) {
        this.sepatu = sepatu;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
}
