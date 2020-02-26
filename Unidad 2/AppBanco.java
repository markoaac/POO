import java.util.Scanner;
import javax.swing.JOptionPane;
public class AppBanco{
   public static void main(String [] args){
      Banco b;
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese el nombre");
      String nombre = teclado.nextLine();
      System.out.println("Ingrese el monto inicial");
      float saldoInicial = teclado.nextFloat();
      b = new Banco(saldoInicial);
      b.setNombre(nombre);
      byte opcion = 4;
      do{
         System.out.println("1.Abonar\n2.-Retirar\n3.-Info\n4.-Salir");
         opcion = teclado.nextByte();
         switch(opcion){
            case 1:
            System.out.println("ingresa el monto");
            float monto = teclado.nextFloat();
            System.out.println("Su saldo actual es: " + b.depositar(monto));
            break;
            case 2: 
            System.out.println("ingresa el monto");
            float monto_retirar = teclado.nextFloat();
            System.out.println("Su saldo actual es: " + 
            b.retirar(monto_retirar));
            break;
            case 3:
            System.out.println(b.toString());
            break;

         }
      }while(opcion != 4);
   }
}