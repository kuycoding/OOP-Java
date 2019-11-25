package com.afifny.pbo.asosiasi.orangmobil;

public class OrangMobil {
    public static void main(String[] args) {
        //objek pemilik
        Pemilik pemilik = new Pemilik("Afif" );

        //objek mobil
         Mobil mobil = new Mobil();
         mobil.setMobil("K 4444 QQ", "Honda Civic Type-R");

        //asosiasikan pemilik dan mobil
        mobil.setPemilik(pemilik);

        System.out.println("Pak " + pemilik.getPemilik()
        + " adalah orang yang punya mobil  " + mobil.getMerk() + " bernopol " +mobil.getNopol());
    }
}
