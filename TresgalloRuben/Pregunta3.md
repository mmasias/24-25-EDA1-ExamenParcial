## a) ¿Cuántos objetos Persona diferentes hay en memoria? Justificación
La cantidad de objetos en memoria depende de la implementación de la clase Nodo.

Con la Implementación A:

Se crean dos objetos Persona directamente en el código:
manuel (creado con new Persona("Manuel", "1234")).
copia (creado con new Persona(manuel)).
La lista enlazada crea un nodo para cada objeto insertado (manuel, copia, referencia).
Cada vez que se inserta un objeto en la lista, el constructor del nodo (Implementación A) crea una nueva copia de Persona. Esto sucede tres veces (uno para cada llamada a insertarPersona).

Total:

2 objetos iniciales (manuel y copia).
3 copias creadas en los nodos (por el constructor de la clase Nodo).
Total: 5 objetos Persona diferentes en memoria.
Con la Implementación B:

Se crean los mismos dos objetos iniciales (manuel y copia).
En este caso, el constructor de Nodo simplemente almacena referencias a los objetos pasados, sin crear nuevas copias.
La referencia manuel se agrega directamente a la lista y, aunque aparece tres veces (como manuel, copia y referencia), todos apuntan a los mismos dos objetos existentes.

Total:

2 objetos iniciales (manuel y copia).
No se crean copias adicionales.
Total: 2 objetos Persona diferentes en memoria.

## b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?
Con la Implementación A:

Como cada nodo crea una copia independiente de Persona al llamar al constructor de la clase Nodo, los cambios realizados al objeto manuel no afectan a las copias que se crearon dentro de los nodos.
En la lista, únicamente el objeto original manuel (si fue almacenado directamente) se verá afectado. Las copias (copia y las creadas por los nodos) conservarán el nombre original.
Afectados: Solo el objeto manuel fuera de los nodos, si está accesible.

Con la Implementación B:

En este caso, los nodos de la lista almacenan referencias al objeto manuel directamente. Si se modifica el nombre de manuel, todos los nodos que contienen una referencia a este objeto reflejarán el cambio.
Esto incluye cualquier nodo que almacene manuel como referencia directa (como referencia) o compartida en otros nodos.
Afectados: Todos los nodos que contienen una referencia a manuel (incluyendo referencia).