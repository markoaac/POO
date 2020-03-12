public class Persona{
   private String nombre;
   private byte edad;
   private char sexo;
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   public String getNombre(){
      return this.nombre;
   }
   public void setEdad(byte edad){
      this.edad = edad;
   }
   public byte getEdad(){
      return this.edad;
   }
   public void setSexo(char sexo){
      this.sexo = sexo;
   }
   public char getSexo(){
      return this.sexo;
   }
   //Estructura de una clase
   //nombre de la clase -->ok
   //atributos -->ok
   //métodos set y funciones get --ok
   //constructores-->ok
   //métodos personalizados (opcional)-->ok
   //toString
   public Persona(String nom, byte ed, char sex){
   //       super(        n,        e,      s);
      setNombre(nom);
      setEdad(ed);
      setSexo(sex);
   }
   
   @Override
   public String toString(){
      return "Nombre: " + getNombre() +
      "\nEdad: " + getEdad() + 
      "\nSexo: " + getSexo();
   }
   
}