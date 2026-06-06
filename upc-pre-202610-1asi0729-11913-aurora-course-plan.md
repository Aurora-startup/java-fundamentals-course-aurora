# Fundamentos de Java para Principiantes

## Resumen del Curso
Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos. ✨**¡No requiere descargas!**✨ Solo abre tu navegador web.

- **Duración total:** ~60 minutos
- **Público objetivo:** Estudiantes de 12 a 17 años sin experiencia en programación
- **Prerrequisitos:** Ninguno
- **Herramientas necesarias:** Navegador web de preferencia (Chrome, Firefox, Safari, Edge) y conexión a internet 

> 📁 **Repositorio de Código Fuente:** https://github.com/Aurora-startup/java-fundamentals-course-aurora

---
## Secuencia de la Lección

### Lección 1: ¿Qué es Java y la Programación? (7 minutos)
- **Descripción:** Aprende qué es la programación y por qué Java es un excelente lenguaje para empezar. Verás cómo abrir Replit y ejecutar tu primer programa sin instalar nada.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link1)
- **Conclusiones clave:**
  - Java se usa para aplicaciones, juegos y mucho más.
  - Los programas son instrucciones para computadoras.
  - `System.out.println("Hola!")` es tu primera línea de código real.
- **Empieza a programar:** [Abrir Replit – Hola mundo](https://replit.com/@your-starter-java)

---

### Lección 2: Variables, Tipos de Datos y Operadores (12 minutos)
- **Descripción:** Aprende a guardar información en variables y a operar con ella. Una variable es como una caja con nombre — primero la llenas, luego haces algo con lo que hay dentro.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link2)
- **Conclusiones clave:**
  - `int`, `String`, `double` son los tipos de datos más usados.
  - Los operadores `+` `-` `*` `/` transforman tus datos.
  - Los valores se escriben directo en el código — sin Scanner todavía.
- **Práctica:** [Clic para programar](https://replit.com/@your-variables-java) ⭐ **¡No es necesario registrarse!**

---

### Lección 3: Decisiones con if-else (10 minutos)
- **Descripción:** Aprende a que tu programa tome decisiones según los datos. El programa decidirá si un estudiante aprobó, está en recuperación o jalló.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link3)
- **Conclusiones clave:**
  - `if / else if / else` permiten múltiples caminos en tu programa.
  - Las condiciones usan operadores de comparación: `>`, `<`, `==`.
  - Ejemplo: `if (nota >= 60) { System.out.println("Aprobado"); }`
- **Práctica:** [Clic para programar](https://jdoodle.com/execute-java-online/your-id) ⭐ **¡Inicio inmediato!**

---

### Lección 4: Bucles — Repetir sin Cansarse (10 minutos)
- **Descripción:** Aprende a repetir acciones automáticamente con bucles. En lugar de escribir lo mismo 30 veces, el bucle lo hace por ti.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link4)
- **Conclusiones clave:**
  - `for` cuando sabes cuántas veces repetir: `for (int i = 0; i < 5; i++)`
  - `while` cuando repites hasta que una condición cambie.
  - Cierre: "Pronto usarás esto para recorrer una lista de objetos."
- **Práctica:** [Clic para programar](https://replit.com/@your-loops-java) ⭐ **¡No es necesario registrarse!**

---

### Lección 5: Métodos — Tu Propio Comando (9 minutos)
- **Descripción:** Crea bloques de código reutilizables con métodos. Como crear un botón personalizado que puedes usar cuantas veces quieras.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link5)
- **Conclusiones clave:**
  - `public static double calcularPromedio(double a, double b) {}`
  - Los métodos reciben parámetros y pueden devolver un resultado.
  - Cierre: "Este método pronto vivirá dentro de un objeto."
- **Práctica:** [Clic para programar](https://onlinegdb.com/@your-methods-java) ⭐ **¡No necesitas registrarte!**

---

### Lección 6: ¿Qué es la Programación Orientada a Objetos? (8 minutos)
- **Descripción:** Antes de escribir código POO, entiende la idea. Sin una sola línea de código — solo ejemplos del mundo real para construir el modelo mental correcto.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link6)
- **Conclusiones clave:**
  - Un objeto tiene **atributos** (nombre, edad, nota) y **comportamientos** (estudiar, calcular promedio).
  - La **clase** es el molde, el **objeto** es el resultado — como el plano de una casa vs la casa real.
  - La **encapsulación** protege los datos: tu PIN del banco existe, pero nadie más puede cambiarlo.
  - Todo lo que aprendiste antes — variables, métodos, if-else — ahora vivirá dentro de objetos.

---

