public class Lista {
    public Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public void insertarPersona(Persona persona) {
        Nodo nuevo = new Nodo(persona, primero);
        primero = nuevo;
    }

    public Nodo getCabeza() {
        return primero;
    }
}
