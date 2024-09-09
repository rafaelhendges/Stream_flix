// Implementação do adaptador para filmes
class FilmeAdapter implements VideoAdapter {
    private Filme filme;

    // Construtor com validação
    public FilmeAdapter(Filme filme) {
        if (filme == null) {
            throw new IllegalArgumentException("Filme não pode ser nulo");
        }
        this.filme = filme;
    }

    @Override
    public Video getVideo() {
        return filme;
    }
}
