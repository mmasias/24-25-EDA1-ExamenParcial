# Pregunta 3

## a)

### Usando la implementación a:

En cuanto a la implementación a, podemos decir que encontramos 5 objetos:

- **manuel**:  
  Se crea un objeto `Persona` con el nombre "Manuel" y el DNI "1234". Este es el primer objeto `Persona` en memoria.

- **copia**:  
  Se crea un nuevo objeto `Persona` a partir de `manuel`, usando el constructor de copia (`new Persona(manuel)`). Esto genera un segundo objeto `Persona`, pero con los mismos valores ("Manuel", "1234") que el primero. Este es un objeto independiente del primero.

- **referencia**:  
  Se asigna `referencia = manuel`. Esto no crea un nuevo objeto, sino que simplemente `referencia` se convierte en una referencia al mismo objeto que `manuel`. Es decir, `referencia` y `manuel` apuntan al mismo objeto.

- **Lista**:  
  Se están insertando 3 elementos en la lista:
  - El primer nodo tiene como persona a `manuel`, lo que significa que se crea un nodo que hace referencia a `manuel`.
  - El segundo nodo tiene como persona a `copia`, lo que significa que se crea un nodo que hace referencia a `copia`.
  - El tercer nodo tiene como persona a `referencia`, pero como `referencia` y `manuel` apuntan al mismo objeto, este nodo no crea un nuevo objeto `Persona`. Solo hace referencia al objeto ya creado (`manuel`).

Entonces, en total tenemos los siguientes objetos:

1. Un objeto `Persona` creado para `manuel`.
2. Un objeto `Persona` creado para `copia`.
3. Un objeto `Persona` al que apunta `referencia` (que es el mismo objeto que `manuel`).
4. Un objeto `Nodo` que contiene a `manuel`.
5. Un objeto `Nodo` que contiene a `copia`.
6. Un objeto `Nodo` que contiene a `referencia` (pero que es en realidad el mismo objeto que `manuel`).

Todo esto queda demostrado mediante el siguiente diagrama:
![Diagrama](Diagrama.png)


### Usando la implementación b:
Si nos fijamos en el código, veremos que se crean tres referencias al objeto `Persona`:

```java
Persona manuel = new Persona("Manuel", "1234");
Persona copia = new Persona(manuel);
Persona referencia = manuel;
```
Pero si nos fijamos bien y nos centramos en la memoria veremos que solo hay guardados dos, los cuales son manuel y copia ya que referencia no crea un nuevo objeto si no que simplemente apunta al mismo objeto que manuel.

Todo esto se puede comprobar usando el comando System.identityHashCode() el cual nos verifica todo esto y se puede comprobar en la clase `Principal.java` la cual se encuentra en la carpeta `Comprobacion-3-A` que al ejecutarse nos dara lo siguiente por la terminal:
Referencias en la lista:
681842940
1392838282
681842940

En conclusion `manuel` y `referencia`  son el mismo objeto en memoria ya que utilizan las misma referencia  en cambio  `Copia` es otro completamente diferente creado como una copia de manuel pero con una referencia distinta.

## b)
### Usando la implementacion a:
En la implementacion a no se veria afectado nada   ya que la nueva instancia de Persona en el nodo es una copia independiente del objeto manuel, y por lo tanto no se ve afectada por los cambios realizados en manuel después de ser insertado en la lista.
Todo esto se ve reflejado en el diagrama mostrado anteriormente.
### Usando la implementacion b:
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


