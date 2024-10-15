
public class Car implements Cloneable{
   private Tyre tyres[] = new Tyre[4];
   
   public Car(){
      for(int i = 0; i < 4; i++)
         tyres[i] = new Tyre();
   }
   
   public Object clone() throws CloneNotSupportedException{
	      Car c = new Car();
	      c.tyres = tyres.clone();
	      return c;
   }
}
