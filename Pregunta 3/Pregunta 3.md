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

## Respuestas pregunta 3

a) Utilizando la implementación B, en la memoria hay dos objetos persona diferentes, existe el primer "manuel"...  

```
Persona manuel = new Persona("Manuel", "1234");
```

un nuevo objeto persona "copia" con los mismos parametros que el primer objeto persona "manuel"...

```
Persona copia = new Persona(manuel);
```

podría haber confusión con la siguiente línea del código ya que se podría pensar que "referencia" es otra nueva persona pero no, es una variable que apunta al primer objeto persona ya creada "manuel".

![alt text](<Variable referencia.png>)
    
b) Si se hace `manuel.setNombre("Manuel Antonio")` se verían afectados el primer objero persona "manuel" y la variable "refencia" ya que como se ha explicado antes no es un objeto persona como tal pero apunta hacía "manuel" por lo que cualquier cambio que se haga sobre "manuel" tambien se hace sobre "refencia".

![alt text](manuel.setNombre()-1.png)



