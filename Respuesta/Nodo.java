package Respuesta;/*
class Respuesta.Nodo {
    private Respuesta.Persona persona;
    private Respuesta.Nodo siguiente;

    public Respuesta.Nodo(Respuesta.Persona persona, Respuesta.Nodo siguiente) {
        this.persona = new Respuesta.Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }
    public Respuesta.Persona getPersona(){
        return persona;
    }

    public Respuesta.Nodo getSiguiente(){
        return siguiente;
    }
}*/

class Nodo {
    private Persona persona;
    private Nodo siguiente;

    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }

    public Persona getPersona(){
        return persona;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }
}