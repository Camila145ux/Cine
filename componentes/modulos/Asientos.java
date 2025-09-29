package componentes.modulos;

public class Asientos {
    private String id;
    private boolean ocupado;

    public Asientos(String id, boolean ocupado) {
        this.id = id;
        this.ocupado = ocupado;
    }

    public String getId() 
    { return id; }

    public boolean isOcupado() 
    { return ocupado; }
    

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
