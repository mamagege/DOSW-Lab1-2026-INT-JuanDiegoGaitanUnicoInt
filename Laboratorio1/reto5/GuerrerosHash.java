package reto5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GuerrerosHash {
    public static HashSet<Integer> leerHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        llenarConjunto(hashSet, "Escribe los guerreros hash (Separados por espacio. Ej: 4 6 8): ");
        return hashSet;
    }

    public static TreeSet<Integer> leerTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        llenarConjunto(treeSet, "Escribe los guerreros tree (Separados por espacio. Ej: 1 2 3): ");
        return treeSet;
    }

    private static void llenarConjunto(Set<Integer> conjunto, String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        String linea = scanner.nextLine();

        //Por buenas prácticas usar Try
        try (Scanner scannerLinea = new Scanner(linea)) {
            while (scannerLinea.hasNextInt()) {
                conjunto.add(scannerLinea.nextInt());
            }
        }
    }
}
