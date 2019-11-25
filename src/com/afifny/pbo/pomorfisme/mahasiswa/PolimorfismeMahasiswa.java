package com.afifny.pbo.pomorfisme.mahasiswa;

public class PolimorfismeMahasiswa {
    public static void main(String[] args) {
        Mahasiswa1 mahasiswa1 = new Mahasiswa1("Agung","Sistem Cerdas");
        System.out.println("Nama : " +mahasiswa1.getNama());
        System.out.println("Peminatan : " +mahasiswa1.getPeminat());
        mahasiswa1.Bimbingan();
        mahasiswa1.Kuliah();
        System.out.println("================================");
        Mahasiswa2 mahasiswa2 = new Mahasiswa2("AA Gym","Sistem Pakar");
        System.out.println("Nama : " +mahasiswa2.getNama());
        System.out.println("Pilihan : " +mahasiswa2.getPilihan());
        mahasiswa2.Bimbingan();
        mahasiswa2.Kuliah();
    }
}
