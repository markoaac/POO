import java.util.Scanner;
public class appArreglo{
   public static void main(String [] args){
      Arreglo a = new Arreglo();
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese el tamaño del arreglo");
      int tamanio = teclado.nextInt();
      System.out.println(a.getPromedio());
      //tamanio tiene la dimensión del arreglo
      //¿Cómo se la asigno a mi arreglo de la clase?
   }
}
