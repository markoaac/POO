public class Alumno extends Persona{
   private String NoControl;
   
   public void setNoControl(String nc){
      this.NoControl = nc;
   }
   public String getNoControl(){
      return NoControl;
   }
   public Alumno(String n, String nc, byte e, char s){
      super(n, e, s);
      setNoControl(nc);
   }
   @Override
   public String toString(){
      String infoClasePrincipal = super.toString();
      String infoClaseHeredada = "\nNo de Control: " +
      getNoControl();
      return "Información de la clase Padre: " +
      infoClasePrincipal + "\nInformación de la clase he: "+
      infoClaseHeredada;
   }
}