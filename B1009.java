import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Qual o nome do funcionário?");
        String nome = sc.next();

        //System.out.println("Qual o seu salário?");
        double salario = sc.nextDouble();

        //System.out.println("Qual o seu total de vendar efetuadas no mês?");
        double vendas = sc.nextDouble();
        double comissao = vendas*0.15;
        double salarioFinal = comissao+salario;
        System.out.format("TOTAL = R$ %.2f\n",salarioFinal);
        sc.close();
    }
}
