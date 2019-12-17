package id.latih.pegawai;

public class PoliPegawai {
    public static void main(String[] args) {
//        objek ana
        Pegawai1 ana = new Pegawai1("Ana nur","Mayong","Perempuan",23,"PT. Software Maju");
        System.out.println("Nama : " +ana.getNama());
        System.out.println("Alamat : " +ana.getAlamat());
        System.out.println("Jenis Kelamin : " +ana.getJenkel());
        System.out.println("Umur : " +ana.getUmur());
        System.out.println("Berkerja di : " +ana.getInstansi());
        ana.SoftwareEnginering();
        System.out.println("=====================================");
    }
}
