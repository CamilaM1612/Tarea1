
public class Ecuacion
{
   //Atributos
   private double a;
   private double b;
   private double c;
   private double x1, x2, x;
   String mensaje;
   //metodos
   //1er metodo: Calcular el discrimante
   String Discriminante (double a, double b, double c){
      x=((b*b)-4*a*c);
      if (x<0){
        mensaje= ("No tiene solucion");
        }
      else {
         mensaje= ("Si tiene solucion");
      }
      return mensaje;
    }     
   //2do metodo:Encontrar x1 y x2
   double Resultado1 (double a, double b, double c){
      x=((b*b)-4*a*c);
      x1=(-b+Math.sqrt(x))/(2*a);
      return x1;
   }
   double Resultado2 (double a, double b, double c){
       x=((b*b)-4*a*c);
       x2=(-b-Math.sqrt(x))/(2*a);
       return x2;
    }
   //metodo get 
    public double getA(){
      return a;
    }
    public double getB(){
       return b;
    }
    public double getC(){
       return c;
    }
    //metodo set 
    public void setA (double a, double b, double c){
       this.a = a;
       this.b = b;
       this.c = c;
    }
}
