public class Ejercicio3 {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;

        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        manuel.setNombre("Manuel Antonio");

        lista.imprimirNombres();

        System.out.println("\nNombres individuales:");
        System.out.println("Nombre de manuel: " + manuel.getNombre());
        System.out.println("Nombre de copia: " + copia.getNombre());
        System.out.println("Nombre de referencia: " + referencia.getNombre());
    }
}
