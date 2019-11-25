package com.afifny.pbo.enkapsulasi.jajargenjang;

public class ResultJajarGenjang {
    public static void main(String[] args) {
        JajarGenjang jajarGenjang = new JajarGenjang();
        jajarGenjang.setAlas(9);
        jajarGenjang.setTinggi(10);

        System.out.println("Alas     : " + jajarGenjang.getAlas() );
        System.out.println("Tinggi  : " + jajarGenjang.getTinggi());
        System.out.println("Luas        : " +jajarGenjang.luas());
        System.out.println("Keliling    : " +jajarGenjang.keliling());
    }
}
