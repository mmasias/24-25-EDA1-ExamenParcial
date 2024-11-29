class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public Persona getPersona(){
        return persona;
    }
}