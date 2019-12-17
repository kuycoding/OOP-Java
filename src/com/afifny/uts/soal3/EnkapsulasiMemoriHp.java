package com.afifny.uts.soal3;

public class EnkapsulasiMemoriHp {
    public static void main(String[] args) {
        MemoriHp memoriHp = new MemoriHp("Thosiba",  "Kecil", 14 );
        System.out.println("Merk Memori HP : "+memoriHp.getMerk()  +"\n" +
                "Ukuran memori : " + memoriHp.getUkuran()+"\n" +
                "Kapasitas Memori : " + memoriHp.getKapasitas() +"GB");
    }
}
