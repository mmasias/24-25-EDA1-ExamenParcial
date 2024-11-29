package implementacionA;

public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        System.out.println("Referencia de 'manuel' antes de la modificación: " + manuel);
        System.out.println("Referencia de 'copia' antes de la modificación: " + copia);
        System.out.println("Referencia de 'referencia' antes de la modificación: " + referencia);
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        System.out.println("\n¿'manuel' y 'copia' son el mismo objeto?: " + (manuel == copia));
        System.out.println("¿'manuel' y 'referencia' son el mismo objeto?: " + (manuel == referencia));
        System.out.println("¿'copia' y 'referencia' son el mismo objeto?: " + (copia == referencia));
        
        System.out.println("\nContenido de la lista después de insertar:");
        lista.mostrarPersonas();
        
        Nodo actual = lista.cabeza;
        int index = 1;
        while (actual != null) {
            System.out.println("Elemento " + index + " en la lista: " + actual.persona);
            actual = actual.siguiente;
            index++;
        }

        manuel.setNombre("Manuel Antonio");
        
        System.out.println("\nDespués de modificar 'manuel' a 'Manuel Antonio':");
        System.out.println("Referencia de 'manuel' ahora: " + manuel);
        System.out.println("Referencia de 'copia' ahora: " + copia);
        System.out.println("Referencia de 'referencia' ahora: " + referencia);
        
        System.out.println("\nContenido de la lista después de modificar 'manuel' a 'Manuel Antonio':");
        lista.mostrarPersonas();
        
        actual = lista.cabeza;
        index = 1;
        while (actual != null) {
            System.out.println("Elemento " + index + " en la lista después del cambio: " + actual.persona);
            actual = actual.siguiente;
            index++;
        }
    }
}