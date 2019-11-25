package com.afifny.pbo.polimorfisme;

public class Kambing extends Hewan {
    public Kambing(String nama, String makanan, int jumlahkaki) {
        super(nama, makanan, jumlahkaki);
    }

    @Override
    public void Bersuara() {
        System.out.println("Mbeek..... Mbek....");
    }
}
