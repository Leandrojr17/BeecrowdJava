/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
evento em uma fábrica, e informe-o expresso no formato (horas:minutos:segundos).

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
EX: 556 = 0:9:16;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo em segundos");
        int tempoSegundos = sc.nextInt();

        // Esse é o cálculo gerado que está sendo calculado o tempo de Segundos, Minutos e Horas
        int horas = (tempoSegundos/3600);
        int minutos = ((tempoSegundos%3600)/60);
        int segundos = tempoSegundos%60;

        //Esse sistema de impressão para o tempo calculado é para o resto de todos os cálculos(Horas, Minutos e Segundos)
        System.out.printf("%d:%d:%d\n",horas,minutos,segundos);


    }
}
