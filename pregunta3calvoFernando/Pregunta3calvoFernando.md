# Respuesta Pregunta 3 Fernando William

## Apartado A

Si tenemos en cuenta el Nodo de la implementación A tenemos 5 (Cinco) objetos de Persona.

### Estos 5 objetos serían: 

1 - `manuel` Persona manuel = new Persona ("manuel");

2 - `copia` Persona copia = new Persona(manuel);

3 - El tercer objeto sería la copia de `manuel` al insertarlo en la lista: lista.insertarpersona(manuel);

4 - El cuarto objeto sería la copia de `copia` al insertarlo en la lista: lista.insertarpersona(copia);

5 - Y el quinto objeto sería la otra copia de `manuel` a traves de referencia: lista.insertarPersona(referencia);  



## Nodo Implementación B

Si tenemos en cuenta el Nodo de la implementación B tenemos 2 (Dos) objetos de Persona.

### Estos 2 objetos serían:

Se crea el primer objeto "Persona" en memoria, y al crear `copia` con "new Persona(manuel)", el constructor de `copia` toma los valores de `manuel` y crea un nuevo objeto "Persona" con los mismos datos pero en diferente ubicación de memoria. Con lo cual `copia` sería el segundo objeto.