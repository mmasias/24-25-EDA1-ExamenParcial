class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public void insertarPersona(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona, null);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.getPersona().getNombre() + ", DNI: " + actual.getPersona().getDni()
                    + ", Persona hashCode: " + actual.getPersona().hashCode() +
                    ", Nodo hashCode: " + actual.hashCode());
            actual = actual.getSiguiente();
        }
    }
}