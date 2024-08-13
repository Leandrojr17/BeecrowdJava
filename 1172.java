import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        Lembrando que não precisa usar nenhuma pergunta, pois já está
        sendo definido que você preencherá 10 posições de vetores
        (do 0 ao 9)
        
        */
        int[] vetor = new int[10];
        /*
        Aqui é a condição que o número que será menor que 0, será
        definido por 1
        */
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
            if(vetor[i]<=0){
                vetor[i]=1;
            }
        }
        // Lembrando que aqui é a saída do vetor, definindo que ele vai ter
        // 10 posições e que você pode definir quais as posições que você
        // vai digitar, se não será 0 ou 1
        for (int i = 0; i < 10; i++) {
            System.out.println("X ["+i+"] = "+vetor[i]);
        }


        scanner.close();
    }
}
