import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        sc.close();

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtdNotas = (int) (valor / nota);
            System.out.printf("%d nota(s) de R$ %.2f\n", qtdNotas, (double) nota);
            valor %= nota;
        }

        int centavos = (int) (valor * 100);
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int qtdMoedas = centavos / ((int) (moeda * 100));
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, moeda);
            centavos %= (int) (moeda * 100);
        }
    }
}
