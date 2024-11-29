package Implementacion_a;
public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        System.out.println();
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
    }
}