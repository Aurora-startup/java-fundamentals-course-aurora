# Encapsulamiento y Arreglos de Objetos

Bienvenidos a la lección 9 del curso de **Fundamentos de Java para Principiantes**.

Hasta ahora ya hemos aprendido a trabajar con clases, objetos y métodos. También vimos cómo una clase puede representar algo del mundo real, como un estudiante. Pero cuando nuestros programas empiezan a crecer, aparece una nueva necesidad: **proteger la información** y **trabajar con varios objetos a la vez**.

En esta lección vamos a conocer dos conceptos muy importantes en Java: el **encapsulamiento** y los **arreglos de objetos**.

## Primero, ¿qué es encapsulamiento?

Imagina que tienes una cuenta en una red social. Tú puedes ver tu nombre de usuario, tu foto y tu información, pero no cualquiera debería poder entrar y cambiar tus datos cuando quiera. Tiene sentido que cierta información esté protegida y solo pueda modificarse de forma controlada.

En programación pasa algo parecido.

El **encapsulamiento** consiste en proteger los datos de un objeto para que no puedan ser modificados directamente desde cualquier parte del programa. En Java, esto se logra usando la palabra **`private`** en los atributos de una clase.

Por ejemplo, si tenemos una clase `Estudiante`, podemos declarar sus atributos así:

```java
private String nombre;
private int edad;
private double nota;
```

Eso significa que esos datos pertenecen al objeto y no deberían cambiarse libremente desde afuera.

## Entonces, ¿cómo accedemos a esos datos?

Para eso usamos métodos especiales llamados **getters** y **setters**.

Un **getter** nos permite obtener el valor de un atributo.
Por ejemplo, `getNombre()` devuelve el nombre del estudiante.

Un **setter** nos permite cambiar un atributo de forma controlada.
Por ejemplo, `setNota()` puede actualizar la nota de un estudiante.

Esto hace que nuestro programa sea más ordenado, más seguro y más fácil de mantener.

## Ahora, ¿qué pasa si tenemos más de un estudiante?

Hasta ahora hemos trabajado con un solo objeto a la vez. Pero en la vida real, normalmente no trabajamos con un solo estudiante, sino con varios.

Para guardar varios objetos del mismo tipo, Java nos ofrece una herramienta llamada **array** o **arreglo**.

Un arreglo es una estructura que nos permite almacenar varios elementos en una sola variable. Y esos elementos también pueden ser objetos.

Por ejemplo, podemos crear un arreglo de estudiantes así:

```java
Estudiante[] estudiantes = new Estudiante[3];
```

Con esta línea estamos diciendo que vamos a guardar **tres objetos de tipo `Estudiante`**.

## ¿Cómo llenamos ese arreglo?

Después de crear el arreglo, podemos ir colocando objetos en cada posición:

```java
estudiantes[0] = new Estudiante("Ana", 15, 18);
estudiantes[1] = new Estudiante("Luis", 16, 12);
estudiantes[2] = new Estudiante("Sofía", 15, 9);
```

Cada posición del arreglo guarda un objeto distinto. Aunque todos son estudiantes, cada uno tiene su propia información.

## ¿Y cómo recorremos todos esos objetos?

Para trabajar con todos los elementos del arreglo, usamos un ciclo `for`.

El ciclo nos permite visitar cada posición del arreglo una por una. Así podemos mostrar la información de todos los estudiantes sin repetir el mismo código varias veces.

Por ejemplo, podemos recorrer el arreglo y mostrar los datos de cada estudiante:

```java
for (int i = 0; i < estudiantes.length; i++) {
    estudiantes[i].mostrarInformacion();
}
```

También podemos aprovechar el método `estaAprobado()` para saber si cada estudiante aprobó o no.

De esta manera, combinamos varias ideas importantes:

* una clase llamada `Estudiante`
* varios objetos creados a partir de esa clase
* atributos protegidos con `private`
* métodos para acceder a los datos
* y un arreglo para guardar varios objetos juntos

## ¿Por qué esto es importante?

Porque así es como empiezan a construirse programas más útiles.

Ya no trabajamos con un solo objeto aislado, sino con un pequeño conjunto de datos organizados. Esto nos acerca más a programas reales, como sistemas escolares, registros de usuarios o listas de productos.

En otras palabras, estamos pasando de ejemplos muy pequeños a estructuras que se parecen más a una aplicación real.

## Ideas clave de esta lección

* **Encapsular** significa proteger los atributos de una clase.
* La palabra **`private`** evita que los datos se modifiquen directamente desde fuera.
* Los **getters** y **setters** permiten acceder a los datos de forma controlada.
* Un **arreglo de objetos** permite guardar varios objetos del mismo tipo.
* Un ciclo **`for`** ayuda a recorrer el arreglo y trabajar con cada objeto.

En la siguiente lección usaremos todo esto para construir un pequeño proyecto final: un **sistema de registro estudiantil**, donde aplicaremos clases, objetos, métodos, encapsulamiento y arreglos en un solo programa.

Gracias por acompañarnos en esta lección.
