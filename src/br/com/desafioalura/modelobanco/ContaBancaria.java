package br.com.desafioalura.modelobanco;

public class ContaBancaria {

private int numeroConta;
private double saldo;
public String titular;

    public void verificarConta() {
            if (numeroConta == 1234) {
                System.out.println("Bem vindo " + titular + ".");
                System.out.println("Número da conta: " + getNumeroConta());
                System.out.println("Seu saldo = R$" + saldo);
            } else {
                    System.out.println("Conta não existente, insira novamente.");
                    verificarConta();
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
