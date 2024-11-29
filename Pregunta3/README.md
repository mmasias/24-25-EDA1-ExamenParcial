# PREGUNTA 3

### a.

En la implementación A de la clase Nodo, se crean cinco instancias de la clase Persona. Esto sucede porque primero se generan dos objetos, manuel y copia. 
Luego, al agregar estos objetos a la lista, se utiliza el constructor de la clase Nodo, que toma como argumento una referencia al objeto Persona. Dentro del constructor de Nodo, se llama nuevamente al constructor de Persona, lo que resulta en la creación de un nuevo objeto cada vez.


En cambio, si la clase Nodo pertenece a la implementación B, solo habrá dos instancias de la clase Persona. Esto se debe a que, al principio, se crean los mismos objetos, manuel y copia. Al añadirlos a la lista, esta instancia un objeto de la clase Nodo utilizando su constructor. Sin embargo, a diferencia de la implementación A, el constructor de la implementación B de Nodo simplemente guarda la referencia al objeto que recibe como parámetro, en lugar de crear una nueva instancia de la clase Persona.

### b.

Si la clase Nodo corresponde a la implementación A, ningún elemento de la lista se verá afectado si realizas cambios en manuel. Esto sucede porque, al insertar manuel en la lista, el nodo genera una nueva instancia de la clase Persona con los mismos valores que el objeto original. Esta nueva instancia es completamente independiente, por lo que cualquier modificación hecha en manuel no influye en los objetos de la lista. Sin embargo, el objeto original manuel sí mostrará los cambios realizados.

Por otro lado, si la clase Nodo pertenece a la implementación B, tanto el objeto original manuel como los elementos manuel y referencia en la lista se verán afectados. Esto ocurre porque, aunque se creó una copia inicialmente a partir de manuel como un objeto separado, referencia no es una instancia propia, sino un puntero que apunta directamente al objeto manuel. Por lo tanto, cualquier cambio en manuel impactará en las referencias a este objeto dentro de la lista.