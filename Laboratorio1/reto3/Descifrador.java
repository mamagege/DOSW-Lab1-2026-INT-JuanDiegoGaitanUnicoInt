package reto3;

public class Descifrador {

    public static String descrifar(String mensaje){
        return mensaje.chars().
                //Crea un IntStream con los códigos de cada caracter para poder procesarlos
                mapToObj(c -> (char) c)
                //Convierte cada codigo en tipo Character
                .collect(
                        StringBuffer::new,
                        StringBuffer::append,
                        StringBuffer::append
                //Se crean los buffers necesarios para contener los elementos Character
                ).reverse().toString();
                //Se invierte el order y se transforma a String
    }
}
