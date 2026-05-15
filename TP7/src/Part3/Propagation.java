package Part3;

public class Propagation {

    public double lireMontant(String valeur) throws NumberFormatException, IllegalArgumentException {

        double montant = Double.parseDouble(valeur); 

        if (montant < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif.");
        }

        return montant;
    }

    public static void main(String[] args) {

        Propagation prog = new Propagation();

        try {
            double montant = prog.lireMontant("abc");
            System.out.println("Montant lu : " + montant);

        } catch (NumberFormatException e) {
            System.out.println("Erreur de format : valeur non numérique.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}