package componentes.paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class AsientosPanel extends JPanel {
   
    private final List<JButton> botonesAsientos = new ArrayList<>();   //lista para guardar todos los botones de los asientos
    private final Set<String> asientosSelecionados = new HashSet<>();  //CONJUNTO para guardar los nombres de los asientos seleccionados

   //escalados para darle tamanno a las imgs
    private final ImageIcon libre = escalar("assets/libre.png");
    private final ImageIcon ocupado = escalar("assets/ocupado.png");


    //panel interno donde se colocan los asientos
    private JPanel panelAsientos;

    //objeto para posicionar cada asiento en coordenadas especificas
    private GridBagConstraints gbc;


    //metodo  constructor 
    public AsientosPanel(){
        setLayout(new BorderLayout()); //colocar la pantalla arriba y asientos al centro
    
    

        //pantalla de cine
        JLabel pantalla = new JLabel("PANTALLA", SwingConstants.CENTER); //texto en el centro
        pantalla.setOpaque(true);
        pantalla.setBackground(Color.RED);
        pantalla.setPreferredSize(new Dimension(0,40));
        pantalla.setForeground(Color.WHITE);
        add(pantalla, BorderLayout.NORTH);



        //panel para el posicionamiento libre
        panelAsientos = new JPanel(new GridBagLayout());
        add(panelAsientos, BorderLayout.CENTER);   //asientos en el centro



        //objeto para posicionar cada asiento
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);

        //secciones
        agregarIzquierda();
        agregarDerecho();
        agregarCentro();

    }





    //seccion Izquierda
    private void agregarIzquierda(){
        for(int fila = 0; fila < 3; fila++){
            for (int columna = 0; columna < 3; columna++){
                agregarAsiento("A", fila, columna);
            }
        }
        for (int columna = 0; columna < 2; columna++){
            agregarAsiento("E", 4, columna + 1);     //fila extra con 2 asientos
        }
    }

    //seccion central
    private void agregarCentro(){
        for (int fila = 0; fila < 4; fila++){
            for (int columna = 0; columna < 4; columna++){
                agregarAsiento("B", fila, columna + 4); //desplaza al centro usando +5 "espacios"
            }
        }
    }

    //seccion derecha
    private void agregarDerecho(){
        for(int fila = 0; fila < 3; fila++){
            for (int columna = 0; columna < 3; columna++){
                agregarAsiento("D", fila, columna + 12);
            }
        }
        for (int columna = 0; columna < 2; columna++){
            agregarAsiento("L", 4, columna + 12);     //fila extra con 2 asientos
        }
    }







    //Crea y posiciona un boton para cada asiento
    private void agregarAsiento(String zona, int fila, int columna){
        String  etiqueta = zona + (fila *10 + columna +1);  //genera etiqueta unica "C2", "L5"



        //boton con las img's de asientos
        JButton asiento = new JButton(etiqueta, libre);
        asiento.setHorizontalTextPosition(JButton.CENTER);
        asiento.setContentAreaFilled(false);  //desaparece el fondo del boton
        asiento.setVerticalTextPosition(JButton.BOTTOM); // etiqueta debajo de la imagen
        asiento.setBorderPainted(false);  //sin borde 


        asiento.addActionListener(e -> {
            if (asiento.getIcon().equals(libre)){
                asiento.setIcon(ocupado);      //cambia a ocupado
                asientosSelecionados.add(etiqueta); //guarda el asiento
            } else{
                asiento.setIcon(libre);       //vuelve a libre
                asientosSelecionados.remove(etiqueta);  //elima de la selecion
            }
        });






        //posiciona el boton en el panel usando coordenadas
        gbc.gridx = columna;
        gbc.gridy = fila;
        panelAsientos.add(asiento, gbc);

        //guardar el boton en la lista
        botonesAsientos.add(asiento);
    }






        //metodo para escalar (hacer mas pequenna o grande) la img
        private ImageIcon escalar(String ruta){
                                                                       //tamanno (px)
            Image img = new ImageIcon(ruta).getImage().getScaledInstance(115, 115, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        }

        //devuelve los nombres de los asientos seleccionados
        public Set<String> getAsientosSeleccionados(){
            return asientosSelecionados;
        }

    }