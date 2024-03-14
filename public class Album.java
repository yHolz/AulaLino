public class Album {
    private String nome;
    private int anoLancamento;
    private String[] musicas;

    // Construtor
    public Album(String nome, int anoLancamento, String[] musicas) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String[] getMusicas() {
        return musicas;
    }

    public void setMusicas(String[] musicas) {
        this.musicas = musicas;
    }

    // Método para exibir informações do álbum
    public void exibirInformacoes() {
        System.out.println("Nome do Álbum: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Músicas:");
        for (String musica : musicas) {
            System.out.println("- " + musica);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        String[] musicasDoAlbum = {"Música 1", "Música 2", "Música 3"};
        Album meuAlbum = new Album("Meu Álbum", 2024, musicasDoAlbum);
        meuAlbum.exibirInformacoes();
    }
}
