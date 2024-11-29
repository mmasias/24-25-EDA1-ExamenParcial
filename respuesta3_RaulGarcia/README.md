# Pregunta 3

# Implementaciones

## Nodo a:
```java
public class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public Persona getPersona(){
        return persona;
    }
}
```

## Nodo b:
```java
public class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    } 

    public Nodo getSiguiente(){
        return siguiente;
    }

    public Persona getPersona(){
        return persona;
    }
}
```

## a)
#### Implementación a
Si la clase Nodo corresponde a la implementación A, se generan cinco instancias de la clase Persona.
Esto ocurre porque inicialmente se crean dos objetos: manuel y copia. Sin embargo, al agregar estos objetos a la lista lista, esta invoca al constructor de Nodo y le pasa como argumento la referencia del objeto de tipo Persona. Dentro del constructor de Nodo, se llama nuevamente al constructor de Persona, lo que da como resultado la creación de un nuevo objeto.

#### Implementación
Si, en cambio, la clase Nodo correspondiera a la implementación B, habría únicamente dos instancias de la clase Persona.
Esto se debe a que inicialmente se crean los mismos dos objetos, manuel y copia. Al agregarlos a la lista, esta instancia un objeto de la clase Nodo mediante su constructor. No obstante, a diferencia de la implementación A, el constructor de la implementación B de Nodo simplemente almacena la referencia al objeto que se le pasa como parámetro, sin crear un nuevo objeto de la clase Persona.

## b)
