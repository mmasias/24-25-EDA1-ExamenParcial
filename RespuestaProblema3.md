# Pregunta 3
### Tomando en cuenta las siguientes implementaciones, anteriormente mencionadas:
#### **Implementacion A**
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

#### **Implementacion B**
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


### Analice este código:
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
- a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta. 
- b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?  

### Si se usara la implementación A:
![Diagrama UML](https://www.planttext.com/api/plantuml/svg/hP912eCm44NtWTnXSEz2xQhGuWKAXHwWn3Wj5fr84bUbTwyQ1KVQZMsM3zvFycTovvNrNLDBeMlb79pHEaCAdb90Vs8WqnGMOGyNRokwpxYaQi5UKaXXYWTg3usY3kivOD8F49r67WKyw3rBqcmNSLsRjbARROitj4ZwXmWofKckBUzXKqhwbvHiUyeqYZW-pdFjnppsoz2Yj847Q-MpLgJW9R6qvHMiXM2btwpLAzZNWvfzLdEaij_WDm00)   
### a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta. 
#### Creación de Manuel:
- `manuel` se crea inicialmente usando el constructor **`Persona(String nombre, String dni)`**  
-> Esto genera un nuevo objeto **`Persona`** en memoria con los atributos `nombre = "Manuel"` y `dni = "1234"` 

#### Creación de copia:
- `copia` se crea mediante el segundo constructor, un constructor de copia **`Persona(Persona persona)`**
- Este constructor toma como parámetro un objeto **`Persona`** y copia sus atributos (`nombre` y `dni`), creando un nuevo objeto independiente en memoria.
-> Por lo tanto, aunque `copia` tiene los mismo valores que `manuel`, es un objeto completamente distinto con su propio espacio en memoria.

#### Creación de referencia:
- `referencia` no es un objeto nuevo, sino simplemente otra referencia que apunta al mismo objeto que `manuel`.
-> Esto significa que `referencia` y `manuel` son dos nombres para el mismo objeto en memoria

#### Nodos  
Al crear un nodo, se genera un nueva instancia de **`Persona`**, por lo que:
- El **primer nodo** crearía una nueva copia basada en `manuel`
- El **segundo nodo** crea una copia basada en `copia`
- El **tercer nodo** crea una nueva copia basada en `referencia`, sabiendo que realmente `referencia` apunta a `manuel`

#### Por lo que la lista de objetos creados sería:
- `manuel`: Primer objeto creado.
- `copia`: Copia de `manuel`.
- persona_nodo1: Copia de `manuel` al crear **nodo1**.
- persona_nodo2: Copia de `copia` al crear **nodo2**.
- persona_nodo3: Copia de `manuel` (a través de `referencia`) al crear **nodo3**.

### b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?  
- Inicialmente, se vería afectado `manuel` ya que es al que directamente se le está aplicando los cambios.
- Y sabiendo que `referencia` apunta a `mauel`, igualmentemente se verían reflejados los cambios en ella.  
Por lo tanto:  
`manuel` = `"Manuel Antonio"`
`referencia` = `manuel` = `"Manuel Antonio"`
## Si se usara la implementación B:
![Diagrama UML](https://www.planttext.com/api/plantuml/svg/u-LApaaiBbO8I2qgpizBLAZcvL800bs5lFpSfA9K1Ik5u9AYpBnqc71ANYQIM2ql5ozNVb9MQdA9GcvYNcbg3im0g7PR1ILViBWIH1Ya7IXcQ6HieeIgFJc_83EHRDr5gMcfHQbvoUGO0NMuhguTB1HukI2kGH52iW8a3j45qWy0)

### a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta.  
Hay 2 objetos **`Persona`** en memoria.
#### Creación de Manuel:
- `manuel` se crea inicialmente usando el constructor **`Persona(String nombre, String dni)`**  
-> Esto genera un nuevo objeto **`Persona`** en memoria con los atributos `nombre = "Manuel"` y `dni = "1234"` 

#### Creación de copia:
- `copia` se crea mediante el segundo constructor, un constructor de copia **`Persona(Persona persona)`**
- Este constructor toma como parámetro un objeto **`Persona`** y copia sus atributos (`nombre` y `dni`), creando un nuevo objeto independiente en memoria.
-> Por lo tanto, aunque `copia` tiene los mismo valores que `manuel`, es un objeto completamente distinto con su propio espacio en memoria.

#### Creación de referencia:
- `referencia` no es un objeto nuevo, sino simplemente otra referencia que apunta al mismo objeto que `manuel`.
-> Esto significa que `referencia` y `manuel` son dos nombres para el mismo objeto en memoria

### b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?  
- En este caso, se vería afectado el elemento con nombre `referencia`.
Esto se debe a que el constructor `Persona` solamente asigna referencias:  
--> ``this.persona = persona``  
Por lo que el nodo no crea una copia del objeto `Persona`, en lugar de eso, utiliza la misma referencia en memoria. Por lo tanto cualquiero objeto original afectara **todas la referencias apuntando a él**.
Quedando tal que:  
- `manuel` : el atributo `nombre` será `"Manuel Antonio"`
- `referencia` : el atributo `nombre` también será `"Manuel Antonio"`
- `copia`: el atributo `nombre` seguirá siendo `"Manuel"`