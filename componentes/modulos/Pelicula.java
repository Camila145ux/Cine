package componentes.modulos;

public class Pelicula {
    //atributos que describen una pelicula
    private String titulo;
    private String genero;
    private int duracion;
    private String clasificacion;
    private String img;

    //Metodo constructuctor para crear una pelicula con todos sus datos
    public Pelicula(String titulo, String genero, int duracion, String clasificacion, String img){
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.img = img;
    }

    //metodo GET: para acceder a los atributos
    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getDuracion(){
        return duracion;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public String getImg(){
        return img;
    }

}
