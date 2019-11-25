package com.afifny.pbo.asosiasi.oranggadget;

public class OrangGadget {
    public static void main(String[] args) {
        //objek pemilik
        Pemilik pemilik = new Pemilik("Yeyen");

        //objek laptop
        Laptop laptop = new Laptop("Dell Xps 13");

        //objek hp
        Handphone handphone = new Handphone("Mito","Android");

        //asosiasi pemilik
        laptop.setPemilik(pemilik);
        handphone.setPemilik(pemilik);
        //cetak
        System.out.println("Saudara " + pemilik.getPemilik()
                + " punya 2 gadget, yaitu Laptop " + laptop.getMerk()
                + " dan Handphone " + handphone.getMerk()
                + " yang operasi sistem " +handphone.getJenis());
    }
}
