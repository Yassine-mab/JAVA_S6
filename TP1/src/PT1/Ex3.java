package PT1;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner un nbr : ");
        int nbr = sc.nextInt();
        System.out.println("Le tableau de multiplication de " + nbr + " est :");
        for (int i = 0; i <= 9; i ++) 
        {
        	System.out.println(nbr + " * " + i + " = " + nbr * i);
        }

        sc.close();
    }

}