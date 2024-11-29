public class CasoB {
   public static void main(String[] args) {
      Persona manuel = new Persona("Manuel", "1234");
      Persona copia = new Persona(manuel);
      Persona referencia = manuel;

      Lista lista = new Lista();
      lista.insertarPersona(manuel);
      lista.insertarPersona(copia);
      lista.insertarPersona(referencia);

      manuel.setNombre("Manuelito");
   }
}

class Persona {
   private String nombre;
   private String dni;

   public Persona(String nombre, String dni) {
      this.nombre = nombre;
      this.dni = dni;
   }

   public Persona(Persona persona) {
      this.nombre = persona.nombre;
      this.dni = persona.dni;
   }

   public void setNombre(String newName) {
      this.nombre = newName;
   }

}

class Nodo {
   private Persona persona;
   private Nodo siguiente;

   public Nodo(Persona persona, Nodo siguiente) {
      this.persona = persona;
      this.siguiente = siguiente;
   }
}

class Lista {
   private Nodo primero;

   public void insertarPersona(Persona persona) {
      Nodo nuevo = new Nodo(persona, primero);
      primero = nuevo;
   }
}
