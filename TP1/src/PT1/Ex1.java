package PT1;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("donner un nbr : ");
        int nbr = sc.nextInt();
        if (nbr > 0)
            System.out.println("positif !");
        else if (nbr < 0)
            System.out.println("negative !");
        else
            System.out.println("Nul !");

        sc.close();
    }


}