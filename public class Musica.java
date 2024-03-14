public class Musica {
    private String nome;
    private String artista;

    // Construtor
    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
