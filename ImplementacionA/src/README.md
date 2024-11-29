## Implementación A

**Cuando se crea el objeto manuel:**

Persona manuel = new Persona("Manuel", "1234");
Se crea un nuevo objeto Persona en memoria con los datos "Manuel" y "1234". Este es el primer objeto Persona en memoria.


Cuando se crea el objeto copia:
Persona copia = new Persona(manuel);
Aquí, copia es un objeto creado a partir del constructor de copia, que crea un nuevo objeto Persona independiente con los mismos valores de manuel. Este es el segundo objeto Persona en memoria.


**Cuando se crea la referencia referencia:**

Persona referencia = manuel;
referencia simplemente apunta al mismo objeto que manuel. No se crea un nuevo objeto en memoria, por lo que no se cuenta un nuevo objeto.
Ahora, al insertar los objetos en la lista:

La lista está implementada usando nodos donde cada nodo contiene una referencia a un objeto Persona y a otro nodo siguiente.

Supongamos que tienes una clase Lista que almacena objetos Nodo y que cada Nodo guarda una copia de la Persona. El constructor del Nodo hace una copia profunda de Persona, lo cual significa que cada vez que se inserta una Persona, se crea un nuevo objeto Persona.

Lista lista = new Lista();
lista.insertarPersona(manuel);
lista.insertarPersona(copia);
lista.insertarPersona(referencia);
Ahora, veamos cómo se inserta cada uno de los objetos en la lista:

Cuando se inserta manuel, el constructor de Nodo crea un nuevo objeto Persona en memoria con los mismos datos que manuel. Es decir, un nuevo objeto Persona se crea.


Cuando se inserta copia, el constructor de Nodo crea otro nuevo objeto Persona en memoria con los mismos datos que copia. Esto genera un tercer objeto Persona.


Cuando se inserta referencia, aunque referencia apunta a manuel, el constructor de Nodo crea un nuevo objeto Persona basado en los datos de referencia (que son los mismos que manuel). Este es un cuarto objeto Persona.

Los nodos en la lista:

Cada inserción en la lista genera un nuevo nodo, y cada nodo contiene un nuevo objeto Persona. Además, la lista tendrá la siguiente estructura de nodos (simplificada):

Nodo 1: Contiene el objeto Persona basado en manuel (nuevo objeto creado para el nodo).

Nodo 2: Contiene el objeto Persona basado en copia (nuevo objeto creado para el nodo).

Nodo 3: Contiene el objeto Persona basado en referencia (nuevo objeto creado para el nodo, aunque los datos sean iguales a los de manuel).

Resumen de los objetos en memoria:


- Primer objeto Persona: Creado para manuel en el primer paso.
- Segundo objeto Persona: Creado para copia en el segundo paso.
- Tercer objeto Persona: Creado para el primer nodo (que almacena la Persona referenciada por manuel).
- Cuarto objeto Persona: Creado para el segundo nodo (que almacena la Persona referenciada por copia).
- Quinto objeto Persona: Creado para el tercer nodo (que almacena la Persona referenciada por referencia).