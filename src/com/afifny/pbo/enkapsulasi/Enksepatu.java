package com.afifny.pbo.enkapsulasi;

public class Enksepatu {
    public static void main(String[] args) {
        Sepatu sepatu = new Sepatu("Kasogi","Hitam",38);
        System.out.println("Nama Sepatu : " +sepatu.getSepatu() +
                "\nWarna Sepatu : " + sepatu.getWarna() +
                "\nUkuran Sepatu : " +sepatu.getUkuran());
    }
}
