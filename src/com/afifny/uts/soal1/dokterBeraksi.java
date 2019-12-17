package com.afifny.uts.soal1;

public class dokterBeraksi {
    public static void main(String[] args) {
        Dokter dokter = new Dokter();
        dokter.setNama("Wahyu");
        dokter.setJabatan("Kepala Puskesmas");
        dokter.setPembantuA("Administratsi");
        dokter.setPembantuB("Perawat");
        dokter.setJumlahPasien(30);
        dokter.cetakDokter();
    }
}
