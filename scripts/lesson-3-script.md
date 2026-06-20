Buenos días, buenas tardes, buenas noches.
Bien, vamos a empezar con la tercera clase. Vamos a ver cosas básicas y sencillas. Por ejemplo, vamos a ver lo que sería nuestro primer “Hola mundo”, que digamos que ya es una especie de ritual o una tradición: lo primero que hacemos es declarar nuestro “Hola mundo”.
Esto en sí nos enseña, o nos va a servir para aprender, cómo imprimimos algo en la consola. ¿Cómo imprimimos algo en el sistema? Cuando ejecutamos algo y queremos que el sistema nos diga básicamente, o nos dé un mensaje, usamos justamente la función que vamos a aprender al momento de aplicar este “Hola mundo”.
También explicaré en esta lección lo que son los tipos. Vamos a ver los tipos básicos para declarar variables y también las operaciones simples: suma, resta, multiplicación y división.
Bien, con ello dicho, empezamos.
Primero que nada, para el “Hola mundo”. Aquí voy a poner, por ejemplo, esto lo que está haciendo es comentar.
Bien, para comentar solamente tenemos que poner doble slash. Esto, y lo que sea que imprimamos acá, el código o el programa no lo va a leer, lo va a ignorar. Así que es bueno para poder usarlo al momento de, digamos, poner cuál es el resultado de lo que sea que esté haciendo. Quiero saber qué hace una función o qué es lo que estaba pensando en ese momento. Lo comento y ya está, no va a molestar en nada al código.
Bien, esto sería el primer “Hola mundo”, nuestra primera entrada a lo que es la programación como tal, a usar código.
Bien, explicando esto, el IO viene a ser una abreviación de lo que sería el system out, que es decirle al sistema que voy a hacer algo de salida. Una función dentro de esto sería el println, que es imprimir línea.
Y todo lo que sea que esté dentro de la función println, bueno, dentro de estos paréntesis que declaran su inicio y su fin, va a ser impreso: variable, número o texto. En este caso ha sido texto. Y para identificar bien el texto de un número suelto, por ejemplo, van a ser las dobles comillas. Lo que se escribe entre dobles comillas es texto y explicaré por qué esto es importante en un rato, cuando hablemos de los tipos.
Otra cosa a destacar es el uso de puntos y comas.
En Java se usa punto y coma para declarar el fin de una línea de código. Esto es bueno porque, si no, si escribiera algo más, les digo, si digamos esto es una línea de código que ejecuta algo, si no hubiera punto y coma, así lo declararía el sistema, así lo vería. Y pues esto es un error, porque al estar juntos puede llegar a pensar que es un error de sintaxis o un error en general te va a dar, por lo cual es buena idea siempre usar puntos y comas al final.
Bien, ahora hablando de los tipos, vamos a empezar con uno fácil y básico, que es el String.
Bien, ¿qué es el String? Para decirlo simple, es una cadena de texto. Son letras, puede ser desde una letra hasta una oración, hasta un párrafo o hasta un libro.
String es eso. Almacena lo que va a ser solamente texto. Por ejemplo, en este caso va a ser el nombre. Y ahora lo imprimimos. Ah, es lo que dije: punto y coma para que no haya errores.
Bien, ahora explicando el código, ¿qué dice acá? Simple. Esto es algo bastante importante también: la declaración de una variable.
¿Cómo se declara una variable? Simple. Primero declaramos el tipo de la variable. En este caso, como va a ser un texto, lo que quiero almacenar va a ser String.
Luego el nombre de la variable, en este caso nombre. Hay que tratar de ser descriptivos con el nombre de la variable, porque si construimos un sistema más complejo, si tiene nombres poco indicativos, puede llegar al final a marearte. Si luego lo ves y quieres modificar cosas, vas a ver nombres raros, no vas a saber de qué son y te puedes llegar a marear.
Este es el símbolo de asignación. Con esto le indicamos al sistema: quiero asignarle un valor a mi variable.
Y finalmente, el valor a asignar. Como es un texto, es entre comillas.
¿Por qué entre comillas? Pues porque básicamente, si no fuera entre comillas, sería algo declarado del sistema. Y bueno, por lo general, por ejemplo, los números así tal cual se declaran sin comillas, a diferencia de los textos.
Por eso es que se tiene que hacer así. Es más que nada para que el sistema diferencie algo que has construido, porque puedes construir tipos para usarlos. Justamente para evitar ese error, es buena idea diferenciarlo con comillas.
Bien, lo bueno de la variable es eso: le puedo cambiar el nombre acá, a cualquier valor, y se va a imprimir igualmente.
Bien, esto es hablando del String. Ahora vamos a ver el Integer y el Double.
¿Qué son los integers y qué son los doubles? Pues es algo más sencillo. El integer o entero es eso: es un número entero. Y el double, aunque su nombre puede indicar que sea un número doble, lo cual sería algo raro, no es eso. También es un número, pero esta vez es otro tipo de número. Esto se va a diferenciar más al momento de usarlo.
Por ejemplo, tengo el número 10. Quiero imprimirlo así tal cual, 10 suelto. Ahora, justamente aquí entra lo que dije de los strings: si lo pongo entre comillas, esto ya es un texto; esto es un entero. Si trato de compilarlo, no va a poder porque son tipos distintos. Así que hay que tener bastante cuidado también con la declaración de estos.
Bien, al ser un número cumple con las funciones básicas de la matemática usual. Si sumo 10 + 5, va a ser 15, y así. Cosa que no cumple con los textos. Si quisiera sumar un texto, eso lo voy a hablar cuando hablemos de las operaciones.
Bien, ahora, ¿cuál es la diferencia entre un entero y un double?
Hablando técnicamente, el double lo que hace también es almacenar más cantidad. Puedes usar un número más grande, digamos, o que pesaría más. Pero no solamente es eso, sino que double acepta números decimales.
Acepta números decimales. Puedes usar el 10.5 y lo va a aceptar normal, cosa que, por ejemplo, con un entero no te va a permitir porque para eso ya está el tipo double.
Los dos luego al final terminan siendo casi lo mismo, pero, por ejemplo, si quieres dividir números, a veces lo mejor es usar double, porque en caso de que te vayan a salir decimales puede llegar a comerse un valor.
Bien, veremos un ejemplo de eso ahora mismo porque vamos a hablar de las operaciones básicas: suma, resta, multiplicación y división.
Para centrarnos más, la suma y la resta son lo mismo que en la matemática usual. Lo único que cambia son los símbolos de la multiplicación y la división. En la multiplicación y división pasan a ser asterisco y slash: asterisco para multiplicación, slash para dividir.
Bien, de ahí es exactamente lo mismo. Si sumas un número, se suma un número, no hay que darle vueltas.
Por ejemplo, vamos a hacer esto. Para ser más genérico, otra vez voy a hacer int a, que sea tres. Int b, que sea igual a dos.
Esto puede ser, por ejemplo, a + b. Simple, cinco. Ya está. Nada raro por el momento.
Lo mismo va a pasar si podemos restar. Ahora, para poder imprimir valores, podemos hacer esto directamente acá con lo que quiero. O también podría tener una nueva variable que guarde el resultado de la operación.
Cualquiera de los dos es válido. Yo en este caso voy a hacerlo así porque si no, esto tendría que estar cambiando el tipo también de la variable y demás.
Bien. Ahora, esto es justamente de lo que vamos a hablar con las diferencias. Por ejemplo, entero. ¿Qué pasa si divido un entero entre otro entero? Pues 3 / 2 tendría que ser 1.5.
Como son enteros, lo que va a imprimir el sistema es uno. Va a devolver el mismo tipo de la operación, que es uno. ¿Por qué es uno? Porque es un entero. Los enteros no aceptan decimales, así que esa parte decimal no la imprimen, no la asumen, solamente la parte entera. Así que se queda como uno.
Pero, en cambio, si cambiara la declaración a que sean doubles, ahí sí se ve. Para este tipo de operaciones más complejas, como son la división y la multiplicación, en las cuales puede llegar a aparecernos valores decimales, lo usual es usar este tipo de variable: el double.
Ahora, como un extra, añadiré lo que sería la explicación sobre el orden jerárquico.
Como sabemos, en la matemática usual hay un orden de operaciones. Por ejemplo, las multiplicaciones se van a ejecutar siempre antes que sumas o restas.
Y en este caso, si son operaciones de la misma jerarquía, digamos, quiero sumar un número, restar otro número, sumar otro número, o sea, algo así como que quiero hacer un más, un menos, un más, un menos, lo que va a hacer el sistema es leer de izquierda a derecha.
Lo mismo pasa con la multiplicación y división, lo cual puede llegar a generar algún error si no hemos organizado bien la jerarquía.
Esto es bastante simple y lo voy a demostrar con este ejemplo, declarando una tercera variable que en este caso sea otra vez dos, pongámosle.
Bien, yo lo que voy a hacer es esto.
¿Qué pasa si hago A + B dividido C? El resultado simple debería salir primero la operación de mayor jerarquía: B entre C.
B entre C es 2 / 2, que da 1. Luego 1 + 3 da 4. En teoría, lo que debería salir sería 4.
En efecto, sale cuatro. Pero, ¿qué pasa si yo quiero que no se ejecute primero la división? Quiero que se ejecute primero la suma. Simple, igual que en la matemática usual, lo puedo agrupar usando los paréntesis.
De esta forma se va a ejecutar primero la suma y luego la división, haciendo que cambie el resultado de la operación.
Bien. También lo que les debía: la suma de strings, cómo se comporta la suma de los textos.
Porque sí, los textos tienen esta propiedad del String que nos permite sumarlos. Es simple. Por ejemplo, 3 + 2. Si fueran números nos debería salir cinco. Y aquí supuestamente debería salir cinco si fueran números, pero no son números, son textos.
¿Qué pasa si son textos? Pues simple, se juntan: 3 + 2 da 32.
¿Por qué? Porque es texto, no son números. Es un texto de tres y un texto de dos. Si le pongo un espacio, por ejemplo, aquí tres espacio dos, ahí está: 3 espacio 2. Lo mismo si pongo esto: 3 slash espacio 2.
Eso es una particularidad de la suma al momento de usar valores de texto.
Bien, nos vemos en la siguiente clase, que tendría que ser las condicionales.