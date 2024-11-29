package src;

public class Main {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel); 
        Persona referencia = manuel; 

        System.out.println("Objetos antes de insertar en la lista:");
        System.out.println("manuel: " + manuel + " - Hash: " + System.identityHashCode(manuel));
        System.out.println("copia: " + copia + " - Hash: " + System.identityHashCode(copia));
        System.out.println("referencia: " + referencia + " - Hash: " + System.identityHashCode(referencia));
        System.out.println();

        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        System.out.println("Objetos en la lista:");
        lista.imprimirLista(); 
    }
}