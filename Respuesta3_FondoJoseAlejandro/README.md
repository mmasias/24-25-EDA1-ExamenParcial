# **Respuesta 3**

---

## *a)*
```java
Persona manuel = new Persona("Manuel", "1234");
Persona referencia = manuel;
Persona copia = new Persona(manuel);
```
Encontramos 2 objetos Persona diferentes, uno creado por 
```java 
Persona manuel = new Persona("Manuel", "1234");
``` 
y 
```java
Persona referencia = manuel; 
```
que apunta a el mismo objeto, y otro objeto Persona creado mediante 
```java
Persona copia = new Persona(manuel); 
```
que genera un nuevo objeto en memoria con los mismos atributos que manuel, pero son independientes.

Para justificar estas respuestas, he decidido mostrar los objetos creados y verificar si manuel, copia y referencia son el mismo objeto:

https://github.com/alejandrofondo/24-25-EDA1-ExamenParcial/blob/8064a7cc49eedbb6541f8d353854c72ca0e40727/Respuesta3_FondoJoseAlejandro/Principal.java#L12

## *b)*
```java
manuel.setNombre("Manuel Antonio");
```
Los elementos de la lista que se verán afectados son los que apuntan a la referencia manuel; es decir, se modifica el estado del objeto creado por 
```java
Persona manuel = new Persona("Manuel", "1234"); 
```
y a su vez la referencia asociada a manuel creada por 
```java
Persona referencia = manuel;
```
Por último, 
```java
Persona copia = new Persona(manuel); 
```
no se vería afectado porque es un objeto independiente clonado en memoria.

Para justificar los elementos de la lista afectados, muestro los objetos después de modificar manuel mediante .setNombre para verificar el estado de los mismos:

https://github.com/alejandrofondo/24-25-EDA1-ExamenParcial/blob/8064a7cc49eedbb6541f8d353854c72ca0e40727/Respuesta3_FondoJoseAlejandro/Principal.java#L21