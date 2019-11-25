package com.afifny.pbo.enkapsulasi;

public class Enkapsulasibuah {
    public static void main(String[] args) {
        Buah buah= new Buah("Jeruk","Asam",12000);
        System.out.println("Nama buah " + buah.getNama() +
                "\nRasa : " +buah.getRaasa() +
                "\nHarga : " + +buah.getHarga());
    }
}
