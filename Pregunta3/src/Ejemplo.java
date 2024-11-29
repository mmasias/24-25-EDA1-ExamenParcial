package Pregunta3.src;

public class Ejemplo {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
    
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
    

        System.out.println("Antes de cambiar el nombre:");
        System.out.println("manuel: " + manuel.getNombre());
        System.out.println("copia: " + copia.getNombre());
        System.out.println("referencia: " + referencia.getNombre());
    

        manuel.setNombre("Manuel Antonio");
    

        System.out.println("Después de cambiar el nombre:");
        System.out.println("manuel: " + manuel.getNombre());
        System.out.println("copia: " + copia.getNombre());
        System.out.println("referencia: " + referencia.getNombre());
    }
    
}
