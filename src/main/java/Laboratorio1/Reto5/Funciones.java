package Reto5;

import java.util.Set;
import java.util.stream.Collectors;

public class Funciones {
    public static Set<Integer> eliminarMultiplos (Set<Integer> set, int multiplo){
        return set.stream().filter(e -> e % multiplo != 0).collect(Collectors.toSet());
    }

}
