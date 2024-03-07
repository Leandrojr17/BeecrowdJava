import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        CalculoConduinteRaio calculoConduinteRaio = new CalculoConduinteRaio();
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        for (int i =1;i<=t;i++){
            int r1 = scanner.nextInt();
            int r2 = scanner.nextInt();
            Cabo cabo = new Cabo(r1,r2);
            int raioConduinte = CalculoConduinteRaio.calcularRaioConduinte(cabo);
            System.out.println(raioConduinte);
        }
    }
}


 class CalculoConduinteRaio {
    public static int calcularRaioConduinte(Cabo cabo){
        int distancia = cabo.getR1() + cabo.getR2();
        return distancia;
    }
}

 class Cabo {
    private static int r1;
    private static int r2;

    public Cabo(int r1, int r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public static int getR1() {
        return r1;
    }

    public static int getR2() {
        return r2;
    }

}
