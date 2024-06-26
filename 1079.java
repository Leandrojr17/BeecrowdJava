//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
//Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
//Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
//primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos alunos você quer a média");
        int q = sc.nextInt();
        System.out.println("Informe as notas dos alunos separadamente");
        for (int x =0;x<q;x++) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            double media = (A * 2 + B * 3 + C * 5) / 10;
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}
