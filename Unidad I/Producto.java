public class Producto{
   private String id;
   private String nombre;
   private short existencias;
   
   
   //Encapsulamiento de la variable nombre
   //El método set estable, asigna, brinda el valor a la variable
   public void setNombre(String prod){
      nombre = prod;
   }
   //la función get regresa el valor de la variable
   //en este ejemplo, regresará el valor de nombre
   public String getNombre(){
      return nombre;
   }
   public void setExistencias(short exis){
      existencias = exis;
   }
   
   public short getExistencias(){
      return existencias;
   }
}