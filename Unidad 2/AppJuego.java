import java.util.Scanner;
public class AppJuego{
   public static void main(String [] ags){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingresa el nombre del primer jugador");
      String n1 = teclado.nextLine();
      System.out.println("Ingresa el nombre del segundo jugador");
      String n2 = teclado.nextLine();
      Juego j1 = new Juego(n1);
      Juego j2 = new Juego(n2);
      j1.setAleatorio();
      j2.setAleatorio();
      if(j1.getAleatorio() <= j2.getAleatorio()){
         System.out.println("Gana j2: " + j2.toString());
      }
      else{
         System.out.println("Gana j1: " + j1.toString());
      }
   }
}