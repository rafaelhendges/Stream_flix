import java.util.List;

// Classe fábrica concreta para criar séries
class SerieFactory implements VideoFactory {
    @Override
    public Video criarVideo(String titulo, String diretor, int anoLancamento, String genero, List<String> listaAtoresPrincipais) {
        return new Serie(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }
}
