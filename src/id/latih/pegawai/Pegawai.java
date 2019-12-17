package id.latih.pegawai;

public class Pegawai {
    String nama, alamat, jenkel;
    int umur;

    public Pegawai(String nama, String alamat, String jenkel, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenkel = jenkel;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampilPegawai() {
        System.out.println("Nama pegawai : " +nama+"\n" +
                "Alamat Pegawai : " +alamat+"\n" +
                "Jenis Kelamin : " +jenkel+"\n" +
                "Umur : " +umur);
    }
}
