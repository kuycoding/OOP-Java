package id.monokotil;

public class Kelapasawit {
    protected String namailmiah, kegunaan;

    public Kelapasawit(String namailmiah, String kegunaan) {
        this.namailmiah = namailmiah;
        this.kegunaan = kegunaan;
    }

    public void tampilmonokotil() {
        System.out.println("Nama Ilmiah : " +namailmiah);
        System.out.println("Kegunaan : " +kegunaan);
        System.out.println("===========================");
    }
}
