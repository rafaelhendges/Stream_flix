import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação das fábricas de filmes e séries
        VideoFactory filmeFactory = new FilmeFactory();
        VideoFactory serieFactory = new SerieFactory();

        // Criar filmes
        List<String> atoresFilme1 = new ArrayList<>();
        atoresFilme1.add("Ator 1");
        atoresFilme1.add("Ator 2");
        Video filme1 = filmeFactory.criarVideo("Filme 1", "Diretor 1", 2020, "Ação", atoresFilme1);

        // Criar séries
        List<String> atoresSerie1 = new ArrayList<>();
        atoresSerie1.add("Ator 7");
        atoresSerie1.add("Ator 8");
        Video serie1 = serieFactory.criarVideo("Série 1", "Diretor 4", 2019, "Suspense", atoresSerie1);

        // Criar usuários
        Usuario usuario1 = new Usuario("Usuário 1", "usuario1@email.com", "senha123");

        // Adicionar filmes e séries aos favoritos
        usuario1.adicionarFavorito(new FilmeAdapter((Filme) filme1));
        usuario1.adicionarFavorito(new SerieAdapter((Serie) serie1));

        // Listar favoritos do usuário
        usuario1.listarFavoritos();
    }
}
