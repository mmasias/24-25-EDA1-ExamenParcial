class Lista {
    private Persona[] personas;
    private int indice;

    public Lista() {
        personas = new Persona[10];
        indice = 0;
    }

    public void insertarPersona(Persona persona) {
        if (indice < personas.length) {
            personas[indice] = persona;
            indice++;
        } else {
            System.out.println("Lista llena.");
        }
    }

    public void imprimirNombres() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Nombre en la lista: " + personas[i].getNombre());
        }
    }
}
