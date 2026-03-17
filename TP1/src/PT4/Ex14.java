package PT4;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner une chaine de caractere : ");
        String str = sc.nextLine().toLowerCase();
        char tab[] = str.toCharArray();
        int c = 0;
        for (int i = 0; i < tab.length / 2; i ++)
            {
                if (tab[i] != tab[tab.length - 1 - i])
                    {
                        c ++;
                    }
            }
        if (c == 0)
            System.out.println("La chaine de cracter est une palindrome !");
        else
            System.out.println("La chaine de caracter est pas une palindrome !");

        sc.close();
    }
}
