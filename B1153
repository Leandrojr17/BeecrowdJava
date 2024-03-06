/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
EX: entrada = 4;
    saída = 24
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Informe qual o número de fatorial que gostaria, sendo MAIOR que 0 e MENOR que 13");
        int n = scanner.nextInt();
        if (n > 0 && n < 13) {
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de "+n+ " é "+fatorial);
        } else {
            System.out.println("Error");
        }
        scanner.close();
    }
}
