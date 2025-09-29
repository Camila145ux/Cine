package componentes.paneles;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import componentes.modulos.Asientos;
import database.AsientosData;

public class AsientosPanel extends JPanel {

    private final Set<String> asientosSeleccionados = new HashSet<>(); // Guarda los asientos seleccionados
   
   //imagenes de asientos
    private final ImageIcon iconoLibre = escalar("assets/libre.png");     
    private final ImageIcon iconoOcupado = escalar("assets/ocupado.png"); 

    public AsientosPanel() {
        setLayout(new BorderLayout());

        // simulacion de pantalla
        JLabel pantalla = new JLabel("PANTALLA", SwingConstants.CENTER);
        pantalla.setOpaque(true);
        pantalla.setBackground(new Color(0, 102, 204));
        pantalla.setForeground(Color.WHITE);
        pantalla.setFont(new Font("Arial", Font.BOLD, 18));
        pantalla.setPreferredSize(new Dimension(0, 40));
        add(pantalla, BorderLayout.NORTH);

        //Panel donde iran los asientos
        JPanel panelAsientos = new JPanel(new GridBagLayout());
        add(panelAsientos, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();  //objeto para posicionar los asientos
        gbc.insets = new Insets(5, 5, 5, 5); // espacio entre botones

        int i = 0;

        for (Asientos asiento : AsientosData.asientos) {
            String id = asiento.getId();
            JButton boton = new JButton(id, asiento.isOcupado() ? iconoOcupado : iconoLibre);
            boton.setHorizontalTextPosition(JButton.CENTER);
            boton.setVerticalTextPosition(JButton.BOTTOM);  //etiqueta debajo del boton
            boton.setBorderPainted(false);   //sin borde
            boton.setContentAreaFilled(false);  //sin fondo gris
            boton.setFocusPainted(false);  //sin borde de seleccion

            //Solo si está libre, permite seleccionar
            if (!asiento.isOcupado()) {
                boton.addActionListener(e -> {
                    if (asientosSeleccionados.contains(id)) {
                        asientosSeleccionados.remove(id);  // Si ya estaba seleccionado, lo desmarca
                        boton.setIcon(iconoLibre);   //cambia a img libre
                    } else {
                        asientosSeleccionados.add(id); // Si no estaba seleccionado, lo marca ocupado
                        boton.setIcon(iconoOcupado);  //cambia a img ocuapdo
                    }
                });
            } else {
                boton.setEnabled(false); //si esta ocupado, desactiva el boton 
            }

    
            if (i < 4) {
                // Grupo izquierdo (2x2)
                gbc.gridx = i % 2;
                gbc.gridy = i / 2;
            } else if (i < 13) {
                // Centro-izquierda (3x3)
                int local = i - 4;
                gbc.gridx = (local % 3) + 4;
                gbc.gridy = local / 3;
            } else if (i < 22) {
                // Centro-derecha (3x3)
                int local = i - 13;
                gbc.gridx = (local % 3) + 8;
                gbc.gridy = local / 3;
            } else if (i < 26) {
                // Grupo derecho (2x2)
                int local = i - 22;
                gbc.gridx = (local % 2) + 12;
                gbc.gridy = local / 2;
            } else {
                // Grupo inferior (1x5)
                int local = i - 26;
                gbc.gridx = local + 4;
                gbc.gridy = 5;
            }

            panelAsientos.add(boton, gbc);
            i++;
        }
    }

    // tammano img
    private ImageIcon escalar(String ruta) {
        Image img = new ImageIcon(ruta).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

   //devuelve los asientos selecionados
    public Set<String> getAsientosSeleccionados() {
        return asientosSeleccionados;
    }
}
