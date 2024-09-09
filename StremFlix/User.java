import java.util.ArrayList;
import java.util.List;

// Classe Usuário
class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<VideoAdapter> listaFavoritos;

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaFavoritos = new ArrayList<>();
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Adicionar favoritos
    public void adicionarFavorito(VideoAdapter videoAdapter) {
        if (!listaFavoritos.contains(videoAdapter)) {
            listaFavoritos.add(videoAdapter);
        } else {
            System.out.println("Esse vídeo já está na lista de favoritos.");
        }
    }

    // Remover favoritos
    public void removerFavorito(VideoAdapter videoAdapter) {
        listaFavoritos.remove(videoAdapter);
    }

    // Listar favoritos
    public void listarFavoritos() {
        System.out.println("Lista de Séries/Filmes Favoritos de " + nome);
        for (VideoAdapter videoAdapter : listaFavoritos) {
            Video video = videoAdapter.getVideo();
            System.out.println("Título: " + video.getTitulo() + " - Diretor: " + video.getDiretor());
        }
    }
}
