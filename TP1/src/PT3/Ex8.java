package PT3;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] tab = new int[3][3];
        for(int i = 0 ;i < 3 ; i ++) 
        {
        	for (int j = 0; j < 3; j ++) 
        	{
                if (i == 0)
                {
                    System.out.print("Donner le " + (i + 1) + " - "+ (j + 1) + " er " + "element : ");
        	        tab[i][j] = sc.nextInt();
                }
                else
                {
                    System.out.print("Donner le " + (i + 1) + " - "+ (j + 1) + " éme " + "element : ");
        	        tab[i][j] = sc.nextInt();
                }
        	}
        }
        for(int i = 0 ;i < 3 ; i ++) 
        {
    		System.out.print("[ ");
        	for (int j = 0; j < 3; j ++) 
        	{
        		System.out.print(tab[i][j] + " ");
        	}
    		System.out.print("]\n");
        }
       
        sc.close();
    }

}