## Pregunta 3: referencias y constructores

Analice este código:

```java
public class Persona {
    private String nombre;
    private String dni;
    
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.dni = persona.dni;
    }
}

public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
    }
}
```

||
|-
a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.
b) Si hacemos `manuel.setNombre("Manuel Antonio")`, ¿qué elementos de la lista se verán afectados? ¿Por qué?

### Respuesta

a) En este caso la cantidad de objetos dependera de la implementación de nodo que se utilizé, cabe aclara que en ambos casos siempre va a haber un minimo de 2 objetos Personas:

```java
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
```

- Si se utiliza la implementación de Nodo A, habrá un total de 5 objetos Persona en memoria

- [Depuración A] (../images/depuradorA.png)

El codigo se encuentra en: (./CasoA.java)

- Si se utiliza la implementación de Nodo B, habrá un total de 2 objetos Persona en memoria  

- [Depuración B] (../images/depuradorB.png)

El codigo se encuentra en: (./CasoB.java)


