import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        //System.out.println("Informe o valor de A");
        int valorDeA = teste.nextInt();
        //System.out.println("Informe o valor de B");
        int valorDeB = teste.nextInt();
        int x = valorDeA * valorDeB;
        System.out.println("PROD = "+ x);
    }
}
