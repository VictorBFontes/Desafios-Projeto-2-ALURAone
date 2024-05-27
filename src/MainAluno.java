import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AlunoNota aluno = new AlunoNota();

        System.out.println("Insira seu nome:");
        aluno.setNome(read.nextLine());
        aluno.setNotas(10);
        aluno.setNotas(5.3);
        aluno.setNotas(6.9);
        aluno.setNotas(4.5);
        aluno.setNotas(8.1);
        System.out.println(aluno.getNotas());

        System.out.println("A sua média de nota é: " + aluno.calcularMedia(5));

    }
}
