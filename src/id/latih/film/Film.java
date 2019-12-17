package id.latih.film;

public class Film {
    String judul, sutradara, aktor, deskripsi, tayang;

    public Film(String judul, String sutradara, String aktor, String deskripsi, String tayang) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.aktor = aktor;
        this.deskripsi = deskripsi;
        this.tayang = tayang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTayang() {
        return tayang;
    }

    public void setTayang(String tayang) {
        this.tayang = tayang;
    }
}
