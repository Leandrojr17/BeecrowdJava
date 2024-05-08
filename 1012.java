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


/*
---------------------
    OUTRA MANEIRA DE FAZER ESSA QUESTÃO, USANDO OS PILARES DA PROGRAMAÇÃO ORIENTADA AO OBJETO
---------------------
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Triangulo triangulo = new Triangulo(a,c);
        Circulo circulo = new Circulo(c);
        Trapezio trapezio = new Trapezio(a,b,c);
        Quadrado quadrado = new Quadrado(b);
        Retangulo retangulo = new Retangulo(a,b);

        System.out.print(triangulo.mensagem());
        System.out.print(circulo.mensagem());
        System.out.print(trapezio.mensagem());
        System.out.print(quadrado.mensagem());
        System.out.print(retangulo.mensagem());
    }
}

interface Forma{
    String mensagem();
    double calcularArea();
}


class Triangulo implements Forma{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base*altura)/2;
    }

    public String mensagem() {
        return "TRIANGULO: "+String.format("%.3f\n",calcularArea());
    }
}

class Circulo implements Forma{
    private static double pi =3.14159;
    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }


    public double calcularArea() {
        return pi*(raio*raio);
    }

    public String mensagem() {
        return "CIRCULO: "+ String.format("%.3f\n",calcularArea());
    }
}

class Trapezio implements Forma{
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio (double baseMaior, double baseMenor, double altura){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMaior+baseMenor)*altura)/2;
    }

    public String mensagem() {
        return "TRAPEZIO: "+String.format("%.3f\n",calcularArea());
    }
}

class Quadrado implements Forma{
    private double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado,2);
    }

    public String mensagem() {
        return "QUADRADO: "+ String.format("%.3f\n",calcularArea());
    }
}

class Retangulo implements Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base*altura;
    }
    public String mensagem(){
        return "RETANGULO: "+String.format("%.3f\n",calcularArea());
    }
}
