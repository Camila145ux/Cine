package componentes.paneles;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.*;

public class HorarioPanel extends JPanel{
    //JTextxField (el usuario puede editar)
    private JTextField elegirFecha;
    private JTextField elegirHora;

    //metodo constructor
    public HorarioPanel(){
        //posicion
        setLayout(new GridLayout(2,2,10,10));

        //etiquetas para agregar al panel
        //fecha
        add(new JLabel("Fecha (DD-MM-YYYY): ")); //texto para que el usuario ingrese el contenido
        elegirFecha = new JTextField("29/04/2025"); //como se veria
        add(elegirFecha);

        //hora
        add(new JLabel("Hora (HH:MM): "));
        elegirHora = new JTextField("03:45");
        add(elegirHora);
    }


    //metodo get (para obtener el horario selecionado y convertirlo el texto a un objeto)
    public LocalDate getFechaSelecionada(){
        return LocalDate.parse(elegirFecha.getText()); //convertir el texto a objeto
    }

    public LocalTime getHoraSelecionada(){
        return LocalTime.parse(elegirHora.getText());
    }
   
}