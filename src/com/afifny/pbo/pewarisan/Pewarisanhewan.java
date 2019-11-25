package com.afifny.pbo.pewarisan;

public class Pewarisanhewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing(4, "Meong", "Rusian Blue","Merah glowsing");
        System.out.println("KUCING"+"\n");
        System.out.println("Jumlah Kaki : " + kucing.getKaki() +
                "\nSuara : " +kucing.getSuara() +
                "\nJenis Kucing : " +kucing.getNama()+
                "\nWarna Kucing : " +kucing.getWarna());
        System.out.println("=================================");
        // ini kuda
        System.out.println("KUDA"+"\n");
        Kuda kuda = new Kuda(4, "Poni","Kuda Poni",175);
        System.out.println("Jumlah kaki : " +kuda.getKaki() +
                "\nSuara : " +kuda.getSuara() +
                "\nJenis Kuda : " +kuda.getJenis() +
                "\nTinggi Kuda : " +kuda.getTinggi());
    }
}
