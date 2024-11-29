# Respuesta Pregunta 3 Fernando William

## Apartado A

Si tenemos en cuenta el Nodo de la implementación A tenemos 5 (Cinco) objetos de Persona.

### Estos 5 objetos serían: 

1 - `manuel` Persona manuel = new Persona ("manuel");

2 - `copia` Persona copia = new Persona(manuel);

3 - El tercer objeto sería la copia de `manuel` al insertarlo en la lista: lista.insertarpersona(manuel);

4 - El cuarto objeto sería la copia de `copia` al insertarlo en la lista: lista.insertarpersona(copia);

5 - Y el quinto objeto sería la otra copia de `manuel` a traves de referencia: lista.insertarPersona(referencia);  

[Código UML](https://github.com/FernandoWilliam26/24-25-EDA1-ExamenParcial/blob/b49cb02344dbf3cba6fbb72a0cdc4873da2dea1e/pregunta3calvoFernando/Diagramas/implementacionA-a/diagramaA.puml)

[Diagrama UML](https://github.com/FernandoWilliam26/24-25-EDA1-ExamenParcial/blob/b49cb02344dbf3cba6fbb72a0cdc4873da2dea1e/pregunta3calvoFernando/Diagramas/implementacionA-a/ApartadoA-a.svg)

## Nodo Implementación B

Si tenemos en cuenta el Nodo de la implementación B tenemos 2 (Dos) objetos de Persona.

### Estos 2 objetos serían:

Se crea el primer objeto "Persona" en memoria, y al crear `copia` con "new Persona(manuel)", el constructor de `copia` toma los valores de `manuel` y crea un nuevo objeto "Persona" con los mismos datos pero en diferente ubicación de memoria. Con lo cual `copia` sería el segundo objeto.

[Código UML](https://github.com/FernandoWilliam26/24-25-EDA1-ExamenParcial/blob/b49cb02344dbf3cba6fbb72a0cdc4873da2dea1e/pregunta3calvoFernando/Diagramas/implementacionB-b/DiagramaB.puml)

[Diagrama UML](https://github.com/FernandoWilliam26/24-25-EDA1-ExamenParcial/blob/b49cb02344dbf3cba6fbb72a0cdc4873da2dea1e/pregunta3calvoFernando/Diagramas/implementacionB-b/B.svg)


## Apartado B

Si la clase nodo corresponde a la implementación A, ningún elemento de la lista se verá afectado por este cambio en `manuel`, ya que:
Cuando se inserta manuel en la lista, el nodo crea una nueva instancia de Persona con los mismos valores que manuel. Esa nueva instancia es independiente de la original, luego da igual que modifiques el objeto después.
Sin emabrgo el objeto original `manuel` si que se verá afectado.

Por otro lado, si la clase `Nodo` correspondiese a la implementación B, además del propio objeto original `manuel`, los elementos `manuel` y `referencia` de la lista se verían alterados ya que, aunque `copia` haya sido creada a partir de `manuel` es un objeto independiente, mientras que `referencia` no es un objeto en sí, tan solo es un puntero que referencia a `manuel`.