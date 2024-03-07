import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados da pessoa:");
        System.out.print("Nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada do inteiro

        System.out.println("\nDigite os dados da música:");
        System.out.print("Título: ");
        String tituloMusica = scanner.nextLine();
        System.out.print("Duração (em segundos): ");
        int duracaoMusica = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada do inteiro
        System.out.print("Compositor: ");
        String compositorMusica = scanner.nextLine();

        System.out.println("\nDigite os dados do álbum:");
        System.out.print("Gênero: ");
        String generoAlbum = scanner.nextLine();
        System.out.print("Ano: ");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada do inteiro
        System.out.print("Nome: ");
        String nomeAlbum = scanner.nextLine();
        System.out.print("Artista: ");
        String artistaAlbum = scanner.nextLine();

        // Criando objeto Pessoa
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);

        // Criando objeto Música
        Musica musica = new Musica(tituloMusica, duracaoMusica, compositorMusica);

        // Criando objeto Álbum
        ArrayList<Musica> musicasAlbum = new ArrayList<>();
        musicasAlbum.add(musica);
        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum, musicasAlbum);

        // Exibindo os dados
        System.out.println("\nDados da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        System.out.println("\nDados da música:");
        System.out.println("Título: " + musica.getTitulo());
        System.out.println("Duração: " + musica.getDuracao() + "s");
        System.out.println("Compositor: " + musica.getCompositor());

        System.out.println("\nDados do álbum:");
        album.mostraTodosOsDados();

        scanner.close(); // Fechar o scanner ao finalizar a entrada de dados
    }
}
