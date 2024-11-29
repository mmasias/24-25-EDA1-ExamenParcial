|| |- a) ¿Cuántos objetos Persona diferentes hay en memoria? Justifique su respuesta. 
b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?

a) Hay dos personas porque "referencia" es un puntero a una persona ya existente. Copia se forma a partir de strings ya existentes, y pueden existir strings idénticas, a diferencia de los objetos.
b) Cambiarán referencia y manuel porque son la misma persona pero copia no, ya que copia, aunque se hiciera con strings idénticas a las de manuel, elementos atómicos como String o int pueden existir en el mismo entorno incluso si tienen la misma información.




























