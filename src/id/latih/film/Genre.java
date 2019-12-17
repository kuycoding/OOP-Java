package id.latih.film;

public class Genre extends Film {
    String genre;

    public Genre(String judul, String sutradara, String aktor, String deskripsi, String tayang, String genre) {
        super(judul, sutradara, aktor, deskripsi, tayang);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
