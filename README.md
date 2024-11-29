# 24-25-EDA1-ExamenParcial

## Pregunta 1: análisis de implementaciones

Observe los siguientes fragmentos de código que implementan un nodo para una lista enlazada:

**Implementación A**

```java
import Respuesta.Persona;

class Nodo {
    private Persona persona;
    private Respuesta.Nodo siguiente;

    public Respuesta.Nodo(Persona persona, Respuesta.Nodo siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }
}
```

**Implementación B**

```java
import Respuesta.Persona;

class Nodo {
    private Persona persona;
    private Respuesta.Nodo siguiente;

    public Respuesta.Nodo(Persona persona, Respuesta.Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }
}
```

||
|-
a) ¿Qué implementación considera que utiliza mejor los recursos de memoria? Justifique su respuesta.
b) ¿Qué problemas o ventajas podría causar cada implementación? Proporcione ejemplos.
c) ¿Cómo afectaría cada implementación al comportamiento de una lista que use estos nodos?

## Pregunta 2: gestión de referencias

Considere este código:

```java
import Respuesta.Nodo;
import Respuesta.Persona;

class Lista {
    private Nodo primero;

    public void insertarPersona(Persona persona) {
        Nodo nuevo = new Nodo(persona, primero);
        primero = nuevo;
    }

    public boolean contiene(Persona persona) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(persona.getDni())) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public Persona obtenerPersona(String dni) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(dni)) {
                return actual.getPersona();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
}
```

a) Si tenemos:

```java
Respuesta.Lista lista = new Respuesta.Lista();
Respuesta.Persona juan = new Respuesta.Persona("Juan", "1234");
lista.insertarPersona(juan);
Respuesta.Persona personaEncontrada = lista.obtenerPersona("1234");
personaEncontrada.setNombre("Juan Manuel");
```
¿Qué nombre tendrá la persona almacenada en la lista? ¿Por qué?

b) ¿Qué sucedería si modificamos:

```java
juan.setNombre("Juan Carlos");
```

después de insertarlo en la lista? ¿Depende de la implementación del Respuesta.Nodo que usemos (A o B de la pregunta anterior)?

## Pregunta 3: referencias y constructores

Analice este código:

```java
import Respuesta.Lista;

public class Persona {
    private String nombre;
    private String dni;

    public Respuesta.Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Respuesta.Persona(Respuesta.Persona persona) {
        this.nombre = persona.nombre;
        this.dni = persona.dni;
    }
}

public class Respuesta.Principal {
    public static void main(String[] args) {
        Respuesta.Persona manuel = new Respuesta.Persona("Manuel", "1234");
        Respuesta.Persona copia = new Respuesta.Persona(manuel);
        Respuesta.Persona referencia = manuel;

        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
    }
}
```

||
|-
a) ¿Cuántos objetos Respuesta.Persona diferentes hay en memoria? Justifique su respuesta.
b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

## Pregunta 4: diseño y optimización

Proponga una implementación de una Respuesta.Lista que:

- Permita detectar si se está intentando insertar una referencia a una Respuesta.Persona que ya existe en la lista
- Permita elegir si queremos insertar una copia de la Respuesta.Persona o mantener la referencia
- Sea eficiente en el uso de memoria

Explique su diseño y justifique las decisiones tomadas.

## Pregunta 5: análisis de código

Dado este fragmento:

```java
import Respuesta.Lista;
import Respuesta.Persona;

public class GestorPersonas {
    private Lista lista;

    public void agregarPersona(Persona persona) {
        if (!lista.contiene(persona)) {
            lista.insertarPersona(persona);
        }
    }

    public Persona buscarPersona(String dni) {
        return lista.obtenerPersona(dni);
    }
}
```

||
|-
a) ¿Qué problemas potenciales ve en este código respecto al manejo de referencias?
b) ¿Cómo lo mejoraría para evitar modificaciones no deseadas de los objetos?
c) Proponga una solución que proteja la integridad de los datos.
