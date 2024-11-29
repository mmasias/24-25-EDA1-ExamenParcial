## Ejercicio 3
### a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

En memoria hay 5 objetos en total, que incluyen 2 objetos `Persona` y 3 objetos `Nodo`.



### Justificación

#### 1. **Objetos `Persona`:**
- **Objeto 1 (`manuel`)**:
  - Creado con `new Persona("Manuel", "1234")`.
  - Tiene los valores:
    - `nombre = "Manuel"`
    - `dni = "1234"`
  - Es referenciado por:
    - La variable `manuel`.
    - La variable `referencia`.
    - Un nodo en la lista.

- **Objeto 2 (`copia`)**:
  - Creado con `new Persona(manuel)`.
  - Tiene los mismos valores que el objeto `manuel` pero es independiente en memoria:
    - `nombre = "Manuel"`
    - `dni = "1234"`
  - Es referenciado únicamente por:
    - La variable `copia`.
    - Un nodo en la lista.

---

#### 2. **Objetos `Nodo`:**
La clase `Lista` utiliza nodos para almacenar las referencias a los objetos `Persona`. Cada llamada a `insertarPersona` crea un nuevo nodo que contiene una referencia a un objeto `Persona`. En este caso:

- **Nodo 1**:
  - Contiene una referencia al objeto 1 (`manuel`).
- **Nodo 2**:
  - Contiene una referencia al objeto 2 (`copia`).
- **Nodo 3**:
  - Contiene otra referencia al objeto 1 (`manuel`), a través de `referencia`.

---

### Total de objetos en memoria:

- **2 objetos `Persona`:**
  - Uno referenciado por `manuel` y `referencia`.
  - Otro referenciado por `copia`.
- **3 objetos `Nodo`:**
  - Uno para cada referencia añadida a la lista.


### Representación gráfica:
```plaintext
[Objeto Persona 1] ("Manuel Antonio", "1234")
   ├── Referencia: manuel
   ├── Referencia: referencia
   └── Nodo 1 (en lista)

[Objeto Persona 2] ("Manuel", "1234")
   ├── Referencia: copia
   └── Nodo 2 (en lista)

[Nodo 3] (en lista)
   └── Referencia: Objeto Persona 1 (manuel/referencia)
``````



### b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

En el código proporcionado, tenemos tres objetos de la clase `Persona` que son insertados en una lista: `manuel`, `copia`, y `referencia`.

1. **`manuel`**: Es el objeto original creado con el nombre "Manuel" y el DNI "1234".
2. **`copia`**: Es una copia superficial del objeto `manuel`, creada con el constructor de copia. Aunque tiene los mismos valores iniciales, **es un objeto independiente**.
3. **`referencia`**: Es una referencia al objeto `manuel`, es decir, no es un objeto nuevo, sino que apunta a la misma dirección de memoria que `manuel`.

Cuando ejecutamos `manuel.setNombre("Manuel Antonio")`, **el cambio de nombre afectará tanto a `manuel` como a `referencia`**, ya que ambos apuntan al mismo objeto en memoria. Sin embargo, **el cambio no afectará a `copia`**, porque `copia` es un objeto distinto que fue creado con el constructor de copia.

### Elementos de la lista que se verán afectados:

- **`manuel`**: Su nombre se cambiará a "Manuel Antonio".
- **`referencia`**: También reflejará el cambio de nombre, porque apunta al mismo objeto en memoria que `manuel`.
- **`copia`**: No se verá afectada, ya que es una copia independiente de `manuel` y no comparte la misma referencia en memoria.

### Diagrama UML después de `manuel.setNombre("Manuel Antonio")`

El diagrama UML actualizado muestra cómo el cambio de nombre afecta a `manuel` y `referencia`, pero no a `copia`:

```plaintext
+----------------+      +------------------+
|    Persona    |      |     Persona      |
+----------------+      +------------------+
| -nombre: String|<---->| -nombre: String  |
| -dni: String   |      | -dni: String     |
+----------------+      +------------------+
| +setNombre()   |      | +setNombre()     |
| +getNombre()   |      | +getNombre()     |
+----------------+      +------------------+
       ^                     ^
       |                     |
   +------------+         +------------+
   |   manuel   |         |   copia    |
   |  (nombre = |         |  (nombre = |
   | "Manuel Antonio")    | "Manuel")  |
   +------------+         +------------+
       ^                    
       |   
   +------------+     
   | referencia |     
   |  (nombre = |    
   | "Manuel Antonio")     
   +------------+
