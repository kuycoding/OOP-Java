package id.dikotil;

public class Jambubiji {
    protected String namailmiah, kadungan, asal;

    public Jambubiji(String namailmiah, String kadungan, String asal) {
        this.namailmiah = namailmiah;
        this.kadungan = kadungan;
        this.asal = asal;
    }

    public void tampilDikotil(){
        System.out.println("Nama Ilmiah : " +namailmiah);
        System.out.println("Kandungan Vitamin " +kadungan);
        System.out.println("Asal buah : "+asal );
        System.out.println("=====================================");
    }
}
