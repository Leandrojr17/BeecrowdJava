import java.util.Scanner;

class MaiorValor {
    private int a;
    private int b;
    private int c;

    public MaiorValor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int maior(int x, int y) {
        return (x + y + Math.abs(x - y)) / 2;
    }

    public int calcularMaior() {
        int maiorAB = maior(a, b);
        return maior(maiorAB, c);
    }

    public void imprimirMaior() {
        int maiorValor = calcularMaior();
        System.out.println(maiorValor + " eh o maior");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        MaiorValor maiorValor = new MaiorValor(a, b, c);
        maiorValor.imprimirMaior();
        
        sc.close();
    }
}
