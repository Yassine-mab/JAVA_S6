package PT3;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille de matrice : ");
        int N = sc.nextInt();
        int[][] tab = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i == 0) && (j == 0))
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
        System.out.println("La matrice avant la transpose :");
        for(int i = 0 ;i < N ; i ++) 
        {
    		System.out.print("[ ");
        	for (int j = 0; j < N; j ++) 
        	{
        		System.out.print(tab[i][j] + " ");
        	}
    		System.out.print("]\n");
        }
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                tmp = tab[i][j];
                tab[i][j] = tab[j][i];
                tab[j][i] = tmp;
            }
        }
        System.out.println();
        System.out.println("La matrice aprés la transpose :");
        for (int i = 0; i < N; i++) {
            System.out.print("[ ");
            for (int j = 0; j < N; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println("]");
        }
        sc.close();
    }
}