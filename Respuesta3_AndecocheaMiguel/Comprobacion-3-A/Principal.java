public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;

        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        System.out.println("\nReferencias en la lista:");
        Nodo actual = lista.getCabeza();
        while (actual != null) {
            System.out.println(System.identityHashCode(actual.persona));
            actual = actual.siguiente;
        }
    }
}
