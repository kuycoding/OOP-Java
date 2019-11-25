package com.afifny.pbo.pomorfisme.mahasiswa;

public class Mahasiswa2 extends Mahasiswa {
    private String pilihan;

    public Mahasiswa2(String nama, String pilihan) {
        super(nama);
        this.pilihan = pilihan;
    }

    @Override
    protected void Kuliah() {
        System.out.println("Saya kuliah testing dan implementasi");
    }

    @Override
    protected void Bimbingan() {
        System.out.println("Saya Bimbingan Skripsi");
    }

    public String getPilihan() {
        return pilihan;
    }
    public String getNama() {
        return nama;
    }
}
