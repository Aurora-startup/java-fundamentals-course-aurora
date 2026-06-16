# Introducción a la Programación Orientada a Objetos

Bienvenidos a la segunda lección del curso de **Fundamentos de Java para Principiantes**. Ahora que ya sabemos qué es programar y qué es Java, vamos a hablar de uno de los conceptos más importantes de este lenguaje: la **Programación Orientada a Objetos**, también conocida como **POO**.

## Primero, ¿qué es un objeto?

Miren a su alrededor. Todo lo que ven puede considerarse un objeto: su computadora, su celular, su cama o incluso ustedes mismos.

Cada uno de estos objetos tiene dos características principales:

* **Atributos**, que describen cómo es el objeto.
* **Comportamientos**, que describen lo que puede hacer.

Por ejemplo, imaginemos un automóvil.

Un automóvil puede tener atributos como:

* Color: rojo
* Marca: Toyota
* Velocidad: 0 km/h

Y también puede tener comportamientos como:

* Encender
* Acelerar
* Frenar
* Apagar

La Programación Orientada a Objetos consiste precisamente en representar objetos del mundo real dentro de nuestros programas utilizando código.

## Entonces, ¿qué es una clase?

Antes de construir una casa, necesitamos un plano. De manera similar, antes de crear un objeto, necesitamos una plantilla que indique cómo será.

Esa plantilla se llama **clase**.

Una clase define qué atributos y comportamientos tendrán los objetos que creemos a partir de ella.

Por ejemplo, podríamos crear una clase llamada **Automóvil**.

Esta clase indicaría que todos los automóviles tendrán atributos como color, marca y velocidad, además de comportamientos como acelerar y frenar.

## ¿Y qué es un objeto?

Un objeto es una instancia de una clase.

Suena complicado, pero en realidad es muy sencillo.

Si la clase es el plano de una casa, el objeto es la casa ya construida.

Por ejemplo, a partir de la clase **Automóvil** podríamos crear:

* Un Toyota rojo.
* Un Honda azul.
* Un Nissan negro.

Todos son automóviles, pero cada uno tiene características diferentes.

## ¿Qué tiene que ver Java con todo esto?

Java fue diseñado para trabajar principalmente con Programación Orientada a Objetos.

De hecho, casi todo lo que hacemos en Java gira alrededor de clases y objetos.

Cuando desarrollamos una aplicación en Java, normalmente creamos clases para representar elementos del mundo real.

Por ejemplo, aquí tenemos una clase llamada **Perro** escrita en Java, que representa a un perro de la vida real.

```java
public class Perro {
    // Características (Atributos)
    String nombre;
    String raza;
    int edad;

    // Acción (Método)
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }
}
```

Esta clase posee atributos como el **nombre**, la **raza** y la **edad**, además de comportamientos como **ladrar**.

Como puedes ver, estamos utilizando código para representar algo que existe en el mundo real.

De la misma manera, podemos crear clases para muchos otros tipos de objetos:

* Un videojuego puede tener clases como Jugador, Enemigo y Arma.
* Una tienda virtual puede tener clases como Producto, Cliente y Pedido.
* Una red social puede tener clases como Usuario, Publicación y Comentario.

Gracias a la Programación Orientada a Objetos, podemos organizar mejor nuestro código, hacerlo más fácil de entender y reutilizar componentes sin tener que escribir todo desde cero.

Más adelante en el curso aprenderemos cómo crear una pequeña clase que represente un objeto de nuestra vida cotidiana. Pero por ahora, en la siguiente lección, crearemos nuestro primer programa **"Hola Mundo"** y escribiremos nuestras primeras líneas de código en Java.