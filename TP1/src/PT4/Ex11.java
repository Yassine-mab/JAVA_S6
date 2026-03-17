package PT4;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner une chaine de caractere : ");
        String str = sc.nextLine();
        System.out.println("La taille de la chaine de caracter est : " + str.length());


        sc.close();
    }
}
