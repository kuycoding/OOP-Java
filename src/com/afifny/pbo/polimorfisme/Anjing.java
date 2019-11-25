package com.afifny.pbo.polimorfisme;

public class Anjing extends Hewan {
    public Anjing(String nama, String makanan, int jumlahkaki) {
        super(nama, makanan, jumlahkaki);
    }

    @Override
    public void Bersuara() {
        System.out.println("Guk... Guk... Guk...");
    }
}
