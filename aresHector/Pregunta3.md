# **Análisis del código**

## **a) ¿Cuántos objetos `Persona` diferentes hay en memoria?**

En el código proporcionado, se crean y manipulan referencias de objetos `Persona`. Analicemos cada paso:

1. **Creación de `manuel`:**
   ```java
    Persona manuel = new Persona("Manuel", "1234");

    Se crea un nuevo objeto Persona en memoria con los atributos:

    nombre = "Manuel"

    dni = "1234"

    Ahora hay 1 objeto Persona en memoria.

2. **Creación de `copia`:** 

    ```java
    Persona copia = new Persona(manuel);

    ```
    El constructor de copia:

    ```java

    public Persona(Persona persona) {
    this.nombre = persona.nombre;
    this.dni = persona.dni;
    }
    ```
    Crea un **nuevo objeto independiente** con los mismos valores (*nombre = "Manuel"*, *dni = "1234"*), pero en una nueva posición de memoria. Este objeto **no está vinculado al primero**.

    Ahora hay **2 objetos `Persona` en memoria**.


3. **Creación de `referencia`:**
   ```java
   Persona referencia = manuel;
   ```
   Esto **no crea un nuevo objeto**. `referencia` apunta al mismo objeto que `manuel`. Por lo tanto, **no se incrementa la cantidad de objetos en memoria**.

   Seguimos teniendo **2 objetos `Persona` en memoria**.

4. **Insercción en la `lista`:**

   ```java
     lista.insertarPersona(manuel);
    lista.insertarPersona(copia);
    lista.insertarPersona(referencia);
    ```

    **Las referencias insertadas en la lista son:**

    . La `referencia` al objeto de manuel.
    
    . La `referencia` al objeto de copia (independiente).
    
    . La referencia al objeto de `referencia`, que es la misma que manuel.
    (La lista no crea nuevos objetos, solo almacena referencias.)

## *b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué `elementos` de la lista se verán afectados?*

Al ejecutar:

```java
manuel.setNombre("Manuel Antonio");
```
El método `setNombre` modifica el atributo `nombre` del objeto referenciado por `manuel`. Analicemos las referencias en la lista:

1. **Primera referencia (`manuel`):**
   - Esta referencia apunta al objeto de `manuel`.
   - **Se verá afectada**, ya que el atributo `nombre` del objeto ha cambiado.

2. **Segunda referencia (`copia`):**
   - Esta referencia apunta a un objeto independiente creado con el constructor de copia.
   - **No se verá afectada**, porque este objeto es completamente independiente.

3. **Tercera referencia (`referencia`):**
   - Esta referencia apunta al mismo objeto que `manuel`.
   - **Se verá afectada**, ya que ambas referencias (`manuel` y `referencia`) apuntan al mismo objeto.



-----
___




![Diagrama UML](https://www.planttext.com/api/plantuml/svg/bP8zJiGm48LFu3iyfG6ABVYf8e5sjRHGS0Cdde2HFHFPZYWG1zgQ8-HYs4js2K4KszbZVs_U6rkjOz8X3TufQLwfJNZGF933km9OV1C8jwY-YrMk6RQbS7brVLEf3tMWjj9RVIhqH1q5ulO4yYn3VQ18d7Hhnq-68JWT4OvQKKqHLaRUU7KtUQkn3QGnC4ht9B1ig2SsDclHafbPg-SRxU1jz3A954Ft5FjXtCNY959wtASuwDL_Kc73ITXAfNxr-F_QFhFBQOKfeXL6FlNZBecHMKEMH0Zs-IL1kkaLym2F5ywNmXSgXqV1r0B-CJONWExoe-KHGFj6uenUvsNvGLy0)







