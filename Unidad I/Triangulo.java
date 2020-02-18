public class Triangulo{
   private float base;
   private float altura;
   
   public void setBase(float b){
      base = b;
   }
   public float getBase(){
      return base;
   }
   public void setAltura(float a){
      altura = a;
   }
   public float getAltura(){
      return altura;
   }
   public float getArea(){
      float area = (base * altura)/2;
      return area;
   }
   public float getPerimetro(){
      return getBase() * 3;
   }
   public String getInformacion(){
      String aux = "";
      aux = "El área es: " + getArea() +
         "\n el perímetro es: " + getPerimetro();
      return aux;
   }
}
