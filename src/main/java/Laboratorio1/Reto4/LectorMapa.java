package Reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Hashtable;

public class LectorMapa {
    public static HashMap<String, Integer> leerHashMap(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elementos del HashMap " +
                "(Separado por espacios y coma. Ej: oro 10, metal 20, madera 1): ");

        String linea = scanner.nextLine();

        List<String> elementos = List.of(linea.split(","));

        return elementos.stream()
                .map(String::strip)
                .map(e -> e.split(" "))
                .collect(Collectors.toMap(
                        partes -> partes[0],
                        partes -> Integer.parseInt(partes[1]),
                        (v1,v2) -> v1,
                        HashMap::new
                        ));
    }

    public static Hashtable<String, Integer> leerHashTable(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elementos del HashTable " +
                "(Separado por espacios y coma. Ej: oro 10, metal 20, madera 1): ");

        String linea = scanner.nextLine();

        List<String> elementos = List.of(linea.split(","));

        return elementos.stream()
                .map(String::strip)
                .map(e -> e.split(" "))
                .collect(Collectors.toMap(
                        partes -> partes[0],
                        partes -> Integer.parseInt(partes[1]),
                        (v1,v2) -> v1,
                        Hashtable::new
                ));
    }
}
