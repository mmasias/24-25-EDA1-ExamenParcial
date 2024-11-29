public class Principal {
    public static void main(String[] args) {
        
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;

       
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        
        manuel.setNombre("Manuel Antonio");

        
        System.out.println("Elemento 1: " + lista.obtenerPersona(0).getNombre()); 
        System.out.println("Elemento 2: " + lista.obtenerPersona(1).getNombre()); 
        System.out.println("Elemento 3: " + lista.obtenerPersona(2).getNombre()); 
    }
}
