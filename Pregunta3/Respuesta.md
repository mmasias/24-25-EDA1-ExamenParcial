## Pregunta (a): ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

En el código proporcionado, podemos determinar el número de objetos `Persona` que existen en memoria observando la creación de instancias y las asignaciones.

### Respuesta (a):
2 OBJETOS PERSONA. EXPLICACIÓN:
- Persona manuel = new Persona("Manuel", "1234");

        En esta línea, se crea un nuevo objeto Persona en memoria, con los  valores nombre = "Manuel" y dni = "1234". Esta referencia (manuel) apunta a un espacio específico en la memoria donde está almacenado el objeto.

- Persona copia = new Persona(manuel);

        Aquí, se crea un nuevo objeto Persona utilizando el constructor copia. Este constructor toma los valores del objeto manuel y crea un objeto distinto, que aunque tiene los mismos valores (nombre = "Manuel" y dni = "1234"), ocupa un espacio de memoria diferente. copia y manuel son dos objetos diferentes.

- Persona referencia = manuel;

        Esta línea no crea un nuevo objeto. referencia simplemente apunta al mismo objeto al que manuel está apuntando. Esto significa que referencia y manuel son dos referencias al mismo objeto en memoria.


![Diagrama Explicativo](Images/RespuestaA.svg)
---

## Pregunta (b): Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?

- Como visto en el diagrama anterior, **manuel** y **referencia** son dos referencias al **mismo objeto**, pero **copia** es una referencia a un **objeto diferente** que fue creado copiando los valores de manuel en el momento de su creación.

Asi que, los Objetos Afectados por el Cambio son:  **manuel** y **referencia** 

**Razón**: Al modificar **manuel**, también se modifica **referencia** porque ambas apuntan a la **misma instancia** del objeto Persona. En cambio, **copia** es una copia distinta del objeto original, por lo que sus atributos permanecen igual después del cambio.



He completado el codigo original para que se pueda ver con un ejemplo concreto que pasaría al cambiar el nombre de **manuel**. 


| Captura del resultado de ejecución                   | Código Fuente                |
|---------------------------------------|------------------------------------------|
| ![Codigo Ejecutado](Images/CambioNombre.png) | [Codigo Fuente](src/)      |
