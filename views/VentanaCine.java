package views;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;

import componentes.header.Header;
import componentes.modulos.Pelicula;
import componentes.paneles.AsientosPanel;
import componentes.paneles.CarteleraPanel;
import componentes.paneles.ReservaPanel;

public class VentanaCine extends JFrame {

    public VentanaCine(){
        setTitle("Reservacion dle cine");
        setExtendedState(JFrame.MAXIMIZED_BOTH); //ventana completa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);


        //Header
        Header headerPanel = new Header();
        this.add(headerPanel, BorderLayout.NORTH);


        //lista de pelicula
        List<Pelicula> peliculas = List.of(
            new Pelicula("Spiderman", "superheroes", 120, "PG-13", "assets/spider.png"),
            new Pelicula("Mi primer amor", "romance", 200, "PG-14", "assets/amor.png"),
            new Pelicula("¿Què pasò ayer?", "comedia", 230, "PG-16", "assets/ayer.jpg"),
            new Pelicula("Chucky", "miedo", 260, "PG-17", "assets/chu.png")
        );

        
        //cartelera panel (peliculas con imgs)
        CarteleraPanel carteleraPanel = new CarteleraPanel(peliculas);
        this.add(carteleraPanel, BorderLayout.WEST); 

        //asientos panel (cuadricula)
        this.add(new AsientosPanel());


        //panel reserva
        this.add(new ReservaPanel());



        setVisible(true);
    

    }

    
}