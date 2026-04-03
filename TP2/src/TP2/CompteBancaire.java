package TP2;

public class CompteBancaire {
	private int numero;
	private String titulaire;
	private double solde;
	private double descouvertAutorise;


	static int nbComptes = 0;
	static double tauxInteretAnnuel = 0.03;




	CompteBancaire()
	{
		nbComptes ++;
		numero = nbComptes;
		titulaire = "Inconnue";
		solde = 0.0;
		descouvertAutorise = 0.0;
	}




	CompteBancaire(String titulaire, double solde, double descouvertAutorise)
	{
		nbComptes ++;
		this.titulaire = titulaire ;
		this.solde = solde;
		this.descouvertAutorise = descouvertAutorise;
		this.numero = nbComptes;
	}






	public String gettitulaire(){return titulaire;}
	public void setTitulaire(String titulaire)
	{
		if (!titulaire.isEmpty())
			this.titulaire = titulaire;
		else
			System.out.println("Le titulaire est vide ! ");
	}

	public double getdescouvertAutorise(){return descouvertAutorise;}
	public void setdescouvertAutorise(double descouvertAutorise)
	{
		if (descouvertAutorise >= 0)
			this.descouvertAutorise = descouvertAutorise;
		else
			System.out.println("Cette descouvertAutorise est negative ! ");
	}





	public void afficher()
	{
		System.out.println("titulaire : " + titulaire + " | " + 
		"solde : " + solde + " | " + 
		"numero : " + numero + " | " + 
		"descouvertAutorise : " + descouvertAutorise);
	}






	public void deposer(double montant)
	{
		if (montant > 0)
			solde += montant;
		else
			System.out.println("Montant de dépot invalide. ");
	}
	public void retirer(double montant)
	{
		if ((montant > 0) && ((solde - montant) >= -descouvertAutorise))
			solde -= montant;
		else
			System.out.println("Retrait refusé. ");
	}
	public void virementVers(CompteBancaire autre, double montant)
	{
		if ((montant > 0) && ((solde - montant) >= - descouvertAutorise))
			{
				retirer(montant);
				autre.deposer(montant);
			}
		else
			System.out.println("Virement impossible : montant ou solde insuffisant.");
	}







	public double calculerSoldeAvecInterets()
	{
		return solde * (1 + tauxInteretAnnuel);
	}
	public double calculerSoldeAvecInterets(double bonus)
	{
		return solde * (1 + tauxInteretAnnuel + bonus);
	}




	public static int getNbComptes(){return nbComptes;}
	public static double gettauxInteretAnnuel(){return tauxInteretAnnuel;}
	public static void settauxInteretAnnuel(double taux)
	{
		tauxInteretAnnuel = taux;
	}
}
