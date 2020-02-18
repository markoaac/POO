import java.util.Scanner;
public class AppPromedios{
   public static void main(String [] args){
      Scanner teclado = new Scanner(System.in);
      Promedios p = new Promedios();
      p.setValores();
      System.out.println("Mayor: " + p.getMayor());
      System.out.println("Menor: " + p.getMenor());
      System.out.println(p.mostrarElementos());
      System.out.println("Ingrese un número a buscar");
      int num = teclado.nextInt();
      if(p.buscarNumero(num) == true){
         System.out.println("El número si existe");
      }
      else{
         System.out.println("El número no existe");
      }
      System.out.println("Ingrese el número a buscar");
      int nb = teclado.nextInt();
      System.out.println(p.buscarRepetidos(nb));
   }
}
