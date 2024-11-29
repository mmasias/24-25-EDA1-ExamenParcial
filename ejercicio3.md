## Ejercicio 3

## a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.
En la implementación A de la clase Nodo, se generan un total de cinco objetos de la clase Persona.

Esto sucede porque, al inicio, se crean únicamente los objetos manuel y copia. Sin embargo, al agregarlos a la lista lista, esta utiliza el constructor de la clase Nodo, que recibe como argumento una referencia al objeto de tipo Persona. Dentro de este constructor, se invoca nuevamente el constructor de Persona, lo que provoca la creación de un nuevo objeto por cada elemento insertado en la lista.
En cambio, si la clase Nodo siguiera la implementación B, solo existirían dos objetos de la clase Persona.

Esto se debe a que inicialmente se crean los mismos dos objetos: manuel y copia. Al añadirlos a la lista, esta genera nodos utilizando el constructor de la clase Nodo. Sin embargo, a diferencia de la implementación A, el constructor de la implementación B no crea nuevas instancias de la clase Persona, sino que simplemente almacena la referencia al objeto recibido como parámetro, evitando la creación de copias adicionales.

## b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?
Si la clase Nodo sigue la implementación A, cualquier cambio realizado posteriormente en 'manuel' no tendrá impacto en los elementos de la lista. Esto se debe a que, al insertar 'manuel' en la lista, el Nodo genera una nueva instancia de la clase Persona, copiando los valores de 'manuel'. Dicha copia es completamente independiente del objeto original, por lo que las modificaciones posteriores a manuel no alterarán la copia almacenada en la lista. 
Sin embargo, cualquier cambio aplicado directamente al objeto original 'manuel' seguirá afectándolo, ya que dicho objeto conserva su propia identidad y no está vinculado a las copias creadas por los nodos.

Por otro lado, si la clase Nodo estuviera basada en la implementación B, tanto el objeto original manuel como los elementos manuel y referencia en la lista se verían afectados. Esto ocurre porque, aunque copia se haya generado como una nueva instancia independiente basada en manuel, referencia no es un objeto autónomo, sino simplemente un puntero que señala al mismo objeto manuel. Por lo tanto, cualquier cambio realizado sobre manuel se reflejará automáticamente en referencia.