// Implementação do adaptador para séries
class SerieAdapter implements VideoAdapter {
    private Serie serie;

    // Construtor com validação
    public SerieAdapter(Serie serie) {
        if (serie == null) {
            throw new IllegalArgumentException("Serie não pode ser nula");
        }
        this.serie = serie;
    }

    @Override
    public Video getVideo() {
        return serie;
    }
}
