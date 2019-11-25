package com.afifny.pbo.pewarisan;

public class Kuda extends Hewan {
    private String jenis;
    private int tinggi;

    public Kuda(int kaki, String suara, String jenis, int tinggi) {
        super(kaki, suara);
        this.jenis =  jenis;
        this.tinggi = tinggi;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTinggi() {
        return tinggi;
    }
}
