package com.afifny.pbo.pewarisan;

public class Kucing extends Hewan {
    private String nama;
    private String  warna;

    public Kucing(int kaki, String suara, String nama, String warna) {
        super(kaki, suara);
        this.nama = nama;
        this.warna = warna;
    }
    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }
}
