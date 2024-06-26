import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jipes = 0;
        int turistas = 0;

        while(true){
            String movimento = scanner.next();

            if(movimento.equals("ABEND")){
                break;
            }

            int quantidadeTuristas = scanner.nextInt();

            if(movimento.equals("SALIDA")){
                turistas += quantidadeTuristas;
                jipes++;
            }
            if(movimento.equals("VUELTA")){
                turistas -= quantidadeTuristas;
                jipes--;
            }
        }
        System.out.println(turistas);
        System.out.println(jipes);
    }
}
