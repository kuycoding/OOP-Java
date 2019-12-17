package com.afifny.pbo.pewarisan.hitung.lingkaran;

public class Volume extends Lingkaran {
    private double r1, r2;
    private double h;

    public Volume(double p, double r1 , double r2, double h) {
        super(p);
        this.r1 = r1;
        this.r2 = r2;
        this.h=h;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }

    public double getH() {
        return h;
    }
}
