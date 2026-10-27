
public class Constructor extends Supervivientes implements AsignableTarea, Capacitable{
    
    private int habilidadTecnica;
    
    public Constructor(String codigo, String nombre, NivelExperiencia nivel, boolean disponible, int habilidadesTecnicas){
        super(codigo, nombre, nivel, disponible);
        if (habilidadesTecnicas <=0)
            throw new IllegalArgumentException("No existe la habilidad tecnica negativa");
        this.habilidadTecnica = habilidadTecnica;
    }
    @Override 
    public int calcularAptitud(){ return habilidadTecnica * 2;}
    @Override 
    public void recibirTarea(String tarea){setDisponible(false);}
    @Override 
    public void capacitarse(){}
    @Override 
    public String toString() {return "Constructor" + super.toString() + ", Habilidad Tecnica" + habilidadTecnica;}
    
}
