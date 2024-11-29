class Nodo {
    public Persona persona;
    public Nodo siguiente;

    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }
}

class Lista {
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

class Persona {
    public String nombre;
    public String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.dni = persona.dni;
    }
}

public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;

        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        System.out.println("\nReferencias en la lista:");
        Nodo actual = lista.getCabeza();
        while (actual != null) {
            System.out.println(System.identityHashCode(actual.persona));
            actual = actual.siguiente;
        }
    }
}

