/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva
um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco.
Não deve haver espaço após o último valor.
 */
import java.util.Scanner;

public class B1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, numProx, numAnt = 0, numAtual = 1;
        System.out.println("Digite um valor inteiro que seja menor que 46 e maior que 0 ");
        N = sc.nextInt();
        if (N < 46 && N > 0) {
            for (int i = 1; i <= N; i++) {
                if(i==N){
                    //Aqui é a primeira condição de que vai ser impresso o primeiro número
                    System.out.println(numAnt);
                } else{
                    //Aqui você usa essas aspas para poder gerar todos em uma única linha.
                    System.out.print(numAnt+" ");
                    numProx=numAtual+numAnt;
                    numAnt=numAtual;
                    numAtual=numProx;
                }
            }
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
