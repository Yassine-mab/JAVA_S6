package PT4;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner une chaine de caractere : ");
        String str = sc.nextLine();
        char tab[] = str.toCharArray();
        char tmp;
        System.out.println("avant revers : ");
        for (int i = 0; i < tab.length; i ++)
            {
                System.out.print(tab[i]);
            }
            System.out.println();
        for (int i = 0; i < tab.length / 2; i ++)
            {
                tmp = tab[i];
                tab[i] = tab[tab.length - 1 - i];
                tab[tab.length - 1 - i] = tmp;
            }
        System.out.println();
        System.out.println("aprés reverse : ");
        for (int i = 0; i < tab.length; i ++)
            {
                System.out.print(tab[i]);
            }

        sc.close();
    }
}
