package reto1;


import java.util.ArrayList;

public class MensajeBienvenida {

    public void creadorMensaje(ArrayList<Estudiante> estudiantes) {

        System.out.println("!Hola, bienvenidos! Somos la pareja conformada por ");

        estudiantes.forEach(estudiante -> {

            String nombre = estudiante.getNombre();
            int semestre = estudiante.getSemestre();
            int edad = estudiante.getEdad();
            //String correo = estudiante.getCorreo();


            System.out.println(nombre + ", estudiante de: " + semestre + "° semestre de " + edad + " años.");
        });

        ArrayList<String> correos = new ArrayList<>();

        estudiantes.forEach(estudiante -> {
            String correo = estudiante.getCorreo();
            correos.add(correo);

        });

        System.out.print("Nuestros correos  son: ");
        for (String correo: correos){
            System.out.print(correo + ", ");
        }


    }


}



