/*
O professor da importante disciplina de Indução Matemática está tentando resolver uma versão generalizada de um problema muito tradicional:
encontrar o valor máximo possível para a soma dos elementos de uma subsequência contígua de uma sequência de números inteiros quaisquer.
Mais rigorosamente, dado uma sequência S = [s1, s2, . . . , sN ], onde si é um número inteiro qualquer, para 1 ≤ i ≤ N,
maximizar soma(i, j) = si + si+1 + · · · + sj entre todos os possíveis pares (i, j), onde 1 ≤ i ≤ j ≤ N.

Na versão do professor, entretanto, alguns elementos da sequência são especiais e estão marcados. Além da sequência marcada,
são dadas como entrada duas cotas: L e H, com L ≤ H. O objetivo agora é encontrar o valor máximo possível para a soma dos elementos
de uma subsequência contígua, que contenha pelo menos L e no máximo H elementos marcados. 

Por definição, uma subsequência vazia (de zero elementos) tem soma igual a zero. Mas note que, como podemos ter uma cota inferior para
o número de elementos marcados, a subsequência contígua de soma máxima pode ter soma negativa!

Entrada
A primeira linha da entrada contém três inteiros N (1 ≤ N ≤ 105), L e H (0 ≤ L ≤ H ≤ 20), indicando respectivamente o número de elementos
na sequência, a cota inferior L e a cota superior H. A segunda linha contém N inteiros si (−103 ≤ si ≤ 103 , para 1 ≤ i ≤ N),
para 1 ≤ i ≤ N, definindo os elementos da sequência. A terceira linha contém N inteiros mi , para 1 ≤ i ≤ N, indicando as marcas.
Se o i-ésimo elemento está marcado, o valor é mi = 1. Se não estiver marcado, mi = 0. O número de elementos  marcados na sequência
é maior ou igual a L; portanto sempre existe solução.
*/
Saída
Imprima um inteiro, representando o valor máximo possível para a soma dos elementos de uma subsequência contígua, que contenha pelo menos L e no máximo H elementos marcados.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int H = scanner.nextInt();

        int[] sequence = new int[N];
        int[] marks = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            marks[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int currentSum = 0;
            int markedCount = 0;

            for (int j = i; j < N; j++) {
                currentSum += sequence[j];
                markedCount += marks[j];

                if (markedCount >= L && markedCount <= H) {
                    maxSum = Math.max(maxSum, currentSum);
                } else if (markedCount > H) {
                    break;
                }
            }
        }

        System.out.println(maxSum);

        scanner.close();
    }
}

