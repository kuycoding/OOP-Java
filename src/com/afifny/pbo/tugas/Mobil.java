package com.afifny.pbo.tugas;

public class Mobil {
    String nama, jenis;

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setNama("City");
        mobil.setJenis("Sedan");
        mobil.cetak();

        mobil.setNama("Visio");
        mobil.setJenis("Sedan");
        mobil.cetak();
    }

    public Mobil() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void cetak(){
        System.out.println("Jenis mobil "+getNama()+" adalah "+getJenis());
    }

    public class KelasA {

        private int memberA = 5;
        private int functionA() {
            return memberA;
        }
        int functionB() {
            // Pemanggilan private member dan private function
            int hasil = functionA() + memberA;
            return hasil;
        }
    }
}
