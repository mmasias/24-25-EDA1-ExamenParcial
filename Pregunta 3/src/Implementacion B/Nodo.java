class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }
    public Object getPersona() {
        return this.persona = persona;
    }
    
    public Nodo getSiguiente() {
        return this.siguiente = siguiente;
    }
}
