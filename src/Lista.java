class Lista {
    private NodoA primero;

    public void insertarPersona(Persona persona) {
        NodoA nuevo = new NodoA(persona, primero);
        primero = nuevo;
    }

    public boolean contiene(Persona persona) {
        NodoA actual = primero;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(persona.getDni())) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public Persona obtenerPersona(String dni) {
        NodoA actual = primero;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(dni)) {
                return actual.getPersona();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
}
