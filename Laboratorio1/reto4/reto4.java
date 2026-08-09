package reto4;

import java.util.Hashtable;
import java.util.Map;

import static reto4.LectorMapa.*;
import static reto4.Combinador.*;

public class reto4 {
    public static void main(String[] args) {
        Map<String, Integer> mapaHash = leerHashMap();
        Hashtable<String, Integer> mapaTable = leerHashTable();

        Map<String, Integer> mapaCombinado = combinarMapas(mapaHash, mapaTable);

        System.out.println(mapaCombinado);

    }
}
