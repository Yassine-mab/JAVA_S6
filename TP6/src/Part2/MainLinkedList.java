package Part2;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();

        file.add(new Client(1, "Ahmed"));
        file.add(new Client(2, "Fatima"));
        file.add(new Client(3, "Omar"));

        System.out.println("=== File d'attente ===");
        for (Client c : file) {
            System.out.println(c);
        }

        Client servi = file.removeFirst();
        System.out.println("\n=== Client servi ===");
        System.out.println(servi);

        file.addLast(new Client(4, "Salma"));
        System.out.println("\n=== File après ajout de Salma ===");
        for (Client c : file) {
            System.out.println(c);
        }

        System.out.println("\n=== Client en tête de file ===");
        System.out.println(file.getFirst());
    }
}