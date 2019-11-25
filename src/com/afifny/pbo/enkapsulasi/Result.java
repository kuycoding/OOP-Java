package com.afifny.pbo.enkapsulasi;

import java.util.ArrayList;

public class Result {
    public static void main(String[] args) {
        ArrayList dataMatkul = new ArrayList();
        dataMatkul.add("MKT100");
        dataMatkul.add("Android Expert");
        dataMatkul.add(3);
        dataMatkul.add(5);

        for (int i = 0; i < dataMatkul.size(); i++) {
            dataMatkul.get(i);
            System.out.println("Matakuliah " + dataMatkul.get(i));
        }
    }

    public class Mahasiswa {
        private String namaMhs, progdi;
        private double ipk;

        public String getNamaMhs() {
            return namaMhs;
        }

        public void setNamaMhs(String namaMhs) {
            this.namaMhs = namaMhs;
        }

        public String getProgdi() {
            return progdi;
        }

        public void setProgdi(String progdi) {
            this.progdi = progdi;
        }

        public double getIpk() {
            return ipk;
        }

        public void setIpk(double ipk) {
            this.ipk = ipk;
        }
    }
}
