# **Respuesta 3**

---

## *a) Implementación A*
```java
Persona manuel = new Persona("Manuel", "1234");
Persona referencia = manuel;
Persona copia = new Persona(manuel);
```
En base a la implementación A, encontramos 5 objetos Persona diferentes, uno creado por 
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

Por otro lado, cuando estos objetos se agregan a la lista,
```java
Lista lista = new Lista();
lista.insertarPersona(manuel);
lista.insertarPersona(copia);
lista.insertarPersona(referencia);
```
la lista se encarga de llamar al constructor de Nodo
```java
public Nodo(Persona persona, Nodo siguiente) {
    this.persona = persona;
    this.siguiente = siguiente;
}
```
dándole la referencia del objeto tipo Persona y este vuelve a llamar al constructor de Persona, creando un objeto nuevo por cada uno.
```java    
public Persona(Persona persona) {
    this.nombre = persona.nombre;
    this.dni = persona.dni;
}
```

## *b) Implementación A*
```java
manuel.setNombre("Manuel Antonio");
```
No habría ningún elemento de la lista que se vea afectado ya que al insertar manuel en la lista, el nodo establece una nueva instancia Persona que posee los valores iniciales de manuel y esa instancia es independiente de la original, por lo que las modificaciones que pueda sufrir el objeto manuel serán despreciadas.
A pesar de ello, el objeto original manuel sí se verá afectado por la modificación de estado.

Para justificar que los elementos de la lista no han sido afectados, muestro los objetos después de modificar manuel mediante .setNombre para verificar el estado de los mismos:

https://github.com/alejandrofondo/24-25-EDA1-ExamenParcial/blob/4cbf2a79a613fde5e2e6151aee26421ba2f38bbc/entregas/fondoAlejandro/respuesta3/implementacionA/Principal.java#L31