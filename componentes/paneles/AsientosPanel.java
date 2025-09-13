package componentes.paneles;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AsientosPanel extends JPanel {
    //lista para guardar todos los botones de los asientos
    private List<JButton> botonesAsientos;

    //metodo que recibe el numero de filas y columnas para la creacion de la tabla de asientos
    public AsientosPanel(int filas, int columnas){
        setLayout(new  GridLayout(filas, columnas, 5,5));

        //guarda los botones de los asientos
        botonesAsientos = new ArrayList<>();

        //recorera cada posicion de la cuadricula
        for (int i = 0; i < filas * columnas; i++){
            //crear el boton con el numero de asiento Ej: "C1", "C2"...
            String etiqueta = "C" + (i + 1);
            JButton asiento = new JButton(etiqueta);

            //si esta disponible se torna de color verde
            asiento.setBackground(Color.GREEN);

            //al darle click al boton vera si esta disponible o no
            asiento.addActionListener(e -> {
                //asiento que ocupa se coloca en rojo
                if (asiento.getBackground() == Color.GREEN){
                    asiento.setBackground(Color.RED);
                } else {
                    //si ya estaba reservado lo vuelve a disponible
                    asiento.setBackground(Color.GREEN);
                }
            });

            //agregar el boton al panel visual
            add(asiento);

            botonesAsientos.add(asiento);
        }
    }

        //metodo para obtener los asientos reservados
        public List<String> getAsientosReservados(){
            List<String> reservados = new ArrayList<>();

            //revisa cada boton de la lista
            for(JButton asiento : botonesAsientos){
                //si esta de color rojo, significa que esta reservado
                if (asiento.getBackground() == Color.RED){
                    reservados.add(asiento.getText());  //guarda el nombre del asiento
                }
            }
            return reservados; //devolver lista de asientos reservados
        }

    }

