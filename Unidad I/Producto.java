public class Producto{
   private String id;
   private String nombre;
   private short existencias;
   
   
   //Encapsulamiento de la variable nombre
   //El m�todo set estable, asigna, brinda el valor a la variable
   public void setNombre(String prod){
      nombre = prod;
   }
   //la funci�n get regresa el valor de la variable
   //en este ejemplo, regresar� el valor de nombre
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