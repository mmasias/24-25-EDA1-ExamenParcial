package osorioMario.src;

import java.util.ArrayList;

class Persona {
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.dni = persona.dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Lista {
    private ArrayList<Persona> personas = new ArrayList<>();
    
    public void insertarPersona(Persona persona) {
        personas.add(persona);
    }
    
    public void mostrarLista() {
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
        }
    }
}

class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;

        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        manuel.setNombre("Manuel Antonio");

        lista.mostrarLista();
    }
}
