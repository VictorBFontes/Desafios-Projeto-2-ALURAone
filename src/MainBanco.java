import br.com.desafioalura.modelobanco.ContaBancaria;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner read = new Scanner(System.in);

        conta.setSaldo(2000);

        System.out.println("Insira seu nome:");
        conta.titular = read.nextLine();

        System.out.println("Insira o número de sua conta:");
        conta.setNumeroConta(read.nextInt());

        conta.verificarConta();
    }
}
