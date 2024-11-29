## Ejercicio 3

## a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.
En la implementación A de la clase Nodo, se generan un total de cinco objetos de la clase Persona.

Esto sucede porque, al inicio, se crean únicamente los objetos manuel y copia. Sin embargo, al agregarlos a la lista lista, esta utiliza el constructor de la clase Nodo, que recibe como argumento una referencia al objeto de tipo Persona. Dentro de este constructor, se invoca nuevamente el constructor de Persona, lo que provoca la creación de un nuevo objeto por cada elemento insertado en la lista.
En cambio, si la clase Nodo siguiera la implementación B, solo existirían dos objetos de la clase Persona.

Esto se debe a que inicialmente se crean los mismos dos objetos: manuel y copia. Al añadirlos a la lista, esta genera nodos utilizando el constructor de la clase Nodo. Sin embargo, a diferencia de la implementación A, el constructor de la implementación B no crea nuevas instancias de la clase Persona, sino que simplemente almacena la referencia al objeto recibido como parámetro, evitando la creación de copias adicionales.

## b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?
Si hacemos esto, se verán afectados los elementos 1 y 3 de la lista. El segundo no se ve afectado.

En el primer elemento es el mismo objeto que está referenciado por manuel. Cuando modificamos el atributo nombre del objeto con setNombre, este cambio lo podremos ver automáticamente en el primer elemento porque apunta al mismo objeto en memoria.

El segundo elemento de la lista  no se ve afectado porque ha sido creado con el constructor de copia new Persona(manuel). Lo que hace este constructor es es crear un nuevo objeto en memoria con los mismos valores iniciales (nombre y dni), pero es independiente del objeto referenciado por manuel,. Es por eso que este elemento no se ve afectado.

El tercer elemento de la lista es una referencia directa al mismo objeto al que está apuntando manuel, que es a través de referencia. Al apuntar al mismo objeto, cualquier cambio que se realice en manuel se refleja automáticamente en el tercer elemento.


