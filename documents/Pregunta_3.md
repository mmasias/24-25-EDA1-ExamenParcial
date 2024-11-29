## Pregunta 3: referencias y constructores

### a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.


R: Depende la aproximación. En este caso si analizamos la aproximación A:

```
class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = new Persona(persona.getNombre(), persona.getDni());
        this.siguiente = siguiente;
    }
}
```

Vemos que el nodo al recibir la persona, lo que hace es crear un nuevo objeto, a partir de la información. Como si lo estuviera copiando, pero sería un nuevo objeto con una nueva referencia independiente. Por lo tanto si analizamos un poco el código anterior:

```
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

En el punto en el que se crean 3 objetos. manuel, copia y referencia. manuel y referencia son dos objetos que apuntan a la misma referencia. Así que en memoria tenemos 1 persona. copia es una copia de manuel, tiene los mismos datos, pero apunta a una diferente referencia. En ese punto tendríamos 2 personas en memoria.

Por lo tanto, específicamente aquí:

```
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

Cuando se añade manuel, copia, y referencia a la lista, lo que estan haciendo es crear nuevos objetos. Entonces al insertar manuel, en el nodo se crea un objeto con esos datos, y se crea una nueva referencia, así mismo con copia. Referencia, aunque esta apuntando a la misma referencia que manuel, es decir en memoria son un solo objeto, eso no afecta como tal, así que en la inserción serían en total 5 personas en memoria.

- Manuel
- Copia
- Copia en nodo de Manuel
- Copia en nodo de Copia
- Copia en nodo de Referencia

Diagrama:
![Alt text](/images/AA.png)

---

Si analizamos la aproximación B. 

```
class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }
}
```
Vemos que esta aproximación lo que hace es asígnar en el nodo, directamente el objeto persona que le pasamos (sin crear copia, ni crear objetos nuevos) Así que en este caso, con el contexto anterior, pues podemos observar lo siguiente:

```
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

Que aquí cuando se crean los objetos manuel, copia y referencia, tenemos dos personas en memoria: manuel y copia, ya que referencia apunta a la misma referencia que manuel, por lo tanto cuando hacemos la inserción, no se estan creando copias, si no que se les pasa exactamente las mismas referencias y esas son las que se guardan en la lista. Por lo tanto al final, tendríamos 2 personas en memoria.

Diagrama:
![Alt text](/images/BA.png)

---

### b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?

Aquí también es dependiendo la aproximación, pero es un poco más fácil de ver.

Con la aproximación A:

```
public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        manuel.setNombre("Manuel Antonio")
    }
}
```

Ya sabemos que en este punto hay 6 elementos. Si tu haces, manuel.setNombre("Manuel Antonio"), solo se verán afectados 2 elementos(en memoria 1), porque copia, y las copias en nodos, son independientes de manuel. Esta solo afectaría a el objeto referencia ya que apuntan a la misma referencia.

Diagrama:
![Alt text](/images/AABB.png)

---
Con la aproximación B 
```
public class Principal {
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1234");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);

        manuel.setNombre("Manuel Antonio")
    }
}
```

Estarías afectando a 4 elementos, es decir a manuel, referencia, manuel en lista, referencia en lista, esto porque todas apuntan a la misma referencia, entonces estarían afectando a esos 4 elementos que en realidad en memoria corresponden a 1 persona. Copia no se vería afectada porque es un objeto con una referencia diferente.

Diagrama:
![Alt text](/images/BBAA.png)