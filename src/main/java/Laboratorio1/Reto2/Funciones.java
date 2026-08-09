package Reto2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Funciones {

    public static int numeroMasPequeno(List<Integer> lista){
        return lista.stream().min(Comparator.naturalOrder()).orElseThrow();
    }

    public static long cantidadNumeros(List<Integer> lista){
        return lista.size();
    }

    public static int numeroMasGrande (List<Integer> lista) {
        return lista.stream().max(Comparator.naturalOrder()).orElseThrow();
    }

    public static List<Number> minMaxCantidad(List<Integer> lista) {
        return List.of(numeroMasGrande(lista), numeroMasPequeno(lista), cantidadNumeros(lista));
    }

    public static boolean isNumberMultiple2(int numero){
        return (numero % 2 == 0);
    }

    public static boolean isMaxMultiple2(List<Integer> lista){
        return (isNumberMultiple2(numeroMasGrande(lista)));
    }

    public static List<Object> allFunctionsMixed(List<Integer> lista) {

        List<Object> resultado = new ArrayList<>(minMaxCantidad(lista));
        resultado.add(isMaxMultiple2(lista));
        return resultado;
    }





}
