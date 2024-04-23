/* - A fórmula para calcular a área de uma circunferência é: area = π * raio2.
Considerando para este problema que π = 3.14159:

Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

*Entrada*
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos
os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error".*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual a área do raio");
        double raio, area;
        System.out.println("Qual a área do raio?");
        raio = scanner.nextDouble();
        area = 3.14159*(raio*raio);
        System.out.format("A = %.4f\n",area);
    }
}

// OUTRA MANEIRA PARA FAZER ESSA QUESTÃO USANDO ORIENTADA AO OBJETO

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculo calc = new Calculo();
        calc.raio = sc.nextDouble();
        System.out.printf("A=%.4f\n",calc.area());
    }
}

class Calculo {
    public double n = 3.14159;
    public double raio;
    public double area(){
        return n*(raio*raio);
    }
}


