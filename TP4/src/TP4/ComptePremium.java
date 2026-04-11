package TP4;

public class ComptePremium extends Compte{
    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait)
    {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafondRetrait;
    }

    public double getPlafondRetrait(){return plafondRetrait;}
    public void setPlafondRetrait(double plafondRetrait){this.plafondRetrait = plafondRetrait;}

    public void retirer(double montant)
    {
        if((montant > 0) && (solde >= montant) && (montant <= plafondRetrait))
            {
                solde -= montant;
                System.out.println("Retrait de " + montant + " effectue. Nouveau solde : " + solde);
            }
        else
            {
                System.out.println("Retrait refuse, solde insuffisant ou le montant ne depass pas le plafond Retrait.");
            }
    }
    public void afficher()
    {
        super.afficher();
        System.out.println("plafondRetrait : " + plafondRetrait);
    }
}
