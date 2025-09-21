package views;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import componentes.modulos.*;

public class Reserva extends JFrame {

    public Reserva(String pelicula, String dia, String hora, Set<String> asientos ){
        setTitle("🎥 Luces, cámara… ¡reserva confirmada!");
        setSize(2000, 1050);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());


        //panel pricipal
        JPanel panelReserva = new JPanel();
        panelReserva.setLayout(new BoxLayout(panelReserva, BoxLayout.Y_AXIS));  //acomoda los elementos en columna
        panelReserva.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));


        //titulo
        JLabel tituloReserva = new JLabel("🎥 Reserva Confirmada 🎥", SwingConstants.CENTER);
        tituloReserva.setFont(new Font("SansSerif", Font.BOLD, 22));
        tituloReserva.setForeground(new Color(200, 30, 30));
        tituloReserva.setAlignmentX(Component.CENTER_ALIGNMENT);

        //pelicula
        JLabel labelPelicula = new JLabel("🎬 Película: " + pelicula);
        labelPelicula.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Dia
        JLabel labelDia = new JLabel("📅 Día: " + dia);
        labelDia.setAlignmentX(Component.CENTER_ALIGNMENT);


        //hora
        JLabel labelHora = new JLabel("⏰ Hora: " + hora);
        labelHora.setAlignmentX(Component.CENTER_ALIGNMENT);


        //Asientos
        JLabel labelAsientos = new JLabel("💺 Asientos:  " + asientos);
        labelAsientos.setAlignmentX(Component.CENTER_ALIGNMENT);


        //mensaje
        JLabel mensaje = new JLabel("🍿 ¡Disfruta tu película!");
        mensaje.setForeground(new Color(50, 100, 200));
        mensaje.setAlignmentX(Component.CENTER_ALIGNMENT);


        panelReserva.add(tituloReserva);
        panelReserva.add(labelPelicula);
        panelReserva.add(Box.createRigidArea(new Dimension(0,10)));
        panelReserva.add(labelDia);
        panelReserva.add(labelHora);
        panelReserva.add(labelAsientos);
        panelReserva.add(Box.createRigidArea(new Dimension(0,20)));
        panelReserva.add(mensaje);

        add(panelReserva, BorderLayout.CENTER);
        setVisible(true);


    }
    
}
