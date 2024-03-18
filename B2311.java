import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < N; i++) {
            String nome = scanner.nextLine();
            double grauDificuldade = scanner.nextDouble();
            double menorNota = Double.MAX_VALUE;
            double maiorNota = Double.MIN_VALUE;
            double somaNotas = 0;

            for (int j = 0; j < 7; j++) {
                double nota = scanner.nextDouble();
                menorNota = Math.min(menorNota, nota);
                maiorNota = Math.max(maiorNota, nota);
                somaNotas += nota;
            }
            scanner.nextLine();
            
            somaNotas -= menorNota;
            somaNotas -= maiorNota;

            double resultado = somaNotas * grauDificuldade;
            
            System.out.printf("%s %.2f\n", nome, resultado);
        }

        scanner.close();
    }
}
