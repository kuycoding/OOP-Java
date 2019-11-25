package com.afifny.pbo.polimorfisme;

public class Hewan {
    protected String nama, makanan;
    protected int jumlahkaki;

    public Hewan(String nama, String makanan, int jumlahkaki) {
        this.nama = nama;
        this.makanan = makanan;
        this.jumlahkaki = jumlahkaki;
    }

    public String getNama() {
        return nama;
    }

    public String getMakanan() {
        return makanan;
    }

    public int getJumlahkaki() {
        return jumlahkaki;
    }
    public void tampilHewan() {
        System.out.println("Hewan : " +nama+"\n"
        +"Makanan : " +makanan+"\n"
        +"Jumlah kaki : " +jumlahkaki);
    }
    public void  Bersuara() {
        System.out.println("Suara hewan.................");
    }
}
