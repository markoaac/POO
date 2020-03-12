public class Gasolinera{
   //1.- Declarar las variables necesarias
   private float costoMagna;
   private float costoPremium;
   private float litrosMagna;
   private float litrosPremium;
   private float TotalVenta;
   //2.-Los métodos set y get
   public void setCostoMagna(float cm){
      this.costoMagna = cm;
   }
   public float getCostoMagna(){
      return this.costoMagna;
   }
   //costo premium
   public void setCostoPremium(float cp){
      this.costoPremium = cp;
   }
   public float getCostoPremium(){
      return this.costoPremium;
   }
   //Variable litros magna
   public void setLitrosMagna(float lm){
      litrosMagna = lm;
   }
   public float getLitrosMagna(){
      return litrosMagna;
   }
   //Variable litros premium
   public void setLitrosPremium(float lp){
      this.litrosPremium = lp;
   }
   public float getLitrosPremium(){
      return this.litrosPremium;
   }
   //total venta
   public void setTotalVenta(float tv){
      this.TotalVenta = tv;
   }
   public float getTotalVenta(){
      return TotalVenta;
   }
   //3.- Constructor
   public Gasolinera(){
      this.setCostoPremium(21);
      setCostoMagna(19);
   }
   public Gasolinera(float cp){
      setCostoMagna(19);
      setCostoPremium(cp);
   }
   public Gasolinera(float cm, float cp){
      setCostoMagna(cm);
      setCostoPremium(cp);
   }
   //4.- Realizar los métodos que faltan
   public float CalcularTotalMagna(){
      return getCostoMagna() * 
      getLitrosMagna();
   }
   public float CalcularTotalPremium(){
      return getCostoPremium() * getLitrosPremium();
   }
   public float CalcularTotalPagar(){
      float total = CalcularTotalMagna() + CalcularTotalPremium();
      setTotalVenta(total);
      return this.TotalVenta;
   }
   //5.- toString()
   @Override
   public String toString(){
      return "Total de premium: " + CalcularTotalPremium() +
      "\nTotal de Magna: " + CalcularTotalMagna() +
      "\nTotal a pagar: " + CalcularTotalPagar();
   }
   
   
}   