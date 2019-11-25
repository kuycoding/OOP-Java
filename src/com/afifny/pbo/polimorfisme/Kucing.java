package com.afifny.pbo.polimorfisme;

public class Kucing extends Hewan {
    public Kucing(String nama, String makanan, int jumlahkaki) {
        super(nama, makanan, jumlahkaki);
    }

    @Override
    public void Bersuara() {
        System.out.println("Miow....... Miow.......");
    }
}
