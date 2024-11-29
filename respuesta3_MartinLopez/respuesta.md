# Respuesta pregunta 3

## Martín López de Novales Gurruchaga

### a)

Si la clase nodo corresponde a la implementación A hay cinco objetos de la clase `Persona`.
Esto se debe a que en un principio se crean dos objetos `manuel` y `copia`. Sin embargo, cuando estos objetos se agregan a la lista `lista` lo que hace esta lista es llamar al constructor de `Nodo` pasándole como parámetro la referencia del objeto de tipo `Persona`. Y al llegar al constructor de este nodo este lo que hace es volver a llamar al constructor de `Persona`, creando así un objeto nuevo.

<br>

![Código UML y diagrama](respuesta3_MartinLopez/diagramas/apartado a)

<br>


Si, por otro lado, la clase `Nodo` correspondiese a la implementación B habría dos objetos de la clase `Persona` en su lugar.
Esto es debido a que en un principio se crean los dos mismos objetos que en un principio, estos son `manuel` y `copia`. Estos objetos son agregados a lista, la cual crea un objeto de la clase `Nodo` llamando a su constructor. Sin embargo, el constructor de la implementacion B de `Nodo`, a diferencia de la implementación A, simplemente guarda el objeto que se le es pasado por parámetro, es decir, no crea otro objeto de la clase `Persona`.

![Código UML y diagrama](respuesta3_MartinLopez/diagramas/apartado b)

<br>

### b)
