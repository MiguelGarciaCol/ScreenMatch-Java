import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("La Mejor Pelicula");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.9;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Harry Potther";
        String sinosis = """
                El día de su cumpleaños, Harry Potter descubre que es hijo de dos conocidos hechiceros, de los que ha heredado poderes mágicos. Debe asistir a una famosa escuela de magia y hechicería, donde entabla una amistad con dos jóvenes que se convertirán en sus compañeros de aventura. Durante su primer año en Hogwarts, descubre que un malévolo y poderoso mago llamado Voldemort está en busca de una piedra filosofal que alarga la vida de quien la posee.
                """;


        double mediaUsuario = 0;

        System.out.println(nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificacion: " + evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println("sinosis: " + sinosis);

        double mediaEvalucion =  (3.0 + 5 + 4.3) / 3;

        System.out.println("Media de criticas: " + mediaEvalucion);


        if (fechaDeLanzamiento >= 2023){
            System.out.println("peliculas Nuevas");
            }   else {
            System.out.println("pelicula antigua");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingrese la nota para la pelicula");
            double nota = teclado.nextDouble();
            mediaUsuario = mediaUsuario + nota;
        }
        System.out.println("la media de la pelicula es: " + mediaUsuario / 3);
      }
    }

