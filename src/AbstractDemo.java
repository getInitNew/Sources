
abstract class Vehicle {
		  public abstract void vehiclemodel(String str);

		}

class Anon extends Vehicle {
		  public void vehiclemodel(String str) {
		    System.out.println("I love this " + str + " model");
		  }
		}
		
public class AbstractDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Anon car = new Anon(); 
	    car.vehiclemodel("Toyota");


	}

}
