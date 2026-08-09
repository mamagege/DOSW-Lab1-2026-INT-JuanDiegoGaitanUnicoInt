package Reto3;

import java.util.stream.*;


public class Amplificador {
    public static String amplificar (String palabra) {

        return IntStream.range(0, 3)
                //IntStream crea una stream con valor de 0 al 2 (0,1,2)
                .mapToObj(i -> palabra)
                //Convierte mapeando cada elemento del stream de 3 a la palabra
                .collect(Collectors.joining(" "));
                //Une los elementos del stream con un espacio y devuelve un String
                //Usa StringBuilder de fondo
    }





}
