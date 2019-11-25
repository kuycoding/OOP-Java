package com.afifny.pbo.pewarisan;

public class Hewan {
    protected int kaki;
    protected String suara;

    public Hewan(int kaki, String suara) {
        this.kaki = kaki;
        this.suara = suara;
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
}
