package com.afifny.pbo.pertemuan1;

public class Pkendaraan {
    public static void main(String[] args) {
        Motor honda = new Motor();
        honda.setMerk("SupraX");
        honda.setNopol(3360);
        honda.setCc(110);
        honda.cetakMotor();

        Motor yamaha = new Motor();
        yamaha.setMerk("Mio GT");
        yamaha.setNopol(3110);
        yamaha.setCc(100);
        yamaha.cetakMotor();
    }
}
