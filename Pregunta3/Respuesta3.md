# Pregunta 3: referencias y constructores

## a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

1. Primer objeto persona: `Persona manuel = new Persona("Manuel", "1234");`
- Se crea un objeto Persona en memoria
- La variable `manuel` es una referencia que apunta a este objeto

2. Segundo objeto persona: `Persona copia = new Persona(manuel);`
- Se crea un nuevo objeto Persona en memoria usando el constructor copia
- La variable `copia` apunta a este nuevo objeto
- Aunque tiene los mismos valores que `manuel`, es un objeto independiente en memoria

3. Tercera 'asignación': `Persona referencia = manuel;`
- NO se crea ningún objeto nuevo
- `referencia` es simplemente otra variable que apunta al mismo objeto que `manuel`
- Es una nueva referencia pero no un nuevo objeto

Por lo tanto, hay exactamente 2 objetos Persona diferentes en memoria:
1. El objeto original creado para `manuel` (al que también apunta `referencia`)
2. El objeto creado como `copia`

Esto se debe a que:
- El operador `new` es el que crea nuevos objetos en memoria, en el código solo se usa `new` dos veces con la clase Persona
- La tercera variable (`referencia`) es solo una referencia adicional a un objeto existente

## b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

1. Si se verán afectados el PRIMER y TERCER elemento de la lista porque:
- El primer elemento corresponde a `manuel`
- El tercer elemento corresponde a `referencia`
- `manuel` y `referencia` apuntan al MISMO objeto en memoria
- Cuando modificamos el nombre a través de `manuel`, estamos modificando el objeto al que ambas referencias apuntan

2. No se verá afectado el SEGUNDO elemento porque:
- El segundo elemento corresponde a `copia`
- `copia` es un objeto independiente creado con el constructor copia
- Aunque inicialmente tenía los mismos valores que `manuel`, es un objeto diferente en memoria
- Los cambios en el objeto de `manuel` no afectan al objeto de `copia`

En resumen: la modificación afectará a dos elementos de la lista (primero y tercero) porque ambos son referencias al mismo objeto en memoria, mientras que el segundo elemento (copia) permanecerá sin cambios al ser un objeto independiente.