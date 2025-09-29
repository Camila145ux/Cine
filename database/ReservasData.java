package database;

import componentes.modulos.Pelicula;

import java.util.ArrayList;
import java.util.List;



public class ReservasData {

    //lista fija de peliculas disponibles en cartelera
    public static List<Pelicula> peliculas = List.of( 
        new Pelicula("Spiderman", "superheroes", 120, "PG-13", "assets/spider.png"),
        new Pelicula("Titanic", "romance", 200, "PG-14", "assets/titanic.jpg"),
        new Pelicula("¿Què pasò ayer?", "comedia", 230, "PG-16", "assets/ayer.jpg"),
        new Pelicula("Chucky", "miedo", 260, "PG-17", "assets/chu.png")

    );

    //lista de reservas realizadas
    public static ArrayList<Object[]> reservas = new ArrayList<>();


    //recibe los datos de la reserva como parametros
    public static void agregar(String pelicula, String dia, String hora, String asientos){

        Object[] nueva = {pelicula, dia, hora, asientos};

        reservas.add(nueva);
    }
}