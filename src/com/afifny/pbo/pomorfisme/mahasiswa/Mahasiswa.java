package com.afifny.pbo.pomorfisme.mahasiswa;

public abstract class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    protected abstract void Kuliah();
    protected abstract void Bimbingan();
}
