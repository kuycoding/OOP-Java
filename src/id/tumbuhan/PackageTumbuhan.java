package id.tumbuhan;

import id.dikotil.Jambubiji;
import id.monokotil.Kelapasawit;

public class PackageTumbuhan {
    public static void main(String[] args) {
        //kelapa sawit (Elais guinensiss jacq) kegunaan minyak goreng
        Kelapasawit kelapasawit = new Kelapasawit("Elais Guinensis Jacq","Miinyak Goreng");
        kelapasawit.tampilmonokotil();
        //Jambu (Psidium Guava) kandungan vitamin C Asal Brazil
        Jambubiji jambubiji = new Jambubiji("Psidium Guava","Vitamin C","Brazil");
        jambubiji.tampilDikotil();
    }
}
