package componentes.header;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;

public class Header extends JPanel {

    public Header(){
        //centrado
        setLayout(new BorderLayout());
        setLayout(new FlowLayout(FlowLayout.CENTER));

        //color
        setBackground(new Color(80,80,70));

        //titulo
        JLabel tituloHeader = new JLabel("🎬 Sistema de Reservación de Cine");
        tituloHeader.setFont(new Font("Verdana", Font.BOLD, 32)); //FUENTE
        tituloHeader.setForeground(Color.WHITE); //color de texto


        add(tituloHeader, BorderLayout.CENTER);
    }
    
}
