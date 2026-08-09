package Reto1;

public class reto1 {
    public static void main(String[] args) {
        LectorEstudiantes lector = new LectorEstudiantes();
        lector.leerDatos();

        MensajeBienvenida mensaje = new MensajeBienvenida();
        mensaje.creadorMensaje(lector.getEstudiantes());

    }
}
