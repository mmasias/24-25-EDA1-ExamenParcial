package implementacionA;

class Nodo {
    public Persona persona;
    public Nodo siguiente;
    
    public Nodo(Persona persona) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = null;
    }
}