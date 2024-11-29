# Pregunta 3
## a)
Si nos fijamos en el codigo nosotros veremos que podemos encontrar que se crean tres referencias al objeto Persona:
Persona manuel = new Persona("Manuel", "1234");
Persona copia = new Persona(manuel);
Persona referencia = manuel;

Pero si nos fijamos bien y nos centramos en la memoria veremos que solo hay guardados dos, los cuales son manuel y copia ya que referencia no crea un nuevo objeto si no que simplemente apunta al mismo objeto que manuel.
Todo esto se puede comprobar usando el comando System.identityHashCode() el cual nos verifica todo esto y se puede ver en la clase Principal.java la cual se encuentra en la carpeta Comprobacion-3-A la cual al ejecutarse nos dara lo siguiente por la terminal:
Referencias en la lista:
681842940
1392838282
681842940
En conclusion manuel y referencia son el mismo objeto en memoria ya que utilizan las misma referencia  en cambio  Copia es otro completamente diferente creado como una copia de manuel pero con una referencia distinta.

## b)
Si nos vamos a la teoria el comando manuel.setNombre("Manuel Antonio"); diriamos que el set hace referencia al objeto manuel por lo que se cambiaria el atributo nombre de este objeto. Ahora bien como hemos dicho en el apartado a, referencia y manuel aounta al mismo objeto por lo que el cambio afectaria a los dos. En cambio copia es independiente a manuelo por lo que al ser un objeto distinto este no se veria afectado. 
En conclusion el primer y el ultimo elemento de la lista se verian afectados por este comando pero el segundo elemento no se ve afectado ya que copia es un objeto difernete;
### Antes de modificar:

| Posición | Objeto Referenciado | nombre   | dni  |
|----------|----------------------|----------|------|
| 1        | manuel               | "Manuel" | 1234 |
| 2        | copia                | "Manuel" | 1234 |
| 3        | referencia           | "Manuel" | 1234 |

### Después de modificar `manuel.setNombre("Manuel Antonio")`:

| Posición | Objeto Referenciado | nombre           | dni  |
|----------|----------------------|------------------|------|
| 1        | manuel               | "Manuel Antonio" | 1234 |
| 2        | copia                | "Manuel"         | 1234 |
| 3        | referencia           | "Manuel Antonio" | 1234 |


