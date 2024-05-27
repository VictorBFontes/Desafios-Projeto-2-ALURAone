public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Artista da musica: " + artista);
        System.out.println("Ano de lançamento da musica: " + anoLancamento);

    }

    void avaliar(double nota) {
        System.out.println("nota: " + nota);
        avaliacao += nota;
        numAvaliacoes++;
    }

    double exibirMedia () {
        return avaliacao / numAvaliacoes;
    }
}
