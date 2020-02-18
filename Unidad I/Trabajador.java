public class Trabajador{
   private String nombre;
   private String Departamento;
   
   public void setNombre(String n){
      nombre = n;
   }
   public String getNombre(){
      return nombre;
   }
   
   public void setDepartamento(String d){
      Departamento = d;
   }
   
   public String getDepartamento(){
      return Departamento;
   }  
   
   @Override
   public String toString(){
      return "El nombre del trabajador es: " + 
      nombre + "\nEl departamento es: " + getDepartamento();
   } 
}