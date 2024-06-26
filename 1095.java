/*Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
 */

public class B1095{
    public static void main(String[] args){
        System.out.println("Loop formado");
        for(int i=1, j=60;j>=0;i+=3,j-=5){
            System.out.println("I="+i+" J="+j);
        }
    }
}
