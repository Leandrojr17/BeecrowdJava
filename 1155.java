/*
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
EX:  S = 1 + 1/2 + 1/3 + … + 1/100

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = 1;
        for (int i=2;i<=100;i++){
            s+=1.00/i;
        }
        /* Toma cuidado, ao usar esse "System.out.printf("%.2f\n",s)"
        dentro do "for", ele irá imprimir todos os resultados, mas fora
        do "for", ele irá imprimir somente um resultado.
         */

        System.out.printf("%.2f\n",s);
    }
}
