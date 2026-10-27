public static void main(String[] args) {
 Refugio refugio = new Refugio("Horizonte");

 refugio.agregarSuperviviente(new Explorador(
"EXP-101", "Ada", NivelExperiencia.SENIOR, true, 30));
 refugio.agregarSuperviviente(new Medico(
 "MED-220", "Bruno", NivelExperiencia.INTERMEDIO, true, 45));
 refugio.agregarSuperviviente(new Constructor(
 "CON-330", "Carla", NivelExperiencia.SENIOR, true, 25));
 refugio.agregarSuperviviente(new Explorador(
 "EXP-404", "Diego", NivelExperiencia.JUNIOR, true, 18));
 refugio.agregarSuperviviente(new Medico(
 "EXP-101", "Ada", NivelExperiencia.JUNIOR, true, 12));
 System.out.println("Supervivientes registrados:");
 mostrarSupervivientes(refugio.obtenerSupervivientes());
 System.out.println("\nAptitudes:");
 mostrarAptitudes(refugio.obtenerSupervivientes());
 System.out.println("\nAsignacion de tareas:");
 asignarTareas(refugio.obtenerSupervivientes());
 System.out.println("\nCapacitaciones:");
 capacitarSupervivientes(refugio.obtenerSupervivientes());
 System.out.println("\nDisponibles con aptitud >= 50:");
 mostrarSupervivientes(refugio.obtenerDisponiblesConAptitudMinima(50));
 System.out.println("\nSupervivientes SENIOR:");
 mostrarSupervivientes(refugio.filtrarPorNivel(NivelExperiencia.SENIOR));
 }
 private static void mostrarSupervivientes(List<Superviviente> lista) {
 }
 private static void mostrarAptitudes(List<Superviviente> lista) {

 }
 private static void asignarTareas(List<Superviviente> lista) {
 }
 private static void capacitarSupervivientes(List<Superviviente> lista) {

 }