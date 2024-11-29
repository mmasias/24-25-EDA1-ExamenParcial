public class Lista {
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }
   
    public void insertarPersona(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrarPersonas() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.persona);
            actual = actual.siguiente;
        }
    }
}