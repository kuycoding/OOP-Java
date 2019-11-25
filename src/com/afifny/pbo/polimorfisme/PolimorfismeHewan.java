package com.afifny.pbo.polimorfisme;

public class PolimorfismeHewan {
    public static void main(String[] args) {
        //Anjing
        Anjing anjing = new Anjing("Anjing melati","Sayur Kol",4);
        //Kambing
        Kambing kambing = new Kambing("Erawa", "Rumput", 4);
        //Kucing
        Kucing kucing = new Kucing("Anggora", "Wishkas",4);
        anjing.tampilHewan();
        anjing.Bersuara();
        System.out.println("================================");
        kambing.tampilHewan();
        kambing.Bersuara();
        System.out.println("================================");
        kucing.tampilHewan();
        kucing.Bersuara();
    }
}
