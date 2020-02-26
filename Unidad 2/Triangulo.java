public class Triangulo{
   //definición de mis variables
   private float base;
   private float altura;
   private float area;
   //constructor vacío
   public Triangulo(){
      base = 10;
      altura = 20;
   }
   //constructor 1 parámetro
   public Triangulo(float base){
      this.base = base;
      altura=30;
   }
   //constructor 2 parámetros
   public Triangulo(float base, float altura){
      this.base = base;
      this.altura = altura;
   }
   
   public float getArea(){
      this.area = (this.base * this.altura)/2;
      return area;
   }
   @Override
   public String toString(){
      return "El área del triángulo es: " + getArea();
   } 
   
}