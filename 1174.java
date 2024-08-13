import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[100];

        for (int i = 0; i < 100; i++) {
            vetor[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            /*
              Aqui a saída é que vai impactar na resolução da questão,
              pois se caso a entrada for maior que 10, não será consi-
              derado e sairá o próximo valor.
             */

            if(vetor[i]<=10){
                System.out.println("A["+i+"] = "+vetor[i]);
            }
        }


        scanner.close();
    }
}
