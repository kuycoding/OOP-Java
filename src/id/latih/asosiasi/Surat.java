package id.latih.asosiasi;

public class Surat {
    private String nama, alamat;
    private Pegawai pegawai;
    int telp;

    public Surat(String nama, String alamat, int telp) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
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

    public int getTelp() {
        return telp;
    }

    public void setTelp(int telp) {
        this.telp = telp;
    }
}
