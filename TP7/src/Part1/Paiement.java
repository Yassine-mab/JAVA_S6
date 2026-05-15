package Part1;

public class Paiement {

    public double effectuerPaiement(double montant, double solde) {

        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être supérieur à zéro.");
        }

        if (montant > solde) {
            throw new ArithmeticException("Solde insuffisant. Solde actuel : " + solde);
        }

        return solde - montant;
    }

    public static void main(String[] args) {

        Paiement p = new Paiement();

        try {
            double nouveauSolde = p.effectuerPaiement(200.0, 150.0); 
            System.out.println("Paiement réussi. Nouveau solde : " + nouveauSolde);

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur de saisie : " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Erreur métier : " + e.getMessage());

        } finally {
            System.out.println("Fin de la transaction.");
        }
    }
}