import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o nome do produto: ");
        produto.setNome(read.nextLine());

        produto.setPreco(250);

        produto.aplicarDesconto(20);
    }
}
