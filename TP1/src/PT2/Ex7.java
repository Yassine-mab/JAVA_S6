package PT2;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille de tab : ");
        int N = sc.nextInt();
        int[] tab = new int[N];
        for(int i = 0 ;i < N ; i ++) 
        {
            if (i == 0)
            {
                System.out.print("Donner le " + (i + 1) + " er " + "element : ");
        	    tab[i] = sc.nextInt();
            }
            else
            {
                System.out.print("Donner le " + (i + 1) + " éme " + "element : ");
        	    tab[i] = sc.nextInt();
            }
        }
        int max = tab[0];
        for(int i = 0 ;i < N ; i ++) 
        {
        	if (tab[i] > max)
        		max = tab[i];
        }
        System.out.println("le max est : "  + max);
       
        sc.close();
    }

}