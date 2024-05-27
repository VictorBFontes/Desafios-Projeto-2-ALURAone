public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto) {
        double valorDesconto = (desconto / 100);
        System.out.println(valorDesconto);
        double precoFinal = (getPreco() * valorDesconto);
        System.out.println(precoFinal);
        System.out.println("Preço final: " + (getPreco() - precoFinal));
    }

}
