package modelos;

public class Cancion extends Audio {
    private String album;
    private String genero;

    // Constructor
    public Cancion(String titulo, String artista, String album, String genero) {
        super(titulo, artista);
        this.album = album;
        this.genero = genero;
    }

    // Getters y Setters
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
