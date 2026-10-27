public abstract class Supervivientes {
    private String codigo;
    private String nombre;
    private NivelExperiencia nivel;
    private boolean disponible;
    
    public Supervivientes(String codigo, String nombre, NivelExperiencia nivel, boolean disponible)
    {
        if (codigo == null || codigo.isBlank() || nombre == null || nombre.isBlank())
        {
            throw new IllegalArgumentException("No el ingresaste codigo ni nombre");
        }
        if (nivel == null){
            throw new IllegalArgumentException("No ingresaste el nivel");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.disponible = disponible;
        
                
    }
    public abstract int calcularAptitud();
    public String getCodigo(){return codigo;}
    public String getNombre(){return nombre;}
    public NivelExperiencia getNivel(){return nivel;}
    public boolean isDisponible(){return disponible;}
    public void setDisponible(boolean disponible){this.disponible = disponible;}
    
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Supervivientes)) return false;
        Supervivientes otro = (Supervivientes) o;
        return codigo.equals(otro.codigo) && nombre.equals(otro.nombre);
        
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(codigo, nombre);
    }
    @Override
    public String toString ()
    {
        return "[codigo=" + codigo + ", nombre" + nombre + ", nivel" + nivel + ", disponible" + disponible + "]";
     
    }
    
    
}

