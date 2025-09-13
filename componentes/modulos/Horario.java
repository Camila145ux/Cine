package componentes.modulos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    //atributos (que definen el horario de la funcion)
    private Pelicula pelicula; //pelicula q se proyecta
    private LocalDate fecha;
    private LocalTime hora;
    private int nsala;

    //metodo constructor
    public Horario(Pelicula pelicula, LocalDate fecha, LocalTime hora, int Nsala){
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.hora = hora;
        this.nsala= nsala;
    }

    //metodo get (para acceder a los datos)
    public Pelicula getPelicula(){
        return pelicula;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public LocalTime getHora(){
        return hora;
    }

    public int getNsala(){
        return nsala;
    }

    //mostrar horario como texto
    public String getHorarioCompleto(){
        return fecha.toString() + " " + hora.toString();
        }
}
