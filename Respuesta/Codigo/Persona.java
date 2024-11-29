import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String dni;
    
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.dni = otra.dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

class Lista {
    private List<Persona> personas;
    
    public Lista() {
        personas = new ArrayList<>();
    }
    
    public void insertar(Persona persona) {
        personas.add(persona);
    }
    
    public void mostrar() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Persona manuel = new Persona("Manuel", "12345678");
        Persona otraPersona = new Persona(manuel);
        
        lista.insertar(manuel);
        lista.insertar(otraPersona);
        
        System.out.println("Antes de cambiar el nombre:");
        lista.mostrar();
        
        manuel.setNombre("Manuel Antonio");
        
        System.out.println("\nDespués de cambiar el nombre:");
        lista.mostrar();
    }
}