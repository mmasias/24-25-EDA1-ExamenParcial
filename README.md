
---
# IMPORTANTE
Dentro de [documentos](./documentos/) encontrará la respuesta de la pregunta 3 la cual se nos comentó de realizar nuevamente.

---

# 24-25-EDA1-ExamenParcial - Respuestas propuestas durante el examen

## Pregunta 1: análisis de implementaciones

Observe los siguientes fragmentos de código que implementan un nodo para una lista enlazada:

**Implementación A**

```java
class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }
}
```

**Implementación B**

```java
class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }
}
```

| a) ¿Qué implementación considera que utiliza mejor los recursos de memoria? Justifique su respuesta. |
| - |
- La implementación B es más eficiente en cuanto el uso de la memoria debido a que en la implementación A, se crea un nuevo objeto *Persona* al momento de la construcción del mismo, mientras que en la implementación B se mantiene apuntando al mismo al que se hace referencia como atributo.

| b) ¿Qué problemas o ventajas podría causar cada implementación? Proporcione ejemplos. |
| - |
- **Implementación A**
    - *Ventajas*: Se evita que se modifique el objeto *Persona* original.
    - *Problemas*: Al querer apuntar a la misma *Persona*, lo que pasa es que se crea un nuevo objeto y son dos personas completamente distintas, a pesar de que se quiera apuntar a la misma.
- **Implementación B**
    - *Venatjas*: Se mantiene la referencia al objeto *Persona* original.
    - *Problemas*: Si se modifica el objeto *Persona* original, se modificará también el objeto *Persona* al que se hace referencia.

| c) ¿Cómo afectaría cada implementación al comportamiento de una lista que use estos nodos? |
| - |
- **Implementación A**
    - Al insertar un nuevo nodo, se creará un nuevo objeto *Persona* y se apuntará a este nuevo objeto, por lo que si se modifica el objeto *Persona* original, no se verá reflejado en el objeto *Persona* al que se hace referencia.
- **Implementación B**
    - Al insertar un nuevo nodo, se apuntará al objeto *Persona* original, por lo que si se modifica el objeto *Persona* original, se verá reflejado en el objeto *Persona* al que se hace referencia.


## Pregunta 2: gestión de referencias

Considere este código:

```java
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
Lista lista = new Lista();
Persona juan = new Persona("Juan", "1234");
lista.insertarPersona(juan);
Persona personaEncontrada = lista.obtenerPersona("1234");
personaEncontrada.setNombre("Juan Manuel");
```
¿Qué nombre tendrá la persona almacenada en la lista? ¿Por qué?

- Tendrá el nombre "Juan Manuel" debido a que se está modificando el objeto *Persona* al que se hace referencia.

b) ¿Qué sucedería si modificamos:

```java
juan.setNombre("Juan Carlos");
```

después de insertarlo en la lista? ¿Depende de la implementación del Nodo que usemos (A o B de la pregunta anterior)?

- Si se modifica el objeto *Persona* original, se modificará también el objeto *Persona* al que se hace referencia, por lo que si se modifica el nombre de *juan*, el nombre de la persona almacenada en la lista también cambiará. Este es el caso de la implementación B de la pregunta anterior.

- En dado caso de que hubiera alguna implementación como la A de la anterior pregunta, se crearía un nuevo objeto *Persona* al momento de la inserción, por lo que si se modifica el objeto *Persona* original, no se verá reflejado en el objeto *Persona* al que se hace referencia.


## Pregunta 3: referencias y constructores

Analice este código:

```java
public class Persona {
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
}

public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
    }
}
```

|a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.|
|-|
- Hay 2 objetos *Persona* diferentes en memoria, uno es *manuel* y el otro es *copia*. *referencia* no es un objeto *Persona* diferente, sino que es una referencia al objeto *manuel*.

|b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?|
|-|
- Se verán afectados los elementos tanto *manuel* como *referencia* debido a que ambos apuntan al mismo objeto *Persona*, por lo que ahora ambos tendrán el nombre "Manuel Antonio".

## Pregunta 4: diseño y optimización

Proponga una implementación de una Lista que:

- Permita detectar si se está intentando insertar una referencia a una Persona que ya existe en la lista
```java
class Lista {
    private Nodo primero;
    
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
}
```
- Permita elegir si queremos insertar una copia de la Persona o mantener la referencia
- Sea eficiente en el uso de memoria
```java
class Lista {
    private Nodo primero;
    
    public void insertarPersona(Persona persona) {
        this.persona = persona;
        Nodo nuevo = new Nodo(persona, primero);
        primero = nuevo;
    }
}
```

Explique su diseño y justifique las decisiones tomadas.

- Aunque no terminé esta pregunta, quise basarme en la implementación dada en el mismo archivo del examen. Simplemente faltan las validaciones que explican a detalle el uso de memoria y la elección de insertar una copia o mantener la referencia.

## Pregunta 5: análisis de código

Dado este fragmento:

```java
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

|a) ¿Qué problemas potenciales ve en este código respecto al manejo de referencias?|
|-|
- La función `agregarPersona` no verifica si la *Persona* que se está intentando insertar es la misma que ya está en la lista, por lo que se podría insertar una referencia a la misma *Persona*.
- La función `buscarPersona` devuelve una referencia a la *Persona* almacenada en la lista, por lo que se podría modificar la *Persona* almacenada en la lista sin querer.

|b) ¿Cómo lo mejoraría para evitar modificaciones no deseadas de los objetos?|
|-|
- Para evitar que se inserte una referencia a la misma *Persona*, se podría modificar la función `agregarPersona` para que verifique si la *Persona* que se está intentando insertar es la misma que ya está en la lista.
- Para evitar modificaciones no deseadas de los objetos, se podría devolver una copia de la *Persona* almacenada en la lista en la función `buscarPersona`.

|c) Proponga una solución que proteja la integridad de los datos.|
|-|
- En dado caso, podría crearse una función `modificarPersona` que reciba el DNI de la *Persona* a modificar y la *Persona* con los nuevos datos, para así evitar los problemas del inciso a).