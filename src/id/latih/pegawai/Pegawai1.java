package id.latih.pegawai;

public class Pegawai1 extends Pegawai {
    String instansi;
    public Pegawai1(String nama, String alamat, String jenkel, int umur, String instansi) {
        super(nama, alamat, jenkel, umur);
        this.instansi=instansi;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public void SoftwareEnginering(){
        System.out.println("Saya bekerja sebagai Software Enginnering");
    }
}
