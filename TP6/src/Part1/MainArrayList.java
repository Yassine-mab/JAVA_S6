package Part1;
import java.util.ArrayList;
import java.util.Comparator;

public class MainArrayList {
    public static void main(String[] args) {

        ArrayList<Etudiant> etudiants = new ArrayList<>();

        
        etudiants.add(new Etudiant(1, "Yassine", 14.5));
        etudiants.add(new Etudiant(2, "Sara",    17.0));
        etudiants.add(new Etudiant(3, "Amine",   12.3));
        etudiants.add(new Etudiant(4, "Nadia",   15.8));
        etudiants.add(new Etudiant(5, "Karim",   11.0));

        
        System.out.println("=== Liste des étudiants ===");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

       
        String nomRecherche = "Amine";
        System.out.println("\n=== Recherche: " + nomRecherche + " ===");
        for (Etudiant e : etudiants) {
            if (e.getNom().equals(nomRecherche)) {
                System.out.println("Trouvé : " + e);
            }
        }

        int idASupprimer = 3;
        etudiants.removeIf(e -> e.getId() == idASupprimer);
        System.out.println("\n=== Après suppression de l'ID " + idASupprimer + " ===");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        etudiants.sort(Comparator.comparingDouble(Etudiant::getMoyenne));
        System.out.println("\n=== Triés par moyenne (croissant) ===");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        Etudiant meilleur = etudiants.get(etudiants.size() - 1);
        System.out.println("\n=== Meilleur étudiant ===");
        System.out.println(meilleur);
    }
}