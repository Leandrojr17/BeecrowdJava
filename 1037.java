import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        //Aqui você puxa a classe Intervalo pra classe Main
        Intervalo exemplo = new Intervalo();
        //Nesse caso você da um valor para a entrada da variável x pra saída da Main
        String saida = exemplo.verificaIntervalo(x);
        System.out.println(saida);
    }
}

class Intervalo{
    public String verificaIntervalo(double x){
        if(x>=0&&x<=25){
            return "Intervalo [0,25]";
        } else if (x>25.00 && x<=50.00) {
            return "Intervalo (25,50]";
        } else if (x>50.00 && x<=75.00) {
            return "Intervalo (50,75]";
        } else if (x>75.00 && x<=100.00){
            return "Intervalo (75,100]";
        } else{
            return "Fora de intervalo";
        }
    }
}
