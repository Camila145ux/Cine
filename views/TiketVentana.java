package views;

import database.ReservasData;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Set;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;


public class TiketVentana extends JFrame {

    public TiketVentana(String pelicula, String dia, String hora, Set<String> asientos ){
        //database
        String asientosTexto = String.join("-", asientos);
        ReservasData.agregar(pelicula, dia, hora, asientosTexto);


        setTitle("🎥 Luces, cámara… ¡reserva confirmada!");
        setSize(2000, 1050);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());


        //panel pricipal
        JPanel panelReserva = new JPanel();
        panelReserva.setLayout(new BoxLayout(panelReserva, BoxLayout.Y_AXIS));
        panelReserva.setBackground(new Color(245, 245, 245)); 



        //titulo
        JLabel tituloReserva = new JLabel("🎥 Reserva Confirmada 🎥", SwingConstants.CENTER);
        tituloReserva.setFont(new Font("SansSerif", Font.BOLD, 22));
        tituloReserva.setForeground(new Color(200, 30, 30));
        tituloReserva.setAlignmentX(Component.CENTER_ALIGNMENT);

        //pelicula
        JLabel labelPelicula = new JLabel("🎬 Película: " + pelicula);
        labelPelicula.setFont(new Font("SansSerif", Font.BOLD, 18));
        labelPelicula.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Dia
        JLabel labelDia = new JLabel("📅 Día: " + dia);
        labelDia.setFont(new Font("SansSerif", Font.PLAIN, 16));
        labelDia.setAlignmentX(Component.CENTER_ALIGNMENT);


        //hora
        JLabel labelHora = new JLabel("⏰ Hora: " + hora);
        labelHora.setFont(new Font("SansSerif", Font.PLAIN, 16));
        labelHora.setAlignmentX(Component.CENTER_ALIGNMENT);


        //Asientos
        JLabel labelAsientos = new JLabel("💺 Asientos:  " + asientos);
        labelAsientos.setFont(new Font("SansSerif", Font.PLAIN, 16));
        labelAsientos.setAlignmentX(Component.CENTER_ALIGNMENT);


        //mensaje
        JLabel mensaje = new JLabel("🍿 ¡Disfruta tu película!");
        mensaje.setFont(new Font("SansSerif", Font.ITALIC, 15));
        mensaje.setForeground(new Color(50, 100, 200));
        mensaje.setAlignmentX(Component.CENTER_ALIGNMENT);


        //codigo
        ImageIcon codigoImg = new ImageIcon("assets/codigo.png");
        Image imagenEscalar = codigoImg.getImage().getScaledInstance(175,100, Image.SCALE_SMOOTH);   //tamanno
        ImageIcon iconoFinal = new ImageIcon(imagenEscalar);
        JLabel codigo = new JLabel(iconoFinal);
        codigo.setAlignmentX(Component.CENTER_ALIGNMENT);


        panelReserva.add(tituloReserva);
        panelReserva.add(labelPelicula);
        panelReserva.add(Box.createRigidArea(new Dimension(0,10)));
        panelReserva.add(labelDia);
        panelReserva.add(labelHora);
        panelReserva.add(labelAsientos);
        panelReserva.add(Box.createRigidArea(new Dimension(0,20)));
        panelReserva.add(mensaje);
        panelReserva.add(codigo);

        add(panelReserva, BorderLayout.CENTER);
        setVisible(true);


    }
    
}
