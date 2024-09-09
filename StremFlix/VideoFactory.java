import java.util.List;

// Interface para a fábrica abstrata de vídeos
interface VideoFactory {
    Video criarVideo(String titulo, String diretor, int anoLancamento, String genero, List<String> listaAtoresPrincipais);
}
