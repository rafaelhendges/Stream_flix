import java.util.List;

// Classe fábrica concreta para criar filmes
class FilmeFactory implements VideoFactory {
    @Override
    public Video criarVideo(String titulo, String diretor, int anoLancamento, String genero, List<String> listaAtoresPrincipais) {
        return new Filme(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }
}
