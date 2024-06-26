import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double delta = (b*b)-(4*a*c);
        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        
        } else {
            double r1 = (-b + Math.sqrt(delta))/(2*a);
            double r2 = (-b - Math.sqrt(delta))/(2*a);
            
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);

        }
        
        
    }
}

