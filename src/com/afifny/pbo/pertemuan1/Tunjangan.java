package com.afifny.pbo.pertemuan1;

public class Tunjangan {
    int gajiPokok, tunjanganRm, tunjanganTr, tunjanganKel, totalAll;
    String nama, jabatan;

    public static void main(String[] args) {
        Tunjangan joko = new Tunjangan();
        joko.setNama("Joko Susilo");
        joko.setJabatan("Kepala Cabang");
        joko.setGajiPokok(3500000);
        joko.setTunjanganRm(350000);
        joko.setTunjanganTr(250000);
        joko.setTunjanganKel(550000);
        joko.cetakTunjangan();
    }

    public Tunjangan() {

    }
    public void setNama(String nm) {
        nama = nm;
    }
    public String getNama(){
        return nama;
    }

    public void setJabatan(String jabatan1) {
        jabatan = jabatan1;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setGajiPokok(int gajipokok) {
        gajiPokok = gajipokok;
    }
    public int getGajiPokok(){
        return gajiPokok;
    }

    public void setTunjanganRm(int tunRm) {
        tunjanganRm = tunRm;
    }
    public int getTunjanganRm(){
        return tunjanganRm;
    }
    public void setTunjanganTr(int tunTr) {
        tunjanganTr = tunTr;
    }
    public int getTunjanganTr(){
        return tunjanganTr;
    }
    public void setTunjanganKel(int tunKel) {
        tunjanganKel = tunKel;
    }
    public int getTunjanganKel(){
        return tunjanganKel;
    }

    public int getTotalAll() {
        return totalAll = getGajiPokok() + getTunjanganRm() + getTunjanganTr() + getTunjanganKel();
    }

    public void cetakTunjangan(){
        System.out.println("===========================================");
        System.out.println("Nama                : "+getNama());
        System.out.println("Jabatan             : "+getJabatan());
        System.out.println("Gaji Pokok          : "+getGajiPokok());
        System.out.println("Tunjangan Rumah     : "+getTunjanganRm());
        System.out.println("Tunjangan Transport : "+getTunjanganTr());
        System.out.println("Tunjangan Keluarga  : "+getTunjanganKel());
        System.out.println("Seluruh Gaji dan Tunjangan : "+getTotalAll());
    }
}
