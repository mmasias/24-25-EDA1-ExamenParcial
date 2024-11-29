package implementacionB;
public class Nodo {
    public Persona persona;
    public Nodo siguiente;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.siguiente = null;
    }
}