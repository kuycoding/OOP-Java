package com.afifny.pbo.enkapsulasi;

public class Buah {
    private String nama, raasa;
    private double harga;

    public Buah(String nama, String raasa, double harga) {
        this.nama = nama;
        this.raasa = raasa;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRaasa() {
        return raasa;
    }

    public void setRaasa(String raasa) {
        this.raasa = raasa;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
