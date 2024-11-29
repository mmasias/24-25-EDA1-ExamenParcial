package src;

public class Lista {
    private Persona[] personas;
    private int contador;

    public Lista() {
        personas = new Persona[10]; 
        contador = 0;               
    }

    public void insertarPersona(Persona p) {
        if (contador < personas.length) {
            personas[contador] = p;
            contador++;
        } else {
            System.out.println("La lista está llena. No se pueden añadir más personas.");
        }
    }
    
    public void mostrarListaConHashes() {
        for (int i = 0; i < contador; i++) {
            System.out.println(personas[i] + " - Hash: " + System.identityHashCode(personas[i]));
        }
    }
}

