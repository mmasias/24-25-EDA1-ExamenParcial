## Pregunta 3: referencias y constructores

a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

Hay 2 objetos Persona diferentes:

1. El objeto ***Manuel*** --> Persona manuel = new Persona("Manuel", "1234");

2. El objeto ***copia*** --> Persona copia = new Persona(manuel);

El objeto ***referencia*** --> Persona referencia = manuel; (Aquí no se crea un objeto nuevo, referencia a manuel que ya existe. No es un objeto diferente). 

Los objetos en la lista son solo referencias a los objetos que ya existen también. Entonces creo que son dos.

Ejemplo:

``` public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}

public class Principal {
    public static void main(String[] args) {
        Persona maria = new Persona("Maria");
        Persona pedro = new Persona("Pedro");

        pedro.cambiarNombre("Carlos");
    }
}
 ```
En este ejemplo, en memoria hay 2 objetos Persona diferentes: maria y pedro.


b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?

Este cambio afecta al objeto ***Persona*** al que la variable ***manuel*** apunta. Entonces afectara al primer objeto creado con new Persona("Manuel", "1234").
Los elementos afectados de la lista son ***manuel*** y ***referencia***.
manuel y referencia apuntan al mismo objeto en memoria. Si cambiamos el nombre de ***manuel***, también se cambiará el nombre al que la referencia apunta, ya que ambas variables apuntan al mismo objeto.
Pero ***copia*** es un objeto diferente en memoria, entonces no se verá afectado por el cambio de nombre, porque ***copia*** es una instancia distinta.
El nombre de manuel será cambiado a "Manuel Antonio", y como referencia apunta al mismo objeto, también se afecta. El nombre de los dos será "Manuel Antonio".

Ejemplo:

```
public class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public double getPrecio() {
        return this.precio;
    }
}

public class Principal {
    public static void main(String[] args) {
        Producto laptop = new Producto(1000); 
        Producto copiaLaptop = new Producto(laptop);  
        Producto referenciaLaptop = laptop; 

        laptop.setPrecio(1200);

        System.out.println("Precio de laptop: " + laptop.getPrecio());       
        System.out.println("Precio de copiaLaptop: " + copiaLaptop.getPrecio()); 
        System.out.println("Precio de referenciaLaptop: " + referenciaLaptop.getPrecio()); 
    }
}
```
En ese ejemplo cuando se modifica por ejemplo laptop, la referencia ***referenciaLaptop*** también cambia porque ambas apuntan al mismo objeto.
La copia ***copiaLaptop*** no se ve afectada, porque es un objeto independiente, creado con el mismo precio inicial pero en una nueva instancia. ***laptop*** y ***referenciaLaptop*** comparten el mismo precio actualizado.
***copiaLaptop*** sigue con su precio original, ya que es un objeto independiente.

