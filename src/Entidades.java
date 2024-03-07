import java.util.ArrayList;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Musica {
    private String titulo;
    private int duracao;
    private String compositor;

    public Musica(String titulo, int duracao, String compositor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica() {
        System.out.println("Tocando música: " + getTitulo());
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getCompositor() {
        return compositor;
    }
}

class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, String artista, ArrayList<Musica> musicas) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void mostraTodosOsDados() {
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Nome: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Músicas:");
        for (Musica musica : musicas) {
            System.out.println(" - " + musica.getTitulo() + " (" + musica.getCompositor() + ") - " + musica.getDuracao() + "s");
        }
    }
}

