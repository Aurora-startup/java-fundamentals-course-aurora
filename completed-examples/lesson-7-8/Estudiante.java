/*
Welcome to JDoodle!

You can execute code here in 110+ languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class Estudiante {
  private String nombre;
  private String apellido;
  private int edad;
  private double nota;
  
  public Estudiante(String _nombre, String _apellido, int _edad,double _nota) {
    this.nombre = _nombre;
    this.apellido = _apellido;
    this.edad = _edad;
    this.nota = _nota;
  }
  
  public void mostrarInformacion(){
      System.out.println("Nombre: "+ nombre);
      System.out.println("Apellido: " + apellido);
      System.out.println("Edad: " + edad);
      System.out.println("Nota: " + nota);
  }
  
  public double getNota(){
      return nota;
  }
  
  public void setNota(double notanueva){
      System.out.println("Nota cambiada a: " + notanueva);
      this.nota = notanueva;
  }
  
  public boolean EstaAprobado(){
      return nota>=11;
  }
  
  public static void main(String args[]) {
    Estudiante estudiante1 = new Estudiante("Ana","Maria", 15, 5.5);
    
    estudiante1.mostrarInformacion();
    System.out.println("Aprobado "+estudiante1.EstaAprobado());
    estudiante1.setNota(20.0);
    estudiante1.mostrarInformacion();
    System.out.println("Aprobado "+estudiante1.EstaAprobado());
    
  }
}

