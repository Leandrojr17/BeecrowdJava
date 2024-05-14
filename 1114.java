/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j=1;
        int senha = 2002;

        for(int i = 0;i<=j;i++){
            System.out.println("Informe a senha:");
            int n = scanner.nextInt();
            j++;

            if(n==senha){
                System.out.println("Acesso Permitido");
                break;
            } else{
                System.out.println("Senha Invalida");
            }
        }
    }
}
