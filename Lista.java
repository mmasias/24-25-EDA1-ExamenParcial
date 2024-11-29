public class Lista {
    
    private class Nodo {
        Persona persona;
        Nodo siguiente;

        
        public Nodo(Persona persona) {
            this.persona = persona;
            this.siguiente = null;
        }
    }

    private Nodo cabeza; 

    
    public Lista() {
        this.cabeza = null;
    }

    
    public void insertarPersona(Persona persona) {
        Nodo nuevo = new Nodo(persona);

        if (cabeza == null) {
            
            cabeza = nuevo;
        } else {
            
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    
    public Persona obtenerPersona(int index) {
        int contador = 0;
        Nodo actual = cabeza;

        
        while (actual != null) {
            if (contador == index) {
                return actual.persona;
            }
            contador++;
            actual = actual.siguiente;
        }

        
        throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
    }
}
