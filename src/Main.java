public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Musica musica = new Musica();
        Carro carro = new Carro();
        Aluno alunos = new Aluno();

        musica.titulo = "loonboon";
        musica.artista = "Laura shigihara";
        musica.anoLancamento = 2010;

        carro.modelo = "Fiat Uno";
        carro.cor = "Branco";
        carro.ano = 2006;

        alunos.nome = "Julinho Spageto";
        alunos.idade = 21;

        pessoa1.metodo();
        System.out.println(calculadora.voltarValorDobrado());
        musica.exibirFichaTecnica();

        musica.avaliar(10);
        musica.avaliar(8.3);
        musica.avaliar(6);
        musica.avaliar(9.5);

        System.out.println("Media de notas da musica: " + musica.exibirMedia());

        carro.exibirDetalhesCarro();
        System.out.println("O carro tem: " + carro.calcularIdadeCarro() + " anos");

        alunos.exibirInformacoes();
    }
}
