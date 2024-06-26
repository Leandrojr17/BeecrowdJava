
/*
Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo.
Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um
inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada. Cada uma
das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”,
de acordo com a especificação fornecida.

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ,y, cont ;
        System.out.println("Informe quantos números primos você deseja.");
        y = sc.nextInt();
        for (int i =0;i<y;i++){
            cont = 0;
            x = sc.nextInt();

            for (int j =2;j<x;j++){
                if(x%j==0){
                    cont++;
                    break;
                }
            }
            if(cont ==0){
                System.out.println(x +" eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
        sc.close();
    }
}
