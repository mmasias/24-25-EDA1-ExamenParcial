class NodoA {
    private Persona persona;
    private NodoA siguiente;

    public NodoA(Persona persona, NodoA siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public NodoA getSiguiente() {
        return this.siguiente;
    }
}