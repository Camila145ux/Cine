package views;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;

import componentes.header.Header;
import componentes.modulos.Pelicula;
import componentes.paneles.AsientosPanel;
import componentes.paneles.CarteleraPanel;
import componentes.paneles.ReservaPanel;
import database.ReservasData;

public class VentanaCine extends JFrame {

    public VentanaCine(){
        setTitle("Reservacion de cine");
        setExtendedState(JFrame.MAXIMIZED_BOTH); //ventana completa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);


        //Header
        Header headerPanel = new Header();
        this.add(headerPanel, BorderLayout.NORTH);


        //Data base (lista de peliculas)
        List<Pelicula> peliculas = ReservasData.peliculas;

        
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