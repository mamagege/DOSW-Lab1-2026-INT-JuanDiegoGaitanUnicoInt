package reto2;

import java.util.List;
import static reto2.Funciones.*;

public class MensajeFunciones {

    public void mostrarMensaje(List<Integer> lista){

        String esMultiplo2 = isMaxMultiple2(lista) ? "Si" : "No";

        System.out.println("\nLista  => max: " + numeroMasGrande(lista)
                + " min: " + numeroMasPequeno(lista) +
                " cant: " + cantidadNumeros(lista));

        System.out.println("¿" + numeroMasGrande(lista) +
                " múltiplo de 2?: " + esMultiplo2);

        System.out.println("¿" + numeroMasGrande(lista) +
                " divisor de 2?: " + esMultiplo2);

        System.out.println("¿Cantidad (" + cantidadNumeros(lista) + ") "
                + " es par?: " + esMultiplo2);
    }
}
