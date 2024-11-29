# Pregunta 3

##  Pregunta a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

### Codigo de creacion de personas

java
Persona manuel = new Persona("Manuel", "1234");
Persona copia = new Persona(manuel);
Persona referencia = manuel;


En este fragmento de código, hay *2 objetos Persona diferentes en memoria*:

1. *manuel*: El primer objeto Persona creado con los datos "Manuel" y "1234"
2. *copia*: Un segundo objeto Persona creado como una copia de manuel, con los mismos valores de nombre y DNI

La variable referencia no crea un nuevo objeto, sino que simplemente apunta al mismo objeto que *manuel*. Es decir, *referencia* y *manuel* son dos referencias que apuntan a la misma instancia en memoria.

## Justificación detallada

- new Persona("Manuel", "1234") crea el primer objeto
- new Persona(manuel) crea un segundo objeto independiente
- referencia = manuel asigna una nueva referencia al primer objeto, sin crear un objeto adicional

Por lo tanto, en memoria habrá exactamente *2 objetos Persona diferentes*.

Si se insertaran estos objetos en una lista, se insertarían dos objetos distintos (el original y la copia), a pesar de tener los mismos valores.

## Corrección sobre setNombre()

Un momento, hay un error en su suposición. En el código original que me mostró, no existe un método setNombre() en la clase Persona. La clase solo tiene constructores y los atributos son privados sin métodos setter.

Si quisiéramos modificar el nombre, primero tendríamos que agregar un método setter a la clase Persona. Un ejemplo sería:

java
public void setNombre(String nombre) {
    this.nombre = nombre;
}

## Pregunta b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

Analizando como funcionan las referencias, al modificar manuel, se verían afectados:
- El propio objeto manuel
- La variable referencia (porque apunta al mismo objeto)

La variable copia NO se vería afectada, porque es un objeto independiente creado mediante el constructor de copia.

La razón es que *referencia* es una referencia directa al mismo objeto *manuel* en memoria, no una copia. Por lo tanto, cualquier modificación realizada a través de *manuel* se reflejará también en *referencia*.

