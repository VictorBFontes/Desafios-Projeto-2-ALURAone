public class IdadePessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("O " + getNome() + " é maior de idade (" + getIdade() + " anos)");
        } else {
            System.out.println("O " + getNome() + " é menor de idade (" + getIdade() + " anos)");
        }
    }

}
