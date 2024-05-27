import java.util.Scanner;

public class Calculadora {
    Scanner read = new Scanner(System.in);

    int numero;


    int voltarValorDobrado() {
        System.out.println("Insira um numero: ");
        numero = read.nextInt();
      return numero * 2;

    }
}
