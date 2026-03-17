package PT1;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("donner trois nbrs : ");
        int nbr1 = sc.nextInt();
        int nbr2 = sc.nextInt();
        int nbr3 = sc.nextInt();
        if ((nbr1 >= nbr2) && (nbr1 >= nbr3))
            System.out.println(nbr1 + " est le plut grand nbr !");
        else if ((nbr2 >= nbr1) && (nbr2 >= nbr3))
            System.out.println(nbr2 + " est le plut grand nbr !");
        else
            System.out.println(nbr3 + " est le plut grand nbr !");

        sc.close();
    }

}