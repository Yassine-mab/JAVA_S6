package PT2;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille de tab : ");
        int N = sc.nextInt();
        int[] tab = new int[N];
        for(int i = 0 ;i < N ; i ++) 
        {
            if (i == 0)
                {
                    System.out.print("Donner la " + (i + 1) + " er " + "valeur d'element : ");
        	        tab[i] = sc.nextInt();
                }
            else
            {
                System.out.print("Donner la " + (i + 1) + " éme " + "valeur d'element : ");
        	    tab[i] = sc.nextInt();
            }
        }
        for(int i = 0 ;i < N ; i ++) 
        {
        	System.out.println("La valeur d'element " + (i + 1) + " est : " + tab[i] );
        }
       
        sc.close();
    }

}