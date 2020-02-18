import java.util.Scanner;
public class AppProducto{
   public static void main(String [] a){
      Producto p;
      p = new Producto();
      //cuando el valor no ha sido inicializado
      //de los objetos, su valor es null;
      short e = 40;
      p.setNombre("Sabritas");
      p.setExistencias((short)40);
      p.setExistencias((short)(p.getExistencias()*2));
      short dis = (short)(p.getExistencias() - 50);
      p.setExistencias(dis);
      System.out.println(p.getNombre());
      System.out.println(p.getExistencias());
   }
}