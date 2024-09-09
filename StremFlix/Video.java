import java.util.List;

// Classe abstrata para representar vídeos
abstract class Video {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;
    private List<String> listaAtoresPrincipais;

    // Construtor
    public Video(String titulo, String diretor, int anoLancamento, String genero, List<String> listaAtoresPrincipais) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.listaAtoresPrincipais = listaAtoresPrincipais;
    }

    // Métodos de acesso
    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public List<String> getListaAtoresPrincipais() {
        return listaAtoresPrincipais;
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + titulo + "\nDiretor: " + diretor + "\nAno de Lançamento: " + anoLancamento +
               "\nGênero: " + genero + "\nAtores Principais: " + listaAtoresPrincipais.toString();
    }
}

// Classe Filme
class Filme extends Video {
    public Filme(String titulo, String diretor, int anoLancamento, String genero, List<String> listaAtoresPrincipais) {
        super(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

// Classe Série
class Serie extends Video {
    public Serie(String titulo, String diretor, int anoLancamento, String genero, List<String> listaAtoresPrincipais) {
        super(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
