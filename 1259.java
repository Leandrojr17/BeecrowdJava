/*
  Utilizando os Pilares da Orientação ao Objeto, desevolvi essa questão e também utilizando o List e Map.
*/

import java.util.*;

class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public boolean ehPar() {
        return valor % 2 == 0;
    }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }
}

class Ordenador {
    public List<Numero> ordenarNumeros(List<Numero> numeros) {
        List<Numero> pares = new ArrayList<>();
        List<Numero> impares = new ArrayList<>();

        for (Numero num : numeros) {
            if (num.ehPar()) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        Collections.sort(pares, Comparator.comparingInt(Numero::getValor));

        Collections.sort(impares, (n1, n2) -> Integer.compare(n2.getValor(), n1.getValor()));

        List<Numero> numerosOrdenados = new ArrayList<>(pares);
        numerosOrdenados.addAll(impares);

        return numerosOrdenados;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Numero> numeros = lerNumeros();
        Ordenador ordenador = new Ordenador();
        List<Numero> numerosOrdenados = ordenador.ordenarNumeros(numeros);
        imprimirNumeros(numerosOrdenados);
    }

    private static List<Numero> lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 
        List<Numero> numeros = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            numeros.add(new Numero(valor));
        }
        scanner.close();
        return numeros;
    }

    private static void imprimirNumeros(List<Numero> numeros) {
        for (Numero num : numeros) {
            System.out.println(num);
        }
    }
}
