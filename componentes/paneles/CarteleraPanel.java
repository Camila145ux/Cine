package componentes.paneles;

import java.util.List;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;
import java.awt.*;

import componentes.modulos.Pelicula;

public class CarteleraPanel extends JPanel {

    // Constructor que recibe una lista de películas para mostrarlas en la cartelera
    public CarteleraPanel(List<Pelicula> peliculas){
      //disenno vertical
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      setBackground(Color.BLACK);


    //img y titulos
    for (Pelicula movie : peliculas){
        //img
        ImageIcon original = new ImageIcon(movie.getImg());
        Image img = original.getImage().getScaledInstance(150, 220, Image.SCALE_SMOOTH);
        ImageIcon portada = new ImageIcon(movie.getImg());

        //titulo
        JLabel label = new JLabel(movie.getTitulo(), portada, JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM); //centrar la img con el titulo
        label.setForeground(Color.WHITE); //Color de texto
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        //espacio alrededor de cada pelicula
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        //agregar la etiqueta al panel
        add(label);
    }
}
}
