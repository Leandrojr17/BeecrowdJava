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




/*
Utilizando Orientado ao Objeto, temos outro jeito para fazermos a questão do Beecrowd
*/




import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        LeitorCompetidores leitor = new LeitorCompetidores(scanner);
        List<Competidor> competidores = leitor.lerCompetidores(N);
        Competicao competicao = new Competicao(competidores);

        competicao.exibirResultados();

        scanner.close();
    }
}


class LeitorCompetidores {
    private Scanner scanner;

    public LeitorCompetidores(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Competidor> lerCompetidores(int N) {
        List<Competidor> competidores = new java.util.ArrayList<>();

        for (int i = 0; i < N; i++) {
            String nome = scanner.nextLine();
            double grauDificuldade = scanner.nextDouble();

            double[] notas = new double[7];
            for (int j = 0; j < 7; j++) {
                notas[j] = scanner.nextDouble();
            }
            scanner.nextLine();

            Competidor competidor = new Competidor(nome, grauDificuldade, notas);
            competidores.add(competidor);
        }

        return competidores;
    }
}

class Competidor {
    private String nome;
    private double grauDificuldade;
    private double[] notas;

    public Competidor(String nome, double grauDificuldade, double[] notas) {
        this.nome = nome;
        this.grauDificuldade = grauDificuldade;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularResultado() {
        double menorNota = Double.MAX_VALUE;
        double maiorNota = Double.MIN_VALUE;
        double somaNotas = 0;

        for (double nota : notas) {
            menorNota = Math.min(menorNota, nota);
            maiorNota = Math.max(maiorNota, nota);
            somaNotas += nota;
        }

        somaNotas -= menorNota;
        somaNotas -= maiorNota;

        return somaNotas * grauDificuldade;
    }
}

class Competicao {
    private List<Competidor> competidores;

    public Competicao(List<Competidor> competidores) {
        this.competidores = competidores;
    }

    public void exibirResultados() {
        for (Competidor competidor : competidores) {
            double resultado = competidor.calcularResultado();
            System.out.printf("%s %.2f\n", competidor.getNome(), resultado);
        }
    }
}
