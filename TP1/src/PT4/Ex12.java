package PT4;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner une chaine de caractere : ");
        String str = sc.nextLine();
        char[] tab = str.toCharArray();
        int c = 0;
        for (int i = 0; i < tab.length; i ++)
            {
                if (tab[i] == 'e' || tab[i] == 'i' || tab[i] == 'y' || tab[i] == 'o' || tab[i] == 'a' || tab[i] == 'u' ||
                    tab[i] == 'E' || tab[i] == 'I' || tab[i] == 'Y' || tab[i] == 'O' || tab[i] == 'A' || tab[i] == 'U' )
                    {
                        c ++;
                    }
            }
        System.out.println("Cette chaine de caractere a : " + c + " caracters voyelles ");


        sc.close();
    }
}
