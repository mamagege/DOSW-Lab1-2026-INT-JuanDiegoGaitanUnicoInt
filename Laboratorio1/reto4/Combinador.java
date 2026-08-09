package reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combinador {
    public static Map<String, Integer> combinarMapas(Map<String, Integer> mapaHash,
                                                     Hashtable<String, Integer> mapaTable)
    {
        return Stream.concat(mapaHash.entrySet().stream(), mapaTable.entrySet().stream())
                //Con concat, convertimos ambos mapas en un solo flujo Stream
                .map(entry ->
                        Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
                //Se convierte la CLAVE a mayúsculas
                .sorted(Map.Entry.comparingByKey())
                //Se order alfabéticamente y de manera ascendete las claves
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1,v2) -> v2,
                        //Se prioriza la llave del HashTable (v2)
                        HashMap::new
                //Se recolecta en un HashMap los elementos transformados
                ));
    }
}
