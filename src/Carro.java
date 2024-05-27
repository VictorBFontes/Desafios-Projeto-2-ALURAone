public class Carro {

    String modelo;
    int ano;
    String cor;

    void exibirDetalhesCarro() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    int calcularIdadeCarro() {
        return 2024 - ano;
    }
}
