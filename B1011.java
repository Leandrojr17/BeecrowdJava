import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raioDaEsfera;
        raioDaEsfera=scanner.nextInt();
        Esfera esfera = new Esfera(raioDaEsfera);
        double volume = esfera.calcularVolume();
        System.out.printf("VOLUME = %.3f\n",volume);

    }
}


class Esfera {
    private int x;
    public static final double pi = 3.14159;

    public Esfera(int x) {
        this.x = x;
    }
    public double calcularVolume(){
        return (4.0/3)*pi*Math.pow((double)x,3);
    }
}
