import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,pi;
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        pi=3.14159;
        double areaTriangulo = (a*c)/2;
        double areaCirculo = pi*(Math.pow(c,2));
        double areaTrapezio = ((a+b)*c)/2;
        double areaQuadrado = Math.pow(b,2);
        double areaRetangulo = a*b;


        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}
