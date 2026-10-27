public class Explorador extends Supervivientes implements AsignableTarea{
    
    private int resistencia;
    
    public Explorador(String codigo, String nombre, NivelExperiencia nivel, boolean disponible, int resistencia){
        super(codigo, nombre, nivel, disponible);
        if(resistencia <= 0)
            throw new IllegalArgumentException("No es posible tener resistencia Negativa");
        this.resistencia = resistencia;
    
    }
    @Override 
    public int calcularAptitud(){ return resistencia * 2;}
    @Override 
    public void recibirTarea(String tarea){setDisponible(false);}
    @Override 
    public String toString() {return "explorador" + super.toString() + ", Resistencia" + resistencia;}
    
        
            
       
}
