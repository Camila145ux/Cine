import javax.swing.*;

import componentes.header.Header;
import componentes.modulos.Pelicula;
import componentes.paneles.AsientosPanel;
import componentes.paneles.CarteleraPanel;
import componentes.paneles.HorarioPanel;

import java.awt.BorderLayout;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        //ventana
        JFrame ventanaPrincipal = new JFrame();  //crear ventana vacia
        ventanaPrincipal.setTitle("Reservacion de Pelicula"); //titulo de la ventana
        ventanaPrincipal.setSize(1000, 800); //tamanno de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLayout(new BorderLayout());
        ventanaPrincipal.setLocationRelativeTo(null);

        //Header
        Header headerPanel = new Header();
        ventanaPrincipal.add(headerPanel, BorderLayout.NORTH);


        //lista de pelicula
        List<Pelicula> peliculas = List.of(
            new Pelicula("Spiderman", "superheroes", 120, "PG-13", "assets/spider.png"),
            new Pelicula("Mi primer amor", "romance", 200, "PG-14", "assets/amor.png"),
            new Pelicula("¿Què pasò ayer?", "comedia", 230, "PG-16", "assets/ayer.jpg"),
            new Pelicula("Chucky", "miedo", 260, "PG-17", "assets/chu.png")
        );

        
        //cartelera panel (peliculas con imgs)
        CarteleraPanel carteleraPanel = new CarteleraPanel(peliculas);
        ventanaPrincipal.add(carteleraPanel, BorderLayout.WEST); 



        //horario panel (fecha y hora)
        HorarioPanel horarioPanel = new HorarioPanel();
        ventanaPrincipal.add(horarioPanel, BorderLayout.SOUTH);



        //asientos panel (cuadricula)
        AsientosPanel asientosPanel = new AsientosPanel(5, 6);
        ventanaPrincipal.add(asientosPanel, BorderLayout.CENTER);


        ventanaPrincipal.setVisible(true);

    }
}