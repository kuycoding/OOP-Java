package com.afifny.pbo.pewarisan.hitung.lingkaran;

public class PewarisanLingkaran {
    public static void main(String[] args) {
        Luas luas = new Luas(3.14,7,7);
        luas.getLuas();
        System.out.println("Hasil volume dari  " +luas.getP() + " * " +luas.getR1() + " * " +luas.getR2() +" adalah " +luas.getLuas()  );
    }
}
