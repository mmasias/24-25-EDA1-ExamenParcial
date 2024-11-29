Respuesta de Miguel Castañeda
|| |- a) ¿Cuántos objetos Respuesta.Persona diferentes hay en memoria? Justifique su respuesta. 
b) Si hacemos manuel.setNombre("Manuel Antonio"), ¿qué elementos de la lista se verán afectados? ¿Por qué?

a) Hay dos personas porque "referencia" es un puntero a una persona ya existente. "Copia", en cambio, solo usa los string de otra persona.
b) Cambiarán "referencia" y manuel porque son la misma persona pero "copia" no, ya que "copia", aunque se hiciera con strings idénticas a las de "manuel", elementos atómicos como String o int pueden existir en el mismo entorno incluso si tienen la misma información.




























