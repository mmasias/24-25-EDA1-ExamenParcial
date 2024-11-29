Pregunta 3: referencias y constructores

a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

Hay 2 objetos `Persona` diferentes en memoria. `manuel` que se crea con el constructor `Persona(String nombre, String dni)`, y `copia` que se crea con el constructor `Persona(Persona persona)` que utiliza los valores de `manuel`.

Si referencia fuera un nuevo objeto creado con new Persona(manuel), entonces habría 3 objetos Persona en memoria.

En Java, cuando se crea un objeto utilizando el operador `new`, se asigna un espacio en memoria para ese objeto. En nuestro caso, se crean dos objetos distintos en memoria. La variable `referencia` no crea un nuevo objeto, simplemente apunta al mismo objeto que `manuel`, por lo que no aumenta el número de objetos en memoria.

b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

`manuel` y `referencia` se verán afectados, ya que `referencia` es una referencia al mismo objeto que `manuel`. Cualquier cambio que se haga a través de `manuel` también afectará a `referencia`. `copia` no estará afectado porque es un objeto creado con el constructor de copia y no tiene la misma referencia que los otros dos.

En Java, las variables de tipo objeto no almacenan los objetos, sino referencias a los objetos. Cuando se asigna una variable de objeto a otra, ambas variables apuntan al mismo objeto en memoria. Por lo tanto, cualquier cambio realizado a través de una de las referencias se reflejará en el objeto apuntado por las 2 referencias.

Si copia fuera una referencia al mismo objeto que manuel (es decir, copia = manuel;), entonces copia también se vería afectado por el cambio de nombre

Código creado en la clase `Persona`:

```java
public void setNombre(String nombre) {
    this.nombre = nombre;
}