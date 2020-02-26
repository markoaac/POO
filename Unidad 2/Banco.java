public class Banco{
   private String nombre;
   private float fondos;
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   public String getNombre(){
      return this.nombre;
   }
   public void setFondos(float fondos){
      this.fondos = fondos;
   }
   public float getFondos(){
      return fondos;
   }
   public float depositar(float dinero){
      /*fondos = getFondos() + dinero;
      setFondos(getFondos() + dinero);
      fondos = fondos + dinero;*/
      fondos += dinero;
      return fondos;
   }
   public boolean validarMontoSuficiente(float dinero){
      if(fondos >= dinero){
         return true;
      }
      else{
         return false;
      }
   }
   public float retirar(float dinero){
      if(validarMontoSuficiente(dinero) == true){
         fondos = fondos - dinero;
      }
      return fondos;
   }
   @Override
   public String toString(){
      return "El usuario: " + 
      getNombre() + " tiene: " + getFondos();
   }
   public Banco(float saldoInicial){
      //fondos = saldoInicial;
      setFondos(saldoInicial);
   }
}