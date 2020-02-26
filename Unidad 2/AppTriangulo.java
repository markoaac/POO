import java.util.Scanner;
public class AppTriangulo{
   public static void main(String [] a){
      Scanner teclado = new Scanner(System.in);
      char op = 'N';
      do{
         Triangulo t1 = new Triangulo();
         System.out.println(t1.toString());
         System.out.println("Ingrese el valor de la base");
         float b2 = teclado.nextFloat();
         Triangulo t2 = new Triangulo(b2);
         System.out.println(t2.toString());
         System.out.println("Ingrese el valor de la base");
         float b3 = teclado.nextFloat();
         System.out.println("Ingrese el valor de la altura");
         float a3 = teclado.nextFloat();
         Triangulo t3 = new Triangulo(b3,a3);
         System.out.println(t3.toString());
         System.out.println("¿Desea salir del programa S/N");
         teclado.nextLine();
         op = teclado.nextLine().charAt(0);
      }while(op != 'S');
   
   } 
}