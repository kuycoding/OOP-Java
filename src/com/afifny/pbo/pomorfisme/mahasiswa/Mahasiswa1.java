package com.afifny.pbo.pomorfisme.mahasiswa;

public class Mahasiswa1 extends Mahasiswa {
    private String peminat;

    public Mahasiswa1(String nama, String peminat) {
        super(nama);
        this.peminat = peminat;
    }

    @Override
    protected void Kuliah() {
        System.out.println("Saya kuliahprak. PBO");
    }

    @Override
    protected void Bimbingan() {
        System.out.println("Saya Bimbingan KKL");
    }

    public String getPeminat() {
        return peminat;
    }
    public String getNama(){
        return nama;
    }
}
