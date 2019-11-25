package com.afifny.pbo.enkapsulasi.jajargenjang;

public class JajarGenjang {
    private int alas, tinggi;

    public int getAlas() {
        return alas;
    }

    void setAlas(int alas) {
        this.alas = alas;
    }

    int getTinggi() {
        return tinggi;
    }

    void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public JajarGenjang() {
        int alas = 0;
        int tinggi = 0;
    }

    int luas() {
        return alas * tinggi;
    }

    int keliling() {
        return 2 * (alas + tinggi);
    }
}
