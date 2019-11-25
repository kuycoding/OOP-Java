package com.afifny.pbo.enkapsulasi;

public class Mahasiswa {
    public static void main(String[] args) {
        DataMhs dataMhs = new DataMhs();
        dataMhs.setNamaMhs("Afif Nor Yusuf");
        dataMhs.setIpk(4.0);
        dataMhs.setProgdi("Teknik Informatika");

        Matkul matkul = new Matkul();
        matkul.setKode("MKT001");
        matkul.setSemester(4);
        matkul.setMatkul("Android Developer Expert");
        matkul.setSks(3);

        Matkul matkul1 = new Matkul();
        matkul1.setKode("MKT002");
        matkul1.setSemester(4);
        matkul1.setMatkul("Kotlin Developer Expert");
        matkul1.setSks(3);

        System.out.println("=================================");
        System.out.println("Nama Mahasiswa  : " +dataMhs.getNamaMhs());
        System.out.println("Program Studi       : " +dataMhs.getProgdi());
        System.out.println("=================================");
        System.out.println("IPK                        : " +dataMhs.getIpk());
        System.out.println("=================================");
        System.out.println("Matakuliah");
        System.out.println("Kode Matakuliah     : " +matkul.getKode());
        System.out.println("Nama Matakuliah    : " +matkul.getMatkul());
        System.out.println("SKS                        : " +matkul.getSks());
        System.out.println("Semester               : " +matkul.getSemester());
        System.out.println("=================================");
        System.out.println("Matakuliah");
        System.out.println("Kode Matakuliah     : " +matkul1.getKode());
        System.out.println("Nama Matakuliah    : " +matkul1.getMatkul());
        System.out.println("SKS                        : " +matkul1.getSks());
        System.out.println("Semester               : " +matkul1.getSemester());
    }

    public static class DataMhs {
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
    public static class Matkul {
        private String kode, matkul;
        private int sks, semester;

        public String getKode() {
            return kode;
        }

        public void setKode(String kode) {
            this.kode = kode;
        }

        public String getMatkul() {
            return matkul;
        }

        public void setMatkul(String matkul) {
            this.matkul = matkul;
        }

        public int getSks() {
            return sks;
        }

        public void setSks(int sks) {
            this.sks = sks;
        }

        public int getSemester() {
            return semester;
        }

        public void setSemester(int semester) {
            this.semester = semester;
        }
    }
}