### Lección 7: Clases y Objetos en Java (12 minutos)
- **Descripción:** Llevas la idea del video anterior al código. Crea tu primera clase `Estudiante` y genera objetos a partir de ella.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link7)
- **Conclusiones clave:**
  - `class Estudiante { String nombre; int edad; double nota; }`
  - El constructor inicializa el objeto: `public Estudiante(String nombre, int edad, double nota) {}`
  - `new Estudiante("Ana", 15, 85.0)` crea un objeto real en memoria.
- **Práctica:** [Clic para programar](https://replit.com/@your-classes-java) ⭐ **¡No es necesario registrarse!**

---

### Lección 8: Métodos del Objeto (10 minutos)
- **Descripción:** Agrega comportamientos a tu clase `Estudiante`. El objeto ya no solo guarda datos — ahora también sabe hacer cosas.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link8)
- **Conclusiones clave:**
  - `public void mostrarInfo()` imprime los datos del estudiante.
  - `public boolean estaAprobado()` usa el if-else que ya aprendiste, pero dentro del objeto.
  - Se llama con: `estudiante.mostrarInfo();`
- **Práctica:** [Clic para programar](https://jdoodle.com/@your-methods-oop-java) ⭐ **¡Inicio inmediato!**

---

### Lección 9: Encapsulación y Arrays de Objetos (10 minutos)
- **Descripción:** Protege los datos de tu clase con encapsulación y aprende a manejar listas de objetos con arrays.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link9)
- **Conclusiones clave:**
  - `private` impide el acceso directo a los atributos desde fuera de la clase.
  - Getters y setters controlan cómo se leen y modifican los datos.
  - `Estudiante[] salon = new Estudiante[30];` guarda 30 objetos en un array.
  - El `for` del video 4 cobra su sentido real: recorrer objetos del salón.
- **Práctica:** [Clic para programar](https://onlinegdb.com/@your-encap-java) ⭐ **¡No necesitas registrarte!**

---

### Lección 10: Proyecto Final — Sistema de Registro Estudiantil (15 minutos)
- **Descripción:** Construye un programa completo usando todo lo aprendido. Registra estudiantes, muestra la lista del salón y encuentra el mejor promedio — todo con POO.
- **Enlace:** [Ver la lección](https://www.youtube.com/watch?v=example-link10)
- **Conclusiones clave:**
  - Clase `Estudiante` completa con encapsulación, métodos y constructor.
  - Array de objetos recorrido con `for` para mostrar toda la lista.
  - Aquí sí aparece `Scanner` para que el programa pida datos al usuario.
  - Errores comunes y buenas prácticas para principiantes.
- **Proyecto final:** [Crea tu Sistema de Registro](https://replit.com/@your-final-java) ⭐ **¡Guarda y comparte!**

---

## Recursos Adicionales

- **Código fuente completo:** https://github.com/Aurora-startup/java-fundamentals-course-aurora
- **Todas las actividades prácticas:**

| Número de lección | Actividad | Empezar a programar |
|---|---|---|
| 1 | Hola mundo | [Replit](https://replit.com/@your-lesson1) |
| 2 | Variables y operadores | [Replit](https://replit.com/@your-lesson2) |
| 3 | if-else | [JDoodle](https://jdoodle.com/@your-lesson3) |
| 4 | Bucles | [Replit](https://replit.com/@your-lesson4) |
| 5 | Métodos | [OnlineGDB](https://onlinegdb.com/@your-lesson5) |
| 6 | ¿Qué es POO? | *(solo conceptos — no hay práctica de código)* |
| 7 | Clases y objetos | [Replit](https://replit.com/@your-lesson7) |
| 8 | Métodos del objeto | [JDoodle](https://jdoodle.com/@your-lesson8) |
| 9 | Encapsulación y arrays | [OnlineGDB](https://onlinegdb.com/@your-lesson9) |
| 10 | Proyecto final | [Replit](https://replit.com/@your-lesson10) |

- **Cuestionario:** [Prueba de conocimientos](https://forms.gle/your-quiz)
- **Compartir:** #JavaBeginners

---

**¡Gracias por completar el curso!**

---

## 🏫 Elaboración

## Universidad Peruana de Ciencias Aplicadas
Carrera de Ingeniería de Software <br>
Periodo 202610 <br>
1AS10729 - Desarrollo de Aplicaciones Open Source <br>
NRC 11913

**Nombre del equipo:** Aurora <br>
**Líder del equipo:** Zayd Jaffar Ayasta Martel <br>
**Integrantes del equipo:** 
- Alexandra Yamile Meza Soza
- Joan Fabricio Payano Puchuri
- Juan Sung Jau Wang Chen
- Marcelo Fabio Cuadros Villanueva 

**Fecha de entrega:** 20/06/2026
