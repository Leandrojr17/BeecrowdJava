/* Escreva um programa que leia o número de um funcionário, seu número
de horas trabalhadas, o valor que recebe por hora e calcula o salário
desse funcionário. A seguir, mostre o número e o salário do funcionário,
com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas
decimais, representando o número, quantidade de horas trabalhadas e o valor
que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido,
com um espaço em branco antes e depois da igualdade. No caso do salário,
também deve haver um espaço em branco após o $.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDeTrabalho, horasTrabalhadas;
        double salario, salarioDeTrabalho;

        //System.out.println("Qual o seu número de trabalhador?");
        numDeTrabalho = sc.nextInt();
        //System.out.println("Qual o número de horas trabalhadas?");
        horasTrabalhadas = sc.nextInt();
        //System.out.println("Qual o salário do funcionário?");
        salario = sc.nextDouble();

        salarioDeTrabalho = horasTrabalhadas*salario;

        System.out.println("NUMBER = "+numDeTrabalho);
        System.out.format("SALARY = U$ %.2f\n",salarioDeTrabalho);
    }
}
