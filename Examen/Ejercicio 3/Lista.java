
public class Lista {

    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    private class Nodo {
        Persona persona;
        Nodo siguiente;

        public Nodo(Persona persona) {
            this.persona = persona;
            this.siguiente = null;
        }
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
            System.out.println("Nombre: " + actual.persona.getNombre() + ", DNI: " + actual.persona.getDni());
            actual = actual.siguiente;
        }
    }
}
