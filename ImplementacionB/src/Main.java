package ImplementacionB.src;
public class Main {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
        
        System.out.println("Antes de modificar:");
        lista.mostrarListaConHashes();
        
        manuel.setNombre("Manuel Antonio");
        
        System.out.println("\nDespués de modificar:");
        lista.mostrarListaConHashes();
    }
}

