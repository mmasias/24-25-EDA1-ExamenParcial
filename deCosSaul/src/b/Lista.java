package b;
class Lista {
    private Nodo primero;
    
    public void insertarPersona(Persona persona) {
        Nodo nuevo = new Nodo(persona, primero);
        primero = nuevo;
    }
    
    public boolean contiene(Persona persona) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(persona.getDni())) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    
    public Persona obtenerPersona(String dni) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(dni)) {
                return actual.getPersona();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    public void mostrar(){
        Nodo iterator = this.primero;
            do{
                System.out.print(iterator + " ");
                iterator.mostrar();
                iterator = iterator.getSiguiente();
            }while (iterator != null);
    }
}