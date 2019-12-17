package com.afifny.uts.soal1;

public class Dokter {
    private String nama, jabatan, pembantuA, pembantuB;
    private int jumlahPasien;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPembantuA() {
        return pembantuA;
    }

    public void setPembantuA(String pembantuA) {
        this.pembantuA = pembantuA;
    }

    public String getPembantuB() {
        return pembantuB;
    }

    public void setPembantuB(String pembantuB) {
        this.pembantuB = pembantuB;
    }

    public int getJumlahPasien() {
        return jumlahPasien;
    }

    public void setJumlahPasien(int jumlahPasien) {
        this.jumlahPasien = jumlahPasien;
    }
    public void cetakDokter(){
        System.out.println("Nama dokter : " +getNama());
        System.out.println("Jabatan beliau : " +getJabatan());
        System.out.println("Ia dibantu oleh 1 : "+getPembantuA() + " dan " +getPembantuB());
        System.out.println("Jumlah Pasien tiap harinya : " +getJumlahPasien());
    }
}
