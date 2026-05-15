package Part5;

import java.util.TreeMap;
import java.util.Map;

public class MainTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> etudiants = new TreeMap<>();
        etudiants.put(103, "Yassine");
        etudiants.put(98,  "Sara");
        etudiants.put(115, "Amine");
        etudiants.put(87,  "Nadia");
        etudiants.put(120, "Karim");

        
        System.out.println("=== Liste triée par numéro ===");
        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println("N°" + entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nPremier : N°" + etudiants.firstKey() + " - " + etudiants.get(etudiants.firstKey()));
        System.out.println("Dernier : N°" + etudiants.lastKey()  + " - " + etudiants.get(etudiants.lastKey()));



        System.out.println("\n=== Étudiants avec numéro > 100 ===");
        for (Map.Entry<Integer, String> entry : etudiants.tailMap(101).entrySet()) {
            System.out.println("N°" + entry.getKey() + " - " + entry.getValue());
        }
    }
}