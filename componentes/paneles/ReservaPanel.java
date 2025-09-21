package componentes.paneles;
import views.Reserva;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Set;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReservaPanel  extends JPanel{

    //menu despegable para elegir pelicula y dia
    private JComboBox<String> comboPeliculas;
    private JComboBox<String> comboDias;

    private JTextField campoHora;

    private AsientosPanel panelAsientos;  //--> muestra panel de asientos


    //metodo constructor
    public ReservaPanel(){
        setLayout(new BorderLayout());
        setBackground(new Color(80,80,70));



        //panel superior con los menus y el boton
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.setBackground(Color.gray);
        panelSuperior.setPreferredSize(new Dimension(100, 50));

        


        //opciones de peliculas y dias
        String[] peliculas = {"Spider-man", "Flipped", "Que paso ayer", "Chucky"};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        //creacion de menus despegables
        comboPeliculas = new JComboBox<>(peliculas);
        comboDias = new JComboBox<>(dias);


        //campo para escribir la hora
        campoHora = new JTextField(8);
        campoHora.setText("18:00");





        //boton para confirmar la reserva
        JButton btnConfirmar = new JButton("Confirmar Reserva");

        btnConfirmar.addActionListener(e -> {
            //obtenemos lo que el usuario eligio
            String pelicula = (String) comboPeliculas.getSelectedItem();
            String dia = (String) comboDias.getSelectedItem();
            String hora = campoHora.getText().trim();
            Set<String> asientos = panelAsientos.getAsientosSeleccionados();



            //si no eligio ningun asiento, se muestra una advertencia
            if (asientos.isEmpty()){  //se pregunta si no ha seleccionado asientos

               JOptionPane.showMessageDialog(this, "NO selecciono ningun asiento");  //imprime el mensaje
    
            
            } else { //si, SI selecciono el asiento entonces aparecera la info
               new Reserva(pelicula, dia, hora, asientos);
            }

        });




        //elementos del panel superior
        panelSuperior.add(new JLabel("Pelicula: "));
        panelSuperior.add(comboPeliculas);
        panelSuperior.add(new JLabel("Dia: "));
        panelSuperior.add(comboDias);
        panelSuperior.add(new JLabel("Hora: "));
        panelSuperior.add(campoHora);
        panelSuperior.add(btnConfirmar);


        add(panelSuperior, BorderLayout.SOUTH);;
        panelAsientos = new AsientosPanel();
        add(panelAsientos, BorderLayout.CENTER);
    }
}











//NOTAS:
//Un JComboBox --> es un menú desplegable en Java Swing. 
//Sirve para mostrar una lista de opciones y dejar que el usuario elija una.

//isEmpty() --> es un método que se usa para saber si una lista, conjunto o texto está vacío.

//JOptionPane.showMessageDialog(...) --> es como una ventanita emergente que te da un mensaje.