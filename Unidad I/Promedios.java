public class Promedios{
   float [] listaPromedios = new float[10];
   
   public void setValores(){
      for(int i = 0; i < listaPromedios.length;i++){
         listaPromedios[i] =(float) (Math.random() * 10);   
      }
   }
   public float getMayor(){
      float mayor = listaPromedios[0];
      for(int i = 0; i < listaPromedios.length;i++){
         if(listaPromedios[i] >= mayor)
         {
            mayor = listaPromedios[i];
         } 
      }
      return mayor;
   }
   
   public float getMenor(){
      float menor = listaPromedios[0];
      for(int i = 1; i<listaPromedios.length;i++){
         if(listaPromedios[i] < menor){
            menor = listaPromedios[i];
         }
      }
      return menor;
   }
   
   public float getPromedio(){
      float suma = 0;
      for(int i = 0; i < listaPromedios.length; i++){
         suma += listaPromedios[i];
      }
      return suma / listaPromedios.length;
   }
   
   public boolean buscarNumero(/*como parámetro*/int i){
      boolean bandera = false;
      for(int j = 0; j < listaPromedios.length; j++){
         if((int)(listaPromedios[j])==i){
            bandera = true;
            break;
         }
      }
      return bandera;
   }
   
   public String mostrarElementos(){
      String resultado = "";
      for(int i = 0; i < listaPromedios.length; i++){
         resultado += listaPromedios[i] + "\n";
      }
      return resultado;
   }
   
   public String buscarRepetidos(int nb){
      String salida = "";
      int contador = 0;
      for(int i = 0; i < listaPromedios.length; i++){
         if((int)(listaPromedios[i]) == nb){
            salida = salida + "El n: " + nb + 
            "se encuentra en la pos: " + i+"\n";
            contador++;
         }
      }
      salida += "El num existe: " + contador;
      return salida;
   }
   
   //La función toString() me sirve para poder
   //obtener información del objeto creado
}