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

## Respuesta a):

### a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.

1. **Creación del objeto `manuel`:**
   ```java
   Persona manuel = new Persona("Manuel", "1234");
   ```
   Este es el primer objeto `Persona` creado en memoria. Contiene los valores `"Manuel"` y `"1234"`.

2. **Creación del objeto `copia`:**
   ```java
   Persona copia = new Persona(manuel);
   ```
   Este constructor recibe como argumento otro objeto de tipo `Persona`. Crea una copia profunda del objeto `manuel`, asignando sus valores al nuevo objeto. Esto significa que se crea un segundo objeto independiente en memoria con la misma información que `manuel`.

3. **Creación de la referencia `referencia`:**
   ```java
   Persona referencia = manuel;
   ```
   Aquí no se crea un nuevo objeto. Simplemente se establece una nueva variable (`referencia`) que apunta al mismo objeto que `manuel` en memoria. Ambas variables (`manuel` y `referencia`) están referenciando el mismo objeto.

### Explicación:
En memoria hay **dos objetos `Persona` diferentes**:

- El primero fue creado con `new Persona("Manuel", "1234")` y está referenciado por las variables `manuel` y `referencia`.
- El segundo fue creado con `new Persona(manuel)` y está referenciado por la variable `copia`.

Esto se debe a que `referencia` no crea un objeto nuevo, solo apunta al existente (`manuel`).

## Respuesta b):

### Contexto del código:
- **`manuel`** apunta al primer objeto `Persona` creado.
- **`copia`** apunta a un segundo objeto `Persona` que es una copia independiente del primero (se creó con el constructor de copia).
- **`referencia`** es una referencia adicional que apunta al mismo objeto que `manuel`.

Cuando se realiza el cambio con `manuel.setNombre("Manuel Antonio")`, este cambio afecta **únicamente al objeto al que apunta `manuel`**. Como `referencia` también apunta al mismo objeto, cualquier modificación a través de `manuel` también afecta a `referencia`. Sin embargo, **`copia` no se ve afectado** porque es un objeto completamente independiente.

### Elementos de la lista:
1. **`manuel` se insertó en la lista:**  
   Este es el objeto original. Su atributo `nombre` será actualizado a `"Manuel Antonio"` porque la operación `setNombre` se aplica sobre él.

2. **`copia` se insertó en la lista:**  
   Este es un objeto distinto, creado como una copia independiente. Su atributo `nombre` permanecerá sin cambios, con el valor `"Manuel"`.

3. **`referencia` se insertó en la lista:**  
   Como `referencia` apunta al mismo objeto que `manuel`, cualquier cambio en el atributo `nombre` del objeto referenciado por `manuel` también será visible en este caso. Por lo tanto, **este elemento reflejará el cambio** y su atributo `nombre` será `"Manuel Antonio"`.

### Respuesta:
En la lista, los elementos que se verán afectados serán los que corresponden a **`manuel` y `referencia`**, ya que ambos apuntan al mismo objeto. **`copia` el cual no se verá afectado**, porque es un objeto independiente que no comparte referencia con los otros dos.

## Explicaciones de codigo respuesta b):

---

### Importaciones
```java
import java.util.ArrayList;
import java.util.List;
```
- **`import java.util.ArrayList;`**: Importa la clase `ArrayList` que permite crear listas dinámicas que pueden cambiar de tamaño automáticamente.
- **`import java.util.List;`**: Importa la interfaz `List`, que define una colección ordenada de elementos. `ArrayList` es una implementación de esta interfaz.

### Clase `Persona`
```java
public class Persona {
    private String nombre;
    private String dni;
    
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.dni = otra.dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
```
- **Atributos**:
  - `nombre`: Almacena el nombre de la persona.
  - `dni`: Almacena el DNI (Documento Nacional de Identidad) de la persona.

- **Constructores**:
  - `Persona(String nombre, String dni)`: Inicializa los atributos `nombre` y `dni`.
  - `Persona(Persona otra)`: Constructor de copia que crea una nueva instancia de `Persona` copiando los atributos de otra instancia.

- **Métodos**:
  - `setNombre(String nombre)`: Permite cambiar el nombre de la persona.
  - `getNombre()`: Retorna el nombre de la persona.
  - `toString()`: Proporciona una representación en cadena de la persona, útil para imprimir.

### Clase `Lista`
```java
class Lista {
    private List<Persona> personas;
    
    public Lista() {
        personas = new ArrayList<>();
    }
    
    public void insertar(Persona persona) {
        personas.add(persona);
    }
    
    public void mostrar() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
```
- **Atributo**:
  - `personas`: Lista que almacena objetos `Persona`.

- **Constructor**:
  - `Lista()`: Inicializa la lista de personas como un `ArrayList` vacío.

- **Métodos**:
  - `insertar(Persona persona)`: Añade una persona a la lista.
  - `mostrar()`: Imprime todas las personas en la lista, utilizando el método `toString` de cada `Persona`.

### Clase `Principal`
```java
public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Persona manuel = new Persona("Manuel", "12345678");
        Persona otraPersona = new Persona(manuel);
        
        lista.insertar(manuel);
        lista.insertar(otraPersona);
        
        System.out.println("Antes de cambiar el nombre:");
        lista.mostrar();
        
        manuel.setNombre("Manuel Antonio");
        
        System.out.println("\nDespués de cambiar el nombre:");
        lista.mostrar();
    }
}
```
- **Método `main`**:
  - Crea una instancia de `Lista`.
  - Crea una instancia de `Persona` llamada `manuel` con el nombre "Manuel" y el DNI "12345678".
  - Crea una copia de `manuel` llamada `otraPersona`.
  - Inserta ambas personas en la lista.
  - Muestra el contenido de la lista antes de cambiar el nombre de `manuel`.
  - Cambia el nombre de `manuel` a "Manuel Antonio".
  - Muestra el contenido de la lista después de cambiar el nombre.

### Comportamiento del Programa

- **Antes de cambiar el nombre**:
  ```plaintext
  Persona{nombre='Manuel', dni='12345678'}
  Persona{nombre='Manuel', dni='12345678'}
  ```

- **Después de cambiar el nombre**:
  ```plaintext
  Persona{nombre='Manuel Antonio', dni='12345678'}
  Persona{nombre='Manuel', dni='12345678'}
  ```

Esto demuestra que aunque `otraPersona` es una copia de `manuel`, son objetos distintos en memoria. Cambiar el nombre de `manuel` no afecta a `otraPersona`.
