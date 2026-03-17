package PT2;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];
        for(int i = 0 ;i < 10 ; i ++) 
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
        System.out.print("Donner le nbr a chercher : ");
        int nbr = sc.nextInt();
        for(int i = 0 ;i < 10 ; i ++) 
        {
        	if (tab[i] == nbr)
        		System.out.print("Le nbr " + nbr + " exite dans l'index : " + i);
            else
                System.out.println("Le nbr n'exite pas !");
        }
       
        sc.close();
    }
}