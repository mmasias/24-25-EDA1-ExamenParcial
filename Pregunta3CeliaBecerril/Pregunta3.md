# Pregunta 3: Referencias y Constructores


## a) ¿Cuántos objetos `Persona` diferentes hay en memoria? Justifique su respuesta.

**Implementación A**  
Hay 5 objetos `Persona` en memoria. Esto se debe a que inicialmente se crean dos objetos: `manuel` y `copia`. Sin embargo, cuando estos objetos se agregan a la lista `lista`, esta lista llama al constructor de `Nodo` pasándole como parámetro la referencia del objeto de tipo `Persona`. Al llegar al constructor de este `Nodo`, este vuelve a llamar al constructor de `Persona`, creando así un nuevo objeto.

**Implementación B**  
Hay **2 objetos `Persona` diferentes** en memoria: 

1. `manuel`, que se crea utilizando el constructor `Persona(String nombre, String dni)`.
2. `copia`, que se crea utilizando el constructor `Persona(Persona persona)` copiando los valores de `manuel`.

Si `referencia` fuera un nuevo objeto creado con `new Persona(manuel)`, entonces habría **3 objetos `Persona** en memoria.

En Java, al crear un objeto con el operador `new`, se asigna un espacio en memoria para ese objeto. En este caso:
- `manuel` y `referencia` apuntan al mismo objeto en memoria.
- `copia` apunta a un objeto distinto, creado con el constructor de copia.

Por lo tanto, la variable `referencia` no incrementa el número de objetos, ya que simplemente señala al mismo objeto que `manuel`.

---

## b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?


**Implementación A**  
Ningún elemento de la lista se verá afectado por este cambio en `manuel`, ya que cuando se inserta `manuel` en la lista, el nodo crea una nueva instancia de `Persona` con los mismos valores que `manuel`. Esa nueva instancia es independiente de la original, por lo que no importa si modificas el objeto después. Sin embargo, el objeto original `manuel` sí se verá afectado.

**Implementación B**  
Además del propio objeto original `manuel`, los elementos `manuel` y `referencia` de la lista se verán alterados. Aunque `copia` haya sido creada a partir de `manuel`, es un objeto independiente, mientras que `referencia` no es un objeto en sí, sino una referencia que apunta a `manuel`.

Por lo tanto:
- `manuel` se verá afectado porque es el objeto que se está modificando.
- `referencia` se verá afectado porque apunta al mismo objeto que `manuel`.
- `copia` no se verá afectado porque es una copia independiente de `manuel`.

---

# Diagramas de Implementación

| Diagrama | Código Fuente |
|----------|---------------|
| ![Diagrama implementación A](https://raw.githubusercontent.com/celiabecerril/24-25-EDA1-ExamenParcial/main/Pregunta3CeliaBecerril/DiagramaA.svg) | [Ver código A](https://github.com/celiabecerril/24-25-EDA1-ExamenParcial/blob/main/Pregunta3CeliaBecerril/diagramaA.puml) |
| ![Diagrama implementación B](https://raw.githubusercontent.com/celiabecerril/24-25-EDA1-ExamenParcial/main/Pregunta3CeliaBecerril/DiagramaB.svg) | [Ver código B](https://github.com/celiabecerril/24-25-EDA1-ExamenParcial/blob/main/Pregunta3CeliaBecerril/diagramaB.puml) |

# Código de Implementaciones

- [Código implementación A](https://github.com/celiabecerril/24-25-EDA1-ExamenParcial/tree/main/Pregunta3CeliaBecerril/ImplementacionA)
- [Código implementación B](https://github.com/celiabecerril/24-25-EDA1-ExamenParcial/tree/main/Pregunta3CeliaBecerril/ImplementacionB)


