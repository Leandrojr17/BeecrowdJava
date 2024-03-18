import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner larissa = new Scanner(System.in);

        int t = larissa.nextInt();

        for(int i = 0; i<t;i++ ){
            int bonus = larissa.nextInt();
            int ataqueDabriel = larissa.nextInt();
            int defesaDabriel = larissa.nextInt();
            int levelDabriel = larissa.nextInt();
            int ataqueGuarte = larissa.nextInt();
            int defesaGuarte = larissa.nextInt();
            int levelGuarte= larissa.nextInt();

            Pomekon pomekonDabriel = new Pomekon(ataqueDabriel, defesaDabriel,levelDabriel);
            Pomekon pomekonGuarte = new Pomekon(ataqueGuarte,defesaGuarte,levelGuarte);

            String vencedor = Batalha.determinarVencedor(pomekonDabriel,pomekonGuarte, bonus);
            System.out.println(vencedor);
        }
    }
}

class Batalha {
    public static String determinarVencedor(Pomekon pomekonDabriel, Pomekon pomekonGuarte, int bonus){
        int valorGolpeDabriel = pomekonDabriel.calcularValorGolpe(bonus);
        int valorGolpeGuarte = pomekonGuarte.calcularValorGolpe(bonus);

        if(valorGolpeDabriel>valorGolpeGuarte){
            return "Dabriel";
        } else if (valorGolpeGuarte>valorGolpeDabriel) {
            return "Guarte";
        } else {
            return "Empate";
        }
    }
}

class Pomekon {
    private int ataque;
    private int defesa;
    private int level;

    public Pomekon(int ataque, int defesa, int level){
        this.ataque = ataque;
        this.defesa = defesa;
        this.level = level;
    }

    public int calcularValorGolpe(int bonus){
        int valorGolpe = (ataque+defesa)/2;
        if(level%2==0){
            valorGolpe+=bonus;
        }
        return valorGolpe;
    }
}
