# Pregunta 3: Referencias y Constructores

## a) ¿Cuántos objetos `Persona` diferentes hay en memoria? Justifique su respuesta.

Hay **2 objetos `Persona` diferentes** en memoria: 

1. `manuel`, que se crea utilizando el constructor `Persona(String nombre, String dni)`.
2. `copia`, que se crea utilizando el constructor `Persona(Persona persona)` copiando los valores de `manuel`.

Si `referencia` fuera un nuevo objeto creado con `new Persona(manuel)`, entonces habría **3 objetos `Persona`** en memoria.

En Java, al crear un objeto con el operador `new`, se asigna un espacio en memoria para ese objeto. En este caso:
- `manuel` y `referencia` apuntan al mismo objeto en memoria.
- `copia` apunta a un objeto distinto, creado con el constructor de copia.

Por lo tanto, la variable `referencia` no incrementa el número de objetos, ya que simplemente señala al mismo objeto que `manuel`.

---

## b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

**Elementos afectados:**
- `manuel` y `referencia` se verán afectados, ya que ambos apuntan al mismo objeto en memoria. Cualquier cambio que se haga a través de `manuel` también se reflejará en `referencia`.

**Elementos no afectados:**
- `copia` no se verá afectado porque es un objeto distinto creado con el constructor de copia. Su referencia no está vinculada al mismo objeto que `manuel` y `referencia`.

### Explicación:
En Java, las variables de tipo objeto no almacenan los objetos directamente, sino referencias a ellos. Si asignamos una referencia de objeto a otra variable, ambas apuntarán al mismo objeto. Cualquier cambio realizado a través de una referencia se reflejará en todas las demás referencias al mismo objeto.

Si `copia` fuera una referencia al mismo objeto que `manuel` (por ejemplo, si hacemos `copia = manuel;`), entonces **todos** los elementos de la lista se verían afectados por el cambio.

---

## Código creado en la clase `Persona` para el método `setNombre`:

```java
public void setNombre(String nombre) {
    this.nombre = nombre;
}
````

| Diagrama | Código Fuente |
|----------|---------------|
| ![Actores](https://github.com/celiabecerril/24-25-EDA1-ExamenParcial/blob/main/Pregunta3CeliaBecerril/diagrama.svg) | [Ver código](https://github.com/celiabecerril/24-25-EDA1-ExamenParcial/blob/main/Pregunta3CeliaBecerril/diagrama.puml) |
