package com.afifny.pbo.enkapsulasi;

public class Mobil {
    private String DataMobil;
    private String Warna;
    private int ThProduksi;
    private String Pabrikan;

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setDataMobil("\n Civic Type R FK8" +
                "\n 4 Tempat duduk " +
                "\n Bahan Bakar Bensin" +
                "Sport Car");
        mobil.setWarna("Merah");
        mobil.setThProduksi(2019);
        mobil.setPabrikan("Astra Honda Motor");
        mobil.cetakMobil();
    }

    private String getDataMobil() {
        return DataMobil;
    }

    private void setDataMobil(String dataMobil) {
        DataMobil = dataMobil;
    }

    private String getWarna() {
        return Warna;
    }

    private void setWarna(String warna) {
        Warna = warna;
    }

    private int getThProduksi() {
        return ThProduksi;
    }

    private void setThProduksi(int thProduksi) {
        ThProduksi = thProduksi;
    }

    private String getPabrikan() {
        return Pabrikan;
    }

    private void setPabrikan(String pabrikan) {
        Pabrikan = pabrikan;
    }
    private void cetakMobil() {
        System.out.println("Data Mobil           : " +getDataMobil());
        System.out.println("Warna                  : " +getWarna());
        System.out.println("Tahun Produksi   : " +getThProduksi());
        System.out.println("Pabrikan              : " +getPabrikan());
    }
}
