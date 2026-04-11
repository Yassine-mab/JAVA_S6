package TP4;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] comptes = new Compte[4];

		comptes[0] = new CompteCourant("c87438", "yassine", 1000, 200);
		comptes[1] = new CompteEpargne("a09889", "ali", 300, 3);
		comptes[2] = new ComptePremium("b93403", "sara", 2000, 500);
		comptes[3] = new CompteCourant("d38742", "amin", 1070000, 400);


		System.out.println("Tous les type de comptes.\n");
		for(int i = 0; i < comptes.length; i++){
			comptes[i].deposer(500);
			comptes[i].retirer(200);
			comptes[i].afficher();
			System.out.println("\n ---------------------------------------- \n");
		}

		System.out.println("les comptes epargne.\n");

		for(int i = 0; i < comptes.length; i++)
		{
			if( comptes[i] instanceof CompteEpargne)
			{
				comptes[i].afficher();
			}
		}


		System.out.println("\n ---------------------------------------- \n");
		Compte c = new CompteEpargne("w79876", "kamal", 600, 2);
		c.afficher();
		CompteCourant cc = (CompteCourant)c;
		cc.afficher();
	}

}
