import java.util.ArrayList;
import java.util.List;

public class Refugio {
    private String nombre;
    private List<Supervivientes> supervivientes = new ArrayList<>();
    
    public Refugio (String nombre){
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre es obligatorio");
        this.nombre = nombre;
    
    }
    public void agregarSuperviviente(Supervivientes s) throws SupervivienteDuplicadoExcepcion {
        if (s == null)
            throw new IllegalArgumentException("El superviviente no puede ser null");
        if (supervivientes.contains(s))
            throw new SupervivienteDuplicadoExcepcion(s);
        supervivientes.add(s);
                    
    }
    public List <Supervivientes> obtenerSupervivientes(){
        return new ArrayList<>(supervivientes);
    }
    public List <Supervivientes> obtenerAptitudesConMinimas(int minimo){
        if (minimo < 0) 
            throw new IllegalArgumentException("El minimo no puede ser negativo");
        List<Supervivientes> resultado = new ArrayList<>();
        for (Supervivientes s : supervivientes){
            if (s.isDisponible() && s.calcularAptitud() >= minimo) resultado.add(s);
        }
        return resultado;
    }
    public List<Supervivientes> filtrarPorNivel(NivelExperiencia nivel) {
        List<Supervivientes> resultado = new ArrayList<>();
        for (Supervivientes s : supervivientes){
            if (s.getNivel() == nivel) resultado.add(s);
        }
        return resultado;
    }
    
    
}
