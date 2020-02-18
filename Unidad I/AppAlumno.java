import java.util.Scanner;
public class AppAlumno{
   public static void main(String [] args){
      Alumno a = new Alumno();
      
      Scanner t = new Scanner(System.in);
      
      System.out.println("Ingresa el nombre");
      String nombre = t.nextLine();
      a.setNombre(nombre);
      
      System.out.println("Ingresa No Control");
      a.setNoControl(t.nextLine());
      
      System.out.println("Ingresa el grupo");
      char grupo = t.nextLine().charAt(0);
      a.setGrupo(grupo);
      
      System.out.println("Ingresa la semestre");
      byte semestre = Byte.parseByte(t.nextLine());
      a.setSemestre(semestre);
      
      System.out.println("Ingresa la carrera");
      a.setCarrera(t.nextLine());
      
      
      /*System.out.println("Su nombre es: " + a.getNombre());
      System.out.println("Su NC es: " + a.getNoControl());
      System.out.println("Su Grupo es: " + a.getGrupo());
      System.out.println("Su Semestre es: " + a.getSemestre());
      System.out.println("Su Carrera es: " + a.getCarrera());*/
      
      System.out.println("Su nombre es: " + a.getNombre() +
      "\nSu NC es: " + a.getNoControl() + "\nSu Grupo es: " +
      a.getGrupo() + "\nSu semestre es: " + a.getSemestre() +
      "\nSu Carrera es: " + a.getCarrera());
      
   }
}