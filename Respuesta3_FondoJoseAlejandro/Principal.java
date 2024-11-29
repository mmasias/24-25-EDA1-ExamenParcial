public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        System.out.println("Objeto manuel: " + manuel);
        System.out.println("Objeto copia: " + copia);
        System.out.println("Referencia: " + referencia);

        System.out.println("\n¿'manuel' y 'copia' son el mismo objeto?: " + (manuel == copia));
        System.out.println("¿'manuel' y 'referencia' son el mismo objeto?: " + (manuel == referencia));

        manuel.setNombre("Manuel Antonio");

        System.out.println("\nDespués de modificar 'manuel':");
        System.out.println("Objeto manuel: " + manuel);
        System.out.println("Objeto copia: " + copia);
        System.out.println("Referencia: " + referencia);

        System.out.println("\n¿El nombre de 'copia' cambió?: " + (copia.getNombre().equals("Manuel Antonio")));
        System.out.println("¿El nombre de 'referencia' cambió?: " + (referencia.getNombre().equals("Manuel Antonio")));
    }
}