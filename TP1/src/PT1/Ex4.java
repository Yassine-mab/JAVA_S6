package PT1;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner un nbr N : ");
        int N = sc.nextInt();
        int i = 0;
        int som = 0;
        while (i <= N) 
        {
        	som += i;
        	i ++;
        }
        System.out.println("La somme des " + N + " premier entiers est : " + som);
       
        sc.close();
    }

}