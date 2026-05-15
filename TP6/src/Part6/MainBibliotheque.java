package Part6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class MainBibliotheque {
    public static void main(String[] args) {

        ArrayList<Livre> livres = new ArrayList<>();
        livres.add(new Livre("978-1", "Clean Code",      "Robert Martin",  2008));
        livres.add(new Livre("978-2", "Java en action",  "Joshua Bloch",   2001));
        livres.add(new Livre("978-3", "Design Patterns", "GoF",            1994));
        livres.add(new Livre("978-4", "Refactoring",     "Martin Fowler",  1999));

        HashSet<String> categories = new HashSet<>();
        categories.add("Programmation");
        categories.add("Architecture");
        categories.add("Programmation"); 
        categories.add("Base de données");

        HashMap<String, String> emprunts = new HashMap<>();
        emprunts.put("Yassine", "978-1");
        emprunts.put("Sara",    "978-2");

        String recherche = "Java en action";
        System.out.println("=== Recherche: " + recherche + " ===");
        for (Livre l : livres) {
            if (l.getTitre().equals(recherche)) {
                System.out.println("Trouvé : " + l);
            }
        }

        livres.removeIf(l -> l.getIsbn().equals("978-3"));

        System.out.println("\n=== Livres disponibles (non empruntés) ===");
        for (Livre l : livres) {
            if (!emprunts.containsValue(l.getIsbn())) {
                System.out.println(l);
            }
        }

        System.out.println("\n========== RAPPORT FINAL ==========");
        System.out.println("Total livres en stock   : " + livres.size());
        System.out.println("Catégories disponibles  : " + categories);
        System.out.println("Nombre de livres empruntés : " + emprunts.size());
        System.out.println("\nDétail des emprunts :");
        for (Map.Entry<String, String> entry : emprunts.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> ISBN " + entry.getValue());
        }
        System.out.println("====================================");
    }
}