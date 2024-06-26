/*
Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y,
passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número,
conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

            System.out.println("Informe o número de linhas");
            int x = scanner.nextInt();
            System.out.println("Informe quantos números inteiros você vai querer?");
            int y = scanner.nextInt();

            for(int j =0;j<=y;j++){
                System.out.print(j);
                /*
                 Nós estamos usando o resto pois na hora que você perceber
                 o último número que ele vai colocar está saindo divisível
                 pelo último número da linha. Tente imprimir e verá.
                 */
                if(j%x==0){
                    //Aqui ele vai pular linha
                    System.out.println("");
                } else {
                    //Aqui ele só vai usar um espaço
                    System.out.print(" ");
                }
            }
            scanner.close();
        }
    }
