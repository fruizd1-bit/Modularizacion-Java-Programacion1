# Laboratorio 1 – Programación 1

Curso: Programación 1  

Integrantes:  
Roberto Leiva – 0905-25-11678  
Fredy Ruiz – 0905-25-6514  

---

# Parte 1 – Análisis del Programa Original

## Identificación de Tareas Repetitivas

En el programa original, toda la lógica se encontraba dentro del método `main`, lo que hacía que el código fuera largo, poco organizado y difícil de mantener. Aunque el programa funcionaba correctamente, no estaba estructurado de manera modular.

Se identificaron las siguientes tareas que podían convertirse en métodos independientes:

- Agregar estudiante.
- Mostrar estudiantes registrados.
- Calcular el promedio de las calificaciones.
- Mostrar el estudiante con mayor calificación.
- Mostrar el menú de opciones.
- Leer y validar datos ingresados por el usuario.

### Bloques de código que se repetían

- Lectura de datos desde teclado.
- Validaciones numéricas.
- Recorridos de listas para realizar cálculos.
- Mensajes de control del menú.

### Responsabilidades que pueden separarse

Cada acción del programa representa una responsabilidad distinta. Por ejemplo:

- Capturar datos es diferente a procesarlos.
- Calcular promedio es diferente a mostrar resultados.
- Validar entradas es diferente a ejecutar operaciones.

### Por qué dividir estas tareas mejora el programa

Dividir el programa en métodos:

- Mejora la organización.
- Reduce la complejidad del método principal.
- Facilita el mantenimiento.
- Permite reutilizar código.
- Hace que el programa sea más claro y profesional.

---

## Variables Locales vs Globales

### Variables Globales (atributos static de la clase)

Se declararon como variables globales:

- Lista de estudiantes.
- Lista de calificaciones.
- Objeto `Scanner`.

Estas variables se declararon como `static` porque deben ser utilizadas por varios métodos dentro del programa. Su alcance es global dentro de la clase y su tiempo de vida dura toda la ejecución del programa.

Se utilizan como globales porque todos los métodos necesitan acceder a la misma información.

---

### Variables Locales

Se declararon como variables locales aquellas que solo se utilizan dentro de un método específico, por ejemplo:

- opcion
- suma
- promedio
- mayor
- nombreMayor
- nota

Estas variables tienen un alcance limitado al método donde se declaran y desaparecen cuando el método termina su ejecución.

---

### Reflexión sobre alcance y tiempo de vida

El alcance determina dónde puede usarse una variable dentro del programa.  
El tiempo de vida indica cuánto tiempo existe en memoria.

Las variables globales existen durante toda la ejecución, mientras que las variables locales solo existen dentro del método que las declara.

---

### Riesgos de modificar datos globales accidentalmente

El uso excesivo de variables globales puede generar:

- Cambios inesperados en los datos.
- Errores difíciles de detectar.
- Dependencia innecesaria entre métodos.
- Mayor dificultad para depurar.

Por ello, se recomienda utilizar variables globales únicamente cuando sea necesario compartir información entre varios métodos.

---

# Parte 2 – Modularización del Programa

El programa fue reestructurado aplicando el concepto de modularización.

Se crearon métodos claros y específicos:

- mostrarMenu()
- agregarEstudiante()
- mostrarEstudiantes()
- calcularPromedio()
- mostrarMayorCalificacion()
- leerEntero()
- leerNotaValida()

Cada método cumple una sola responsabilidad, siguiendo el principio de que un método debe realizar una única tarea.

El método main ahora únicamente controla el flujo del programa y llama a los demás métodos según la opción seleccionada por el usuario.

Esta estructura permite que el código esté mejor organizado, sea más fácil de leer y más sencillo de modificar en el futuro sin afectar otras partes del sistema.

El programa se mantiene completamente funcional después de la modularización.

---

# Parte 3 – Validaciones y Manejo de Excepciones

## Posibles errores que podrían ocurrir

- El usuario puede ingresar texto en lugar de un número.
- El usuario puede ingresar una opción inválida en el menú.
- El usuario puede ingresar una calificación fuera del rango permitido.
- Se puede intentar calcular el promedio sin estudiantes registrados.
- Se puede intentar mostrar el mayor cuando la lista está vacía.

---

## Validaciones implementadas

Se implementaron las siguientes mejoras:

- Uso de estructuras try-catch para evitar que el programa finalice inesperadamente.
- Captura de excepciones cuando el usuario ingresa datos incorrectos.
- Validación de que las calificaciones estén dentro del rango de 0 a 100.
- Verificación de que existan estudiantes antes de realizar cálculos.
- Validación de que la opción del menú sea válida.

---

## Importancia de las validaciones

Las validaciones son importantes porque:

- Evitan que el programa falle.
- Mejoran la experiencia del usuario.
- Garantizan datos correctos.
- Hacen el sistema más robusto.
- Permiten un manejo adecuado de errores.

El manejo de excepciones es fundamental para mantener la estabilidad del programa.

---

# Parte 4 – Preguntas de Reflexión

## ¿Qué ventajas tiene dividir el código en métodos?

Dividir el código en métodos permite organizar mejor el programa. Facilita la lectura y comprensión. Permite reutilizar código en otras partes del sistema. Reduce la complejidad del método principal. Hace que el mantenimiento sea más sencillo. Mejora la claridad y estructura del programa.

---

## ¿Por qué no es recomendable usar muchas variables globales?

No es recomendable usar muchas variables globales porque pueden ser modificadas desde cualquier parte del programa. Generan dependencias innecesarias entre métodos. Aumentan la posibilidad de errores inesperados. Dificultan la depuración y reducen la seguridad del código.

Es mejor utilizar variables locales siempre que sea posible.

---

## ¿Cómo mejora la modularización la legibilidad del código?

La modularización divide el programa en partes pequeñas y comprensibles. Cada método tiene una función específica, lo que facilita entender el flujo general del sistema.

Un código modular es más ordenado, más claro, más profesional y más fácil de analizar y mantener.

---

# Entregables

## Código Java

Archivo: Main.java

- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

## Archivo README.md

Incluye:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# Conclusión

La aplicación de la modularización permitió mejorar significativamente la estructura del programa. Separar las responsabilidades en métodos específicos facilitó la organización y comprensión del código.

La implementación de validaciones y manejo de excepciones fortaleció la estabilidad del sistema ante posibles errores de entrada.

El resultado final es un programa funcional, estructurado y fácil de mantener, cumpliendo con los objetivos establecidos en el laboratorio.