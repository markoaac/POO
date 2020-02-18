import java.util.Scanner;
public class AppTrabajador{
   public static void main(String [] args){
      Scanner teclado = new Scanner(System.in);
      Trabajador t = new Trabajador();
      System.out.println("Ingresa el nombre del trabajador");
      String nombre = teclado.nextLine();
      System.out.println("Ingresa el dep del trabajador");
      String dep = teclado.nextLine();      
      t.setNombre(nombre);
      t.setDepartamento(dep);
      
      System.out.println(t.toString());
   }
}