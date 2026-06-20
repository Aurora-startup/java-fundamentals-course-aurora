Bien, buenos días, buenas tardes, buenas noches.
Esta vez, en la clase número cuatro, lo que veremos van a ser las condicionales.
Bien, ya habiendo visto lo anterior, podemos declarar bastantes cosas. De hecho, con las condicionales que vamos a ver ahora también podremos hacerlo.
Ahora, ¿para qué sirve justamente una condicional? Pues, ¿qué pasa si a partir de una variable quisiera que, dependiendo del valor de esa variable, el sistema o el código me devuelva un resultado o me devuelva otro?
Por ejemplo, el caso más fácil de aplicación y más común sería el de las notas. Para las notas se necesita una nota mínima para aprobar. Todo lo que esté por encima de esa nota mínima es aprobatorio y lo que esté por debajo es jalado o desaprobado.
Bien, para esto vamos a seguir esta estructura. Esta sería la estructura simple: if y justamente el paréntesis, que significa que va a estar la condición o lo que va a establecer la condición. Es decir, si esa condición es verdadera o es falsa. Y los corchetes, que indican qué hacer a continuación.
También, digamos, si no se cumpliera este caso, lo que vamos a poner va a ser un valor por defecto. En caso de que no se cumpla la condición, quiero que me devuelva otra cuestión por default.
Esto lo voy a tener así.
Bien, siguiendo lo que dije del caso de las notas, vamos a declarar y vamos a ponernos en el caso de que la nota mínima aprobatoria sea 11.
Bien, esta vez voy a establecer la nota como número 12. Y aquí vamos con lo que es la condición.
Ahora, lo primero que quiero que me imprima es el estado de aprobado. Si la nota es mayor a 12, quiero que se apruebe. En caso contrario, quiero que imprima desaprobado.
Bien. Ahora, tal vez la pregunta debe ser: entonces, ¿cómo lo declaro?
Pues es bastante simple. Igual que comparamos números en la matemática normal, en este caso tenemos el mayor que, menor que y aquí hay algo muy especial: el doble igual.
¿Qué quiere decir el doble igual? Pues es básicamente decirle al sistema que compare dos valores y me devuelva si son iguales. Si son iguales me va a decir: “Sí, en efecto son iguales”. Y se va a mandar a este camino, que es el caso en el que la condición sea verdadera.
Hablando de eso, la condicional acá nos va a devolver uno de dos estados: verdadero o falso.
En caso de que sea verdadero, va a irse por esta ruta, va a ejecutar esto, va a imprimir aprobado, va a saltar el resto y luego va a continuar.
En cambio, si sale que es falso, obviamente no va a ejecutar esto y se va a saltar a la otra ruta. Luego va a seguir normal con el código.
Bien, usando estos operadores también tenemos variaciones, como por ejemplo, juntando el doble igual, el mayor igual y el menor igual.
Bien, pongamos la condición
Creo que si la nota es mayor a 11, entonces en ese caso lo que quiero que me imprima el sistema es aprobado.
Vamos a probar el código. Nos ha faltado justamente lo que había dicho en la primera sección, la clase número tres: poner puntos y comas para que no haya errores.
Bien, como se ve, la nota es 12, así que como es verdadero, esta condición se cumple. Va a ejecutar este camino, va a imprimir y va a evitar esto. Ya no lo va a considerar y no lo va a imprimir.
Pero si lo cambiara de valor, ahora va a ser falso. La nota ya no es mayor, pues se va a ir por la otra ruta: el desaprobado.
Esto nos abre camino a bastantes tipos de comparaciones. Por ejemplo, también podría comparar letras o textos. Si el texto que yo quiero recibir es un “sí”, podría poner una condición: if texto es igual al texto que yo quiero, imprimir esto; si no, imprimir lo contrario.
Sirve para bastantes casos.
Ahora, ¿qué pasa si quiero que se ejecute una condición más? Digamos, no pongo esta como mi condición primaria. ¿Qué pasa si quiero que se ejecute otra condición?
Pues podría volver a hacer esta estructura, ¿verdad? Podría hacerlo acá, otro if. Bien, podrías, pero eso al final terminaría estructurando demasiado el código.
Si te has dado cuenta, cada vez que dentro de un if se añade un espacio para justamente diferenciar. Si hiciera eso, vamos a terminar teniendo un montón de espacios si quisiera seguir poniendo condiciones.
Así que existe felizmente esta función: else if. Else if es solamente eso: si no se cumple el primer caso, pero quiero una segunda condición, ahí la tengo.
Es bastante sencilla la declaración. Por ejemplo, vamos a empezar acá arriba. Aquí tengo mi primera condición, digamos.
Y a esto solamente le voy a agregar un else if. Si no se cumple esta primera condición, va a analizar esta segunda. Y en caso se cumpla, pues ahí está.
Ahora voy a poner esto. Acá está la nota mayor a 11. Y digamos que aquí pongo una nota mayor a 18.
¿Por qué quiero esto? Porque digamos que quiero que sea aprobado con excelencia.
Acá solamente el clásico aprobado.
Ahora, ¿por qué pongo esto? Simple, porque lo que pienso enseñar con este código de ejemplo es que hay que tener bastante en cuenta el orden de la declaración.
Por ejemplo, aquí no verías nada raro, ¿verdad? Si la nota en este caso vamos a poner que es 20. Si la nota es mayor que 18, debería imprimirse aprobado con excelencia.
Pues a ver, lo vamos a compilar.
Resulta que está todo aprobado. ¿Por qué? Por lo que dije. Si va a tomar una condición, solamente va a seguir esa ruta y va a descartar el resto.
En este caso, lo primero que lee es esto: si la nota es mayor que 11, imprime aprobado. La nota es mayor que 11, 20 es mayor que 11. Así que se va por esta ruta, ignora el resto y ya.
Pero claro, yo quería que se leyera esto. Entonces, ¿qué hago? Pues simple, lo cambio de orden.
Y ahora sí va a hacer eso. Pero si lo cambio aquí de nota a 14, va a tomar esta ruta.
Es importante justamente tener esto en orden porque puede llegar a generar errores. Hay que tener en cuenta si se va a englobar un caso que sea de atrás para adelante.
Por ejemplo, este caso de mayor que 11 también engloba el mayor que 18. Todo número mayor que 18 es mayor que 11. Pero no todo número mayor que 11 es mayor que 18. Así que hay que tener mucho cuidado con ese orden.
También, ¿por qué no? Hablemos de los iguales.
En este caso hay mayor, pero ¿qué pasa si pongo 11?
Sale desaprobado porque no cabe con ninguna de estas condiciones. Pero yo quisiera una tercera condición. Como vemos, se pueden apilar condiciones. En este caso, que sea aprobado justo.
Ahí está una condición más apilada con el igual.
Ahora, estas dos condiciones las podría unir. ¿Cómo las podría unir? Simple, con lo que dije: con mayor o igual. Esto lo pongo con mayor o igual, copio esto y elimino esta condición que había puesto.
Ahora, cuando es 11 va a mandar esto, y también cuando sea mayor que 11 pero menor que 18 también va a mandar esto. Ya en caso de que sea un 10, que es jalado, ahí sí va a mandar desaprobado.
Bien, todo esto sería por mi parte lo que son condicionales. La siguiente lección será de bucles.