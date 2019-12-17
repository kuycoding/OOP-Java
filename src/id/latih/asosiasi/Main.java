package id.latih.asosiasi;

public class Main {

    public static void main(String[] args) {
        Pegawai pegawaiAndi = new Pegawai("Andi Matalata");
        Surat suratAni = new Surat("Ani sulis","Jl. Bunga nomor 2",628912122);
       //asosisasi
        suratAni.setPegawai(pegawaiAndi);
        System.out.println("Pak pos "+pegawaiAndi.getPegawai()+" menghantarkan surat ke rumah "+suratAni.getNama()+" yang beralamat di " +
                 suratAni.getAlamat() + " telepon " +suratAni.getTelp());
    }
}
