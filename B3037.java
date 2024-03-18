import java.util.Scanner;

class Jogador {
    private int pontuacaoTotal;

    public Jogador() {
        this.pontuacaoTotal = 0;
    }

    public void arremessarDardo(ArremessoDardo arremesso) {
        this.pontuacaoTotal += arremesso.getScore();
    }

    public int getPontuacaoTotal() {
        return this.pontuacaoTotal;
    }
}

class ArremessoDardo {
    private int distancia;
    private int multiplicador;

    public ArremessoDardo(int distancia, int multiplicador) {
        this.distancia = distancia;
        this.multiplicador = multiplicador;
    }

    public int getScore() {
        return this.distancia * this.multiplicador;
    }
}

class JogoDardos {
    public static void jogar(int N, Scanner scanner) {
        for (int i = 0; i < N; i++) {
            Jogador joao = new Jogador();
            Jogador maria = new Jogador();

            for (int j = 0; j < 3; j++) {
                int x = scanner.nextInt();
                int d = scanner.nextInt();
                ArremessoDardo arremesso = new ArremessoDardo(x, d);
                joao.arremessarDardo(arremesso);
            }

            for (int j = 0; j < 3; j++) {
                int x = scanner.nextInt();
                int d = scanner.nextInt();
                ArremessoDardo arremesso = new ArremessoDardo(x, d);
                maria.arremessarDardo(arremesso);
            }

            if (joao.getPontuacaoTotal() > maria.getPontuacaoTotal()) {
                System.out.println("JOAO");
            } else {
                System.out.println("MARIA");
            }
        }
    }
}

class Controller {
    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Número de casos de teste
        JogoDardos.jogar(N, scanner);
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.iniciarJogo();
    }
}
