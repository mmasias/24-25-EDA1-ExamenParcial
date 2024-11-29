public class Lista {
    private Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public void insertarPersona(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);

        if (primero == null) { 
            primero = nuevoNodo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) { 
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo); 
        }
    }

    public void mostrarLista() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.println(actual.getPersona());
            actual = actual.getSiguiente();
        }
    }
}
