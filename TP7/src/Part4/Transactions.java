package Part4;

public class Transactions {

    public double lireTransaction(double[] tab, int index) {
        return tab[index]; 
    }

    public static void main(String[] args) {

        Transactions t = new Transactions();

        try {
            double[] transactions = {100.0, 200.0, 300.0};
            double valeur = t.lireTransaction(transactions, 10); 
            System.out.println("Valeur : " + valeur);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : l'indice est invalide (hors du tableau).");

        } catch (NullPointerException e) {
            System.out.println("Erreur : le tableau n'est pas initialisé (null).");
        }

        try {
            double[] tableauNull = null;
            double valeur = t.lireTransaction(tableauNull, 0); 
            System.out.println("Valeur : " + valeur);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : l'indice est invalide (hors du tableau).");

        } catch (NullPointerException e) {
            System.out.println("Erreur : le tableau n'est pas initialisé (null).");
        }

        try {
            double[] transactions = {100.0, 200.0, 300.0};
            double valeur = t.lireTransaction(transactions, 1); 
            System.out.println("Valeur lue : " + valeur); 

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : l'indice est invalide.");

        } catch (NullPointerException e) {
            System.out.println("Erreur : le tableau est null.");
        }
    }
}