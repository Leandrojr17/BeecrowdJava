import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entenda = new Scanner(System.in);
        int codigo, quantidade;
        double total = 0;

        codigo = entenda.nextInt();
        quantidade = entenda.nextInt();

        if(codigo==1){
            total = quantidade * 4.00;
        } else if (codigo == 2){
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if(codigo == 4){
            total = quantidade * 2.00;
        } else if(codigo == 5){
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}

/*
Outro modo de fazer o Lanche, utilizando Orientada ao Objeto. Mais de uma maneira para fazer o exercício
*/
import java.util.Scanner;

class Produto {
    private int codigo;
    private double preco;

    public Produto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = {
            new Produto(1, 4.00),
            new Produto(2, 4.50),
            new Produto(3, 5.00),
            new Produto(4, 2.00),
            new Produto(5, 1.50)
        };

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double total = calcularTotal(produtos, codigo, quantidade);
        System.out.printf("Total: R$ %.2f\n", total);
    }

    public static double calcularTotal(Produto[] produtos, int codigo, int quantidade) {
        double total = 0;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                total = quantidade * produto.getPreco();
                break;
            }
        }
        return total;
    }
}
