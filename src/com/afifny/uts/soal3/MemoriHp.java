package com.afifny.uts.soal3;

public class MemoriHp {
    private String merk;
    private String ukuran;
    private int kapasitas;

    public MemoriHp(String merk, String ukuran, int kapasitas) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.kapasitas = kapasitas;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
