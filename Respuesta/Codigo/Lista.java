import java.util.ArrayList;
import java.util.List;

public class Lista {
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