public class TestAbonnements {
    public static void main(String[] args) {
        Abonnement[] tab = new Abonnement[3];

        tab[0] = new AbonnementVideo("vid1", 90, 4, true, false);
        tab[1] = new AbonnementMusique("music1", 76, 2, 3, true);
        tab[2] = new AbonnementJeux("jeu1", 120, 1, 20, 316);


        for(int i = 0; i < tab.length; i++)
            {
                tab[i].afficherInfos();
                System.out.println("Cout mensuel : " + tab[i].calculerCoutMensuel());
                System.out.println("Score satisfaction : " + tab[i].calculerScoreSatisfaction());
                System.out.println( "\n-----------------------------------------------------------------\n");
            }


        System.out.println("\n ------------ Le test de reduction : ------------- \n");

        Reducible[] tab1 = new Reducible[2];

        tab1[0] = new AbonnementVideo("vid2", 234, 2, true, false);
        tab1[1] = new AbonnementMusique("music2", 145, 3, 4, true);

        for(int i = 0; i < tab1.length; i++)
            {
                ((Abonnement)tab1[i]).afficherInfos();
                System.out.println("Cout mensuel : " + ((Abonnement)tab1[i]).calculerCoutMensuel());
                System.out.println("Score satisfaction : " + ((Abonnement)tab1[i]).calculerScoreSatisfaction());
                System.out.println( "\n-----------------------------------------------------------------\n");
            }


        for(int i = 0; i < tab1.length; i++)
            {
                System.out.println("Le prix apre la 20% reduction : " + tab1[i].appliquerReduction(20));
                System.out.println( "\n-----------------------------------------------------------------\n");
            }

        for(int i = 0; i < tab1.length; i++)
            {
                if(tab1[i].estEligibleReduction(50)) {
                    System.out.println("Prix après 50% : " + tab1[i].appliquerReduction(50));
                } 
                else {
                    System.out.println("Réduction de 50% refusée (max 30%)");
                }
                System.out.println( "\n-----------------------------------------------------------------\n");
            }
}
}
