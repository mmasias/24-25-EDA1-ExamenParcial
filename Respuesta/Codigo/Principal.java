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