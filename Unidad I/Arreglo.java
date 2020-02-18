public class Arreglo{
  
   float [] promedios;
   
   public Arreglo(int n){
      promedios = new float[n];
   }
   /*public void setTamanio(int n){
      promedios = new float[n];
   }*/
   
   public float getPromedio(){
      float promedio = 0;
      for(int i = 0; i < promedios.length; i++){
         promedio +=promedios[i];
      }
      return promedio /promedios.length;
   }
}