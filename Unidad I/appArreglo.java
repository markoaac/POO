import java.util.Scanner;
public class appArreglo{
   public static void main(String [] args){
      Arreglo a = new Arreglo();
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese el tama�o del arreglo");
      int tamanio = teclado.nextInt();
      System.out.println(a.getPromedio());
      //tamanio tiene la dimensi�n del arreglo
      //�C�mo se la asigno a mi arreglo de la clase?
   }
}
