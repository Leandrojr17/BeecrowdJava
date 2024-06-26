/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i=1, j=7;
        while(i<=9) {
            System.out.println("I=" + i + " J=" + j);
            System.out.println("I=" + i + " J=" + (j - 1));
            System.out.println("I=" + i + " J=" + (j - 2));
            i+=2;
        }
    }
}
