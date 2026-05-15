package Part4;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {

        HashMap<String, Double> notes = new HashMap<>();
        notes.put("Yassine", 14.5);
        notes.put("Sara",    17.0);
        notes.put("Amine",   12.3);
        notes.put("Nadia",   15.8);

        System.out.println("=== Notes des étudiants ===");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String etudiant = "Sara";
        System.out.println("\nNote de " + etudiant + " : " + notes.get(etudiant));

        notes.put("Yassine", 16.0); 
        System.out.println("Nouvelle note de Yassine : " + notes.get("Yassine"));

        notes.remove("Amine");
        System.out.println("\n=== Après suppression de Amine ===");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        double total = 0;
        for (double note : notes.values()) {
            total += note;
        }
        double moyenne = total / notes.size();
        System.out.println("\nMoyenne générale de la classe : " + moyenne);
    }
}