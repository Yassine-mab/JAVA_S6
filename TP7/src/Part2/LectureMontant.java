package Part2;

public class LectureMontant {

    public double lireMontant(String valeur) {

        try {
            double montant = Double.parseDouble(valeur);

            if (montant < 0) {
                throw new IllegalArgumentException("Le montant ne peut pas etre negatif.");
            }

            return montant;

        } catch (NumberFormatException e) {
            System.out.println("Erreur : la valeur [" + valeur + "] n'est pas un nombre valide.");
            return 0.0;

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
            return 0.0;
        }
    }

    public static void main(String[] args) {
        LectureMontant lm = new LectureMontant();

        System.out.println(lm.lireMontant("150.5"));
        System.out.println(lm.lireMontant("abc"));
        System.out.println(lm.lireMontant("-50"));
    }
}