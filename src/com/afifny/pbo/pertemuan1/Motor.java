package com.afifny.pbo.pertemuan1;

public class Motor {
    //attr
    String merk;
    int nopol, cc;

    //konstruktor
    public Motor() {

    }
    //method set merk
    public void setMerk(String mrk) {
        merk=mrk;
    }
    //method tampil merk
    public String getMerk() {
        return merk;
    }
    //method set nopol
    public void setNopol(int np) {
        nopol=np;
    }
    //method tampil nopol
    public int getNopol() {
        return nopol;
    }
    //method set cc
    public void setCc(int ccmotor) {
        cc=ccmotor;
    }
    //method tampil cc
    public int getCc() {
        return cc;
    }

    public void cetakMotor() {
        System.out.println("___Merk Kendaraan___");
        System.out.println("Merkr Motor     : "+getMerk());
        System.out.println("Nomor Polisi    : "+getNopol());
        System.out.println("CC kendaraan    : "+getCc());
        System.out.println("==========================");
    }
}
