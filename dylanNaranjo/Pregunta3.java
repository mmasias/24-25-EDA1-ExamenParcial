package dylanNaranjo;

public class Pregunta3 {

    public static class Persona {

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

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Persona{nombre='" + nombre + "', dni='" + dni + "'}";
        }
    }

    public static class Lista {

        private Persona[] personas;
        private int contador;
        private static final int Inicial = 5;

        public Lista() {
            personas = new Persona[Inicial];
            contador = 0;
        }

        public void insertarPersona(Persona persona) {
            if (contador == personas.length) {
                ampliarCapacidad();
            }
            personas[contador++] = persona;
        }

        private void ampliarCapacidad() {
            Persona[] nuevaLista = new Persona[personas.length * 2];
            System.arraycopy(personas, 0, nuevaLista, 0, personas.length);
            personas = nuevaLista;
        }

        public void mostrarLista() {
            for (int i = 0; i < contador; i++) {
                System.out.println(personas[i]);
            }
        }
    }

    public static class Principal {

        public static void main(String[] args) {
            Persona manuel = new Persona("Manuel", "1234");
            Persona copia = new Persona(manuel);
            Persona referencia = manuel;

            Lista lista = new Lista();
            lista.insertarPersona(manuel);
            lista.insertarPersona(copia);
            lista.insertarPersona(referencia);

            System.out.println("Lista original:");
            lista.mostrarLista();

            manuel.setNombre("Manuel Antonio");

            System.out.println("\nLista después de modificar manuel:");
            lista.mostrarLista();
        }
    }
}
