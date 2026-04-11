package TP4;

public class CompteEpargne extends Compte{
    private double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret)
    {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret(){return tauxInteret;}
    public void setTauxInteret(double tauxInteret){this.tauxInteret = tauxInteret;}

    public void calculeInteret()
    {
        double interet = solde * tauxInteret; 
        solde += interet;
        System.out.println("les interets sont ajoute, Nouveau solde : " + solde);
    }

    public void retirer(double montant)
    {
        if ((montant > 0) && (montant <= solde))
            {
                solde -= montant;
                System.out.println("Retrait de " + montant + " effectue. Nouveau solde : " + solde);
            }
        else
            {
                System.out.println("Retrait refuse, solde insuffisant");
            }
    }
    public void afficher()
    {
        super.afficher();
        System.out.println("TauxInteret : " + tauxInteret);
    }
}
