# lesson-10-script.md

# Proyecto Final: Sistema de Registro Estudiantil

## Inicio

Hola, bienvenidos a la lección 10 del curso de Fundamentos de Java para Principiantes.

En esta clase vamos a realizar un pequeño proyecto final. Usaremos todo lo que hemos aprendido en las lecciones anteriores: clases, objetos, métodos, encapsulamiento y arreglos de objetos.

Nuestro objetivo será construir un sistema de registro estudiantil. Este sistema nos permitirá guardar varios estudiantes, mostrar su información y saber cuántos aprobaron y cuántos desaprobaron.

---

## Parte 1: presentar la clase

Para este proyecto seguiremos usando nuestra clase `Estudiante`, que ya tiene atributos privados, un constructor y algunos métodos útiles.

Esto nos permitirá concentrarnos en la parte más importante del proyecto: trabajar con varios estudiantes dentro de un mismo sistema.

---

## Parte 2: crear el arreglo

Primero, dentro del método `main`, vamos a crear un arreglo de objetos `Estudiante`.

Este arreglo almacenará varios estudiantes. En este caso, vamos a registrar cuatro.

---

## Parte 3: llenar el arreglo

Ahora vamos a llenar el arreglo. En cada posición colocaremos un objeto distinto.

Cada estudiante tendrá su propio nombre, edad y nota.


---

## Parte 4: crear contadores

Como este será un sistema de registro, no solo queremos mostrar la información de cada estudiante. También queremos llevar un pequeño resumen final.

Para eso crearemos dos variables: una para contar cuántos estudiantes aprobaron y otra para contar cuántos desaprobaron.


---

## Parte 5: mostrar título del sistema

Antes de recorrer el arreglo, vamos a imprimir un mensaje de inicio para que el programa se vea más ordenado y más claro al ejecutarse.



---

## Parte 6: recorrer el arreglo

Ahora recorreremos el arreglo con un ciclo `for`.

En cada vuelta del ciclo, mostraremos la información del estudiante. Después verificaremos si aprobó o no usando el método `estaAprobado()`.

Si el estudiante aprobó, aumentaremos el contador de aprobados. Si no aprobó, aumentaremos el contador de desaprobados.

---

## Parte 7: mostrar el resumen final

Finalmente, mostraremos un pequeño resumen del sistema.

Aquí indicaremos cuántos estudiantes hay en total, cuántos aprobaron y cuántos desaprobaron.

De esta manera, nuestro programa no solo muestra datos, sino que también procesa información y nos da un resultado final útil.

```

---

## Parte 8: cierre

Con este proyecto final hemos unido varios conceptos importantes de Java en un solo programa.

Usamos una clase para representar estudiantes, creamos varios objetos, los guardamos en un arreglo, recorrimos ese arreglo con un ciclo y utilizamos métodos para mostrar información y verificar resultados.

Este es un ejemplo sencillo, pero representa muy bien cómo se construyen programas más completos a partir de conceptos básicos.

Antes de terminar, recuerda estas ideas clave:

* una clase permite representar objetos del mundo real
* el encapsulamiento protege la información
* un arreglo de objetos nos ayuda a trabajar con varios elementos del mismo tipo
* y los ciclos nos permiten recorrer y procesar esos datos

Gracias por acompañarnos en este curso de Fundamentos de Java para Principiantes.
