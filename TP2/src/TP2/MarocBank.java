package TP2;

public class MarocBank {

	public static void main(String[] args) {
		
		Banque MarocBank = new Banque("MarocBank", 1500);

		CompteBancaire c1 = new CompteBancaire("Yassine", 1000, 500);
		CompteBancaire c2 = new CompteBancaire("hicham", 2000, 300);
		CompteBancaire c3 = new CompteBancaire("asma", 3000, 600);

		MarocBank.ajouterCompte(c1);
		MarocBank.ajouterCompte(c2);
		MarocBank.ajouterCompte(c3);

		c1.deposer(1000);
		c1.retirer(500);
		c2.virementVers(c3, 200);

		MarocBank.afficherTous();

		System.out.println("Solde avec intérêts (taux normal) : " + c2.calculerSoldeAvecInterets());
		System.out.println("Solde avec intérêts (taux + bonus) : " + c2.calculerSoldeAvecInterets(0.015));

		System.out.println("Nombre total de comptes : " + CompteBancaire.getNbComptes());
		System.out.println("Taux d'intérêt annuel   : " + CompteBancaire.gettauxInteretAnnuel());



	}

}
