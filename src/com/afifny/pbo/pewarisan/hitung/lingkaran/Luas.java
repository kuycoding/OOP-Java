package com.afifny.pbo.pewarisan.hitung.lingkaran;

public class Luas extends Lingkaran {
    private double r1, r2;

    public Luas(double p, double r1, double r2) {
        super(p);
        this.r1 =  r1;
        this.r2 = r2;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }
    public double getLuas(){
        double luas =  getP() * getR1() * getR2();
        return luas;
    }
}
