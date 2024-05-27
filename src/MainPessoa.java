import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        IdadePessoa pessoaIdade = new IdadePessoa();
        Scanner read = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        pessoaIdade.setNome(read.nextLine());

        System.out.println("Insira sua idade:");
        pessoaIdade.setIdade(read.nextInt());

        pessoaIdade.verificarIdade();

    }
}