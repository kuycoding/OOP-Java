package id.latih.film;

public class FilmTayang {
    public static void main(String[] args) {
        Genre drama = new Genre("Cinta Diufuk Barat","Js. Mamam","Joe sinchan","Menceritakan tentang ah","20:00 WIB","Drama");
        Genre action = new Genre("IP Man4","Yipman","Sin Tae Young","Berperang melawan pengedar jambu biji","13:00 WIB","Action");
        System.out.println("=====================================");
        System.out.println("Judul Film : " + drama.getJudul() + "\n" +
                "Sutradara : " +drama.getSutradara()+ "\n" +
                "Aktor : " +drama.getAktor()+"\n" +
                "Deskripsi : " +drama.getDeskripsi()+"\n" +
                "Genre : " +drama.getGenre()+"\n" +
                "Tayang : "+drama.getTayang());

        System.out.println("=====================================");
        System.out.println("Judul Film : " + action.getJudul() + "\n" +
                "Sutradara : " +action.getSutradara()+ "\n" +
                "Aktor : " +action.getAktor()+"\n" +
                "Deskripsi : " +action.getDeskripsi()+"\n" +
                "Genre : " +action.getGenre()+"\n" +
                "Tayang : "+action.getTayang());
    }
}
