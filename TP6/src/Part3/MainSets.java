package Part3;

import java.util.HashSet;
import java.util.TreeSet;

public class MainSets {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Mathématiques");
        hashSet.add("Informatique");
        hashSet.add("Physique");
        hashSet.add("Anglais");
        hashSet.add("Informatique"); 

        System.out.println("Nombre de matières : " + hashSet.size()); 

        System.out.println("\n=== HashSet (ordre quelconque) ===");
        for (String m : hashSet) {
            System.out.println(m);
        }

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("\n=== TreeSet (ordre alphabétique) ===");
        for (String m : treeSet) {
            System.out.println(m);
        }
    }
}