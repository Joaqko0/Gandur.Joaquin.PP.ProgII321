
public class Medico extends Supervivientes implements Capacitable {
    private int conocimiento;
    public Medico(String codigo, String nombre, NivelExperiencia nivel, boolean disponible, int conocimientos){
        super(codigo, nombre, nivel, disponible);
        if(conocimientos <= 0)
            throw new IllegalArgumentException("No posee conocimientos");
        this.conocimiento = conocimientos;
    }
    @Override
    public int calcularAptitud(){ return conocimiento +10;}
    @Override 
    public void capacitarse(){}
    @Override 
    public String toString() {return "Medico" + super.toString() + ", conocimientos" + conocimiento;}
}
