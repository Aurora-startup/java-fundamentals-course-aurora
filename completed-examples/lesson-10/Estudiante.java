// completed-examples/lesson-10/Estudiante.java

public class Estudiante {
private String nombre;
private int edad;
private double nota;

```
public Estudiante(String nombre, int edad, double nota) {
    this.nombre = nombre;
    this.edad = edad;
    this.nota = nota;
}

public String getNombre() {
    return nombre;
}

public int getEdad() {
    return edad;
}

public double getNota() {
    return nota;
}

public void setNota(double nota) {
    this.nota = nota;
}

public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Nota: " + nota);
}

public boolean estaAprobado() {
    return nota >= 11;
}

public static void main(String[] args) {
    Estudiante[] estudiantes = new Estudiante[4];

    estudiantes[0] = new Estudiante("Ana", 15, 18);
    estudiantes[1] = new Estudiante("Luis", 16, 12);
    estudiantes[2] = new Estudiante("Sofía", 15, 9);
    estudiantes[3] = new Estudiante("Carlos", 17, 14);

    int aprobados = 0;
    int desaprobados = 0;

    System.out.println("=== Sistema de Registro Estudiantil ===");

    for (int i = 0; i < estudiantes.length; i++) {
        estudiantes[i].mostrarInformacion();

        if (estudiantes[i].estaAprobado()) {
            System.out.println("Estado: Aprobado");
            aprobados++;
        } else {
            System.out.println("Estado: Desaprobado");
            desaprobados++;
        }

        System.out.println("--------------------");
    }

    System.out.println("Resumen final:");
    System.out.println("Total de estudiantes: " + estudiantes.length);
    System.out.println("Aprobados: " + aprobados);
    System.out.println("Desaprobados: " + desaprobados);
}
```

}
