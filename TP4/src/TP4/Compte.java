package TP4;

public class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;

    public Compte(String numero, String titulaire, double solde)
    {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getNumero(){return numero;}
    public String getTitulaire(){return titulaire;}
    public double getSolde(){return solde;}

    public void setNumero(String numero){this.numero = numero;}
    public void setTitulaire(String titulaire){this.titulaire = titulaire;}
    public void setSolde(double solde){this.solde = solde;}


    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Depot de " + montant + " effectue. Nouveau solde : " + solde);
        } else {
            System.out.println("Montant invalide pour le depot.");
        }
    }
    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectue. Nouveau solde : " + solde);
        } else {
            System.out.println("Retrait refuse, solde insuffisant");
        }
    }
    public void afficher()
    {
        System.out.println("Numero : " + numero + " | " + "Titulaire : " + titulaire + " | " + "Solde : " + solde);
    }
}
