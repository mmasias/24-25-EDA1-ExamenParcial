package Pregunta3CeliaBecerril.ImplementacionA;
public class Main {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona referencia = manuel;
        Persona copia = new Persona(manuel);
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
        lista.mostrar();
        System.out.println("=".repeat(20));
        
        manuel.setNombre("Manuel Antonio");
        lista.mostrar();
    }
}