class NodoA {
    private Persona persona;
    private NodoA siguiente;

    public NodoA(Persona persona, NodoA siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoA getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoA siguiente) {
        this.siguiente = siguiente;
    }


}