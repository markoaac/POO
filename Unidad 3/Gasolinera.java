public class Gasolinera{
   private float costoMagna;
   public void setCostoMagna(float costo){
     this.costoMagna = costo;
   }
   public float getCostoMagna(){
      return costoMagna;
   }
   private float costoPremium;
   
   public void setCostoPremium(float cp){
             this.costoPremium = cp;
   }
   public float getCostoPremium(){
           return costoPremium;
   }  
   private float litrosMagna;
   public void setLitrosMagna(float lm){
      this.litrosMagna = lm;
   }
   public float getLitrosMagna(){
      return litrosMagna;
   }
   private float litrosPremium;
   public void setlitrosPremium(float litrosPremium){
     this.litrosPremium = litrosPremium;
     }
   public float getlitrosPremium (){
     return litrosPremium;
     } 
     private float TotalVenta;
     public void setTotalVenta (float TotalVenta){
      this.TotalVenta = TotalVenta;
     } 
     public float getTotalVenta (){
      return TotalVenta;
     }
     
     public Gasolinera(){
      //this.costoMagna = 19;
      this.setCostoMagna(19);
      this.costoPremium = 21;
      //this.setCostoPremium(21);
     }
     public Gasolinera(){
        setCostoPremium(21);
        setCostoMagna(19);
     }
     public Gasolinera(float m,float p){
        setCostoPremium(p);
        setCostoMagna(m);
     }
}   