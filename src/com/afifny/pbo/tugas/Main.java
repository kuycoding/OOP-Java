package com.afifny.pbo.tugas;

public class Main {
    public static void main(String[] args) {
        //inisil
        Product Sandal = new Product("Sandal");
        Product tas = new Product("Tas Rangsel");
        Product kaos = new Product("T-Shirt");
        Product sepatu = new Product("Sepatu");
        Kasir kasir = new Kasir("Septiarini");

        Sandal.Merk("Zadillac");
        Sandal.Harga(125.000);
        Sandal.Ukuran("42");
        Sandal.Warna("Abu-abu");
        Sandal.cetakProduct();

        kasir.Nomor(20);
        kasir.Tanggal("02/10/2019");
        kasir.Jam("15:58:32");
        kasir.cetakKasir();

        tas.Merk("Eiger");
        tas.Harga(325.000);
        tas.Ukuran("-");
        tas.Warna("Hitam");
        tas.cetakProductB();

        kasir.Nomor(20);
        kasir.Tanggal("02/10/2019");
        kasir.Jam("16:03:30");
        kasir.cetakKasirB();

        kaos.Merk("MCB");
        kaos.Harga(120.000);
        kaos.Ukuran("L");
        kaos.Warna("Biru");
        kaos.cetakProductC();

        kasir.cetakKasirB();

        sepatu.Merk("Obsession");
        sepatu.Harga(350.000);
        sepatu.Ukuran("43");
        sepatu.Warna("Coklat Tua");
        sepatu.cetakProductD();
    }
    public static class Product {
        String produk, merk, ukuran, warna;
        double harga;

        public Product(String namaProduk) {
            produk = namaProduk;
        }
        public void Merk(String merkProduct) {
            merk = merkProduct;
        }
        public void Ukuran(String ukuranProduct) {
            ukuran = ukuranProduct;
        }
        public void Warna(String warnaProduct) {
            warna = warnaProduct;
        }
        public void Harga(double hargaProduct) {
            harga = hargaProduct;
        }
        public void cetakProduct() {
            System.out.println("a. Product  : " +produk);
            System.out.println("b. Merk     : " +merk);
            System.out.println("c. Harga    : " +harga);
            System.out.println("d. Ukuran   : " +ukuran);
            System.out.println("e. Warna    : " +warna);
            System.out.println("__________________________\n");
        }
        public void cetakProductB() {
            System.out.println("f. Product  : " +produk);
            System.out.println("g. Merk     : " +merk);
            System.out.println("h. Harga    : " +harga);
            System.out.println("i. Ukuran   : " +ukuran);
            System.out.println("j. Warna    : " +warna);
            System.out.println("__________________________\n");
        }
        public void cetakProductC() {
            System.out.println("k. Product  : " +produk);
            System.out.println("l. Merk     : " +merk);
            System.out.println("m. Harga    : " +harga);
            System.out.println("n. Ukuran   : " +ukuran);
            System.out.println("o. Warna    : " +warna);
            System.out.println("__________________________\n");
        }
        public void cetakProductD() {
            System.out.println("p. Product  : " +produk);
            System.out.println("q. Merk     : " +merk);
            System.out.println("r. Harga    : " +harga);
            System.out.println("s. Ukuran   : " +ukuran);
            System.out.println("t. Warna    : " +warna);
            System.out.println("__________________________\n");
        }
    }
    public static class Kasir {
        String nama, tanggal, jam;
        int nomor;

        public Kasir(String namaKasir){
            nama = namaKasir;
        }
        public void Nomor(int NoKasir) {
            nomor = NoKasir;
        }
        public void Tanggal(String tglKasir) {
            tanggal = tglKasir;
        }
        public void Jam(String jamKasir) {
            jam = jamKasir;
        }
        public void cetakKasir() {
            System.out.println("a. Nomor    : "+nomor);
            System.out.println("b. Nama     : "+nama);
            System.out.println("c. Tanggal  : "+tanggal);
            System.out.println("d. Jam      : "+jam);
            System.out.println("-------------------------");
        }
        public void cetakKasirB() {
            System.out.println("e. Nomor    : "+nomor);
            System.out.println("f. Nama     : "+nama);
            System.out.println("g. Tanggal  : "+tanggal);
            System.out.println("h. Jam      : "+jam);
            System.out.println("-------------------------");
        }
    }
}
