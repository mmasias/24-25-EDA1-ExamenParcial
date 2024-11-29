## Ejercicio 3

## a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.
Podemos encontrar 2 objetos Persona diferentes en memoria.
Estos son el objeto manuel y el objeto copia.

El objeto manuel es creado utilizando el constructor que recibe un nombre y un DNI como podemos ver en: Persona manuel = new Persona("Manuel", "1234");

El objeto copia se crea utilizando el constructor que recibe otro objeto de tipo Persona, como podemos ver en: Persona copia = new Persona(manuel);  Este constructor lo que hace es copiar los valores de nombre y dni de manuel pero crea un nuebo objeto en memoria
Persona referencia = manuel;  esto sin embargo no crea un nuevo objeto porque  es una simple referencia al mismo objeto que apunta la variable manuel

## b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?
Si hacemos esto, se verán afectados los elementos 1 y 3 de la lista. El segundo no se ve afectado.

En el primer elemento es el mismo objeto que está referenciado por manuel. Cuando modificamos el atributo nombre del objeto con setNombre, este cambio lo podremos ver automáticamente en el primer elemento porque apunta al mismo objeto en memoria.

El segundo elemento de la lista  no se ve afectado porque ha sido creado con el constructor de copia new Persona(manuel). Lo que hace este constructor es es crear un nuevo objeto en memoria con los mismos valores iniciales (nombre y dni), pero es independiente del objeto referenciado por manuel,. Es por eso que este elemento no se ve afectado.

El tercer elemento de la lista es una referencia directa al mismo objeto al que está apuntando manuel, que es a través de referencia. Al apuntar al mismo objeto, cualquier cambio que se realice en manuel se refleja automáticamente en el tercer elemento.


