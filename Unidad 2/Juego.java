public class Juego{
   private String nombre;
   private int aleatorio;
   
   public Juego(String nombre){
      this.nombre=nombre;
   }
   public void setAleatorio(){
      aleatorio = (int)(Math.random() * 1000);
   }
   public int getAleatorio(){
      return aleatorio;
   }
   @Override
   public String toString(){
      return "El usuario: " + nombre +
      " obtuvo: " + getAleatorio();
   }

}