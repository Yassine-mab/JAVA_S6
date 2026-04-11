package TP4;

public class CompteCourant extends Compte {
    private double decouverAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouverAutorise)
    {
        super(numero, titulaire, solde);
        this.decouverAutorise = decouverAutorise;
    }

    public double getDecouverAutorise(){return decouverAutorise;}
    public void setDecouverAutorise(double decouverAutorise){this.decouverAutorise = decouverAutorise;}
    
    public void retirer(double montant)
    {
        if (montant > 0 && ((solde - montant) >= -decouverAutorise))
            {
                solde -= montant;
                System.out.println("Retrait de : " + montant + " effectue. Nouveau solde : " + solde);
            }
        else
            {
               System.out.println("Retrait refuse,  depasse le decouvert autorise");
            }
    }
    public void afficher()
    {
        super.afficher();
        System.out.println("DecouverAutorise : " + decouverAutorise);
    }
}
