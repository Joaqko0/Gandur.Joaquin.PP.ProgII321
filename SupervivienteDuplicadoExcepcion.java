public class SupervivienteDuplicadoExcepcion extends Exception{
    public SupervivienteDuplicadoExcepcion(Supervivientes s){
        super("Ya Existe un superviviente con un codigo" + s.getCodigo() + " y nombre" + s.getNombre());
    }
    
}
