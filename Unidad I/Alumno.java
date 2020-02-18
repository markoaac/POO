public class Alumno{
   private String nombre;
   private String noControl;
   private byte semestre;
   private String carrera;
   private char grupo;
   
   public void setNombre(String n){
      nombre = n;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public void setNoControl(String nc){
      noControl = nc;
   }
   public String getNoControl(){
      return noControl;
   }
   
   public void setSemestre(byte s){
      semestre = s;
   }
   public byte getSemestre(){
      return semestre;
   }
   
   public void setCarrera(String c){
      carrera = c;
   }
   public String getCarrera(){
      if(carrera.equalsIgnoreCase("sistemas")){
         return carrera + "\nSistemas es la mejor";
      }
      else{
         return carrera;
      }
   }
   public void setGrupo(char g){
      grupo = g;
   }
   public char getGrupo(){
      return grupo;
   }
}