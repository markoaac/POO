//Opcional: declarar librerías cuando haga falta
import java.util.Scanner;
//1.-Declarar la clase;
public class AppGasolinera{
   //2.-Método main
   public static void main(String [] a){
      //3.- Declarar objetos
      Scanner teclado = new Scanner(System.in);
      Gasolinera g1 = new Gasolinera();
                 //-->Es el constructor
      System.out.println(g1.toString());
      System.out.println("Ingresa el numero de litros magna");
      float nlm = teclado.nextFloat();
      System.out.println("ingresa el numero de litros premium");
      float nlp = teclado.nextFloat();
      g1.setLitrosMagna(nlm);
      g1.setLitrosPremium(nlp);
      System.out.println("Informacion: " + g1.toString());
      
      System.out.println("Ingresa el costo de premium");
      float cp = teclado.nextFloat();
      Gasolinera g2 = new Gasolinera(cp);
      System.out.println("Ingresa el numero de litros magna");
      nlm = teclado.nextFloat();
      System.out.println("ingresa el numero de litros premium");
      nlp = teclado.nextFloat();
      g2.setLitrosMagna(nlm);
      g2.setLitrosPremium(nlp);
      System.out.println("Informacion: " + g2.toString());
      
       System.out.println("Ingresa el costo de premium");
      cp = teclado.nextFloat();
      System.out.println("Ingresa el costo de magna");
      float cm = teclado.nextFloat();
      Gasolinera g3 = new Gasolinera(cm, cp);
      System.out.println("Ingresa el numero de litros magna");
      nlm = teclado.nextFloat();
      System.out.println("ingresa el numero de litros premium");
      nlp = teclado.nextFloat();
      g3.setLitrosMagna(nlm);
      g3.setLitrosPremium(nlp);
      System.out.println("Informacion: " + g3.toString());
      

   }
}