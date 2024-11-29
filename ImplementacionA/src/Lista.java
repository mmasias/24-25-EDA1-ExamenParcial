package src;

class Lista {
    private Nodo cabeza; 

    public Lista() {
        cabeza = null;
    }

    public void insertarPersona(Persona persona) {
        cabeza = new Nodo(persona, cabeza);
    }

    public void imprimirLista() {
        Nodo nodo = cabeza;
        while (nodo != null) {
            System.out.println(nodo.getPersona() + " - Hash: " + System.identityHashCode(nodo.getPersona()));
            nodo = nodo.getSiguiente(); 
        }
    }
}