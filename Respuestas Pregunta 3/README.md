# Nueva respuesta

## Pregunta 3
Implementación A:

    class Nodo {
        private Persona persona;
        private Nodo siguiente;
        
        public Nodo(Persona persona, Nodo siguiente) {
            this.persona = new Persona(persona.getNombre(), persona.getDni());
            this.siguiente = siguiente;
        }
    }
Implementación B:

    class Nodo {
        private Persona persona;
        private Nodo siguiente;
        
        public Nodo(Persona persona, Nodo siguiente) {
            this.persona = persona;
            this.siguiente = siguiente;
        }
    }
Código Principal:

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

### a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta

`Implementación A`

En esta implementación, cuando se crea persona, se genera 1 objeto de Persona. Cada vez que se crea un Nodo, el constructor crea una nueva copia del objeto Persona:
- nodo1 crea una copia de persona (1 objeto de Persona adicional).
- nodo2 crea otra copia de persona (otro objeto de Persona adicional).

También se crean 2 objetos de Nodo (nodo1 y nodo2).

Total de Objetos:
- Objetos Persona: 3 (persona, copia de nodo1, copia de nodo2).
- Objetos Nodo: 2 (nodo1, nodo2).

En total: 5 objetos.

#### Implementación A:
![Diagrama UML Apartado a) Implementación A](https://www.planttext.com/api/plantuml/svg/dL912iCW4BplAoJt79hqb4C9z5mexGEArMqHaZLeSYhzUoCgaKOAZHTXTcOOPstjoCquzHs0wBYrx88FD4X2SVO2Df-IaUxl1XjMd3XDs1K1Hidb3EwgUb_0E-ezPvkMjDIUTnlGM4rB1gaC2g4qhQmagOPTHwFekJYTl-GnHk3zK1xriFNfBdwrIlwtHRtL8bbTMHxY9Y3S3ieK31dCKKE3gJf2lg84yIPLJkz7TNu4BPAS_zu7)

`Implementación B`

En esta implementación simplemente se crean 2 objetos, ya que cre crea una referencia  a manuel, que es un objeto de Persona, y a su vez se crea una copia de manuel, que es otro objeto.

#### Implementación B:
![Diagrama UML Apartado a) Implementación B](https://www.planttext.com/api/plantuml/svg/SoWkIImgAStDuU9ApaaiBbO8IarBBKhDIyvCLAZcKW02NOMy_DoaebGh1INVnBpIr1mbg71gIc8AKD3GoDX4YQiMfX-YXZoz0Qb5nVbvc1O7bnHbvgL31LFoCk4YS9tE-GMaEnZ9gxgwTb2NSq4z01A1keSBOZgIY08NbqDgNWems000)

### b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?

Si ejecutamos `manuel.setNombre("Manuel Antonio")`, el método `setNombre` cambiará el atributo `nombre` del objeto `manuel`. Dado que `referencia` es una referencia al mismo objeto que `manuel`, el cambio también se reflejará en `referencia`, ya que ambos apuntan al mismo objeto en memoria.

Ahora, respecto a los elementos de la lista (`lista`), se verán afectados los siguientes:

1. **`manuel`**: Su nombre se actualizará a "Manuel Antonio", ya que es el objeto que se ha modificado.
2. **`referencia`**: Como `referencia` es una referencia al mismo objeto que `manuel`, también mostrará el nombre "Manuel Antonio".

Sin embargo, **`copia`** no se verá afectada. Esto es porque `copia` es un objeto distinto que se creó a partir del constructor de copia, y sus atributos (`nombre` y `dni`) son copias independientes de los de `manuel`. Por lo tanto, el nombre de `copia` seguirá siendo el valor original que tenía cuando se creó, es decir, "Manuel".

En resumen, tras ejecutar `manuel.setNombre("Manuel Antonio")`, los elementos de la lista que se verán afectados son `manuel` y `referencia`, mientras que `copia` permanecerá sin cambios. 

![Diagrama UML Apartado b)](https://www.planttext.com/api/plantuml/svg/TP6n3e8m48Rt9ds7IoSTJ02T60pegeblO0hKf8Qsf9J9-EvUMqZ0GAVB__N-_dSjUiUj6rGBPOS5Ryo54afCzHQr0_OGjZUQmqvnFOXspu3tS0yrV2W1FDgeoeeSs2YNsXaj3OkqqH9HcXrFA7nNhMlJIHwThxxSCDuqjEBrL70uJxaGgwd3CxjaA0ahT2tvo6lFuykUXpXidlGcSKaXNwYcV4aE_-k989s1E5pKixM6C4BqFIno9cokntn-ShP-FKEz4Bh1hwJa1m00)