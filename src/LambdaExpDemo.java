

interface Cab{
	void bookcab(String str);
}

/*class Myclass implements Cab{
	public void bookcab() {
		System.out.println("Cab is called");
	}
} */

public class LambdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Myclass c = new Myclass();
	//	c.bookcab();
		Cab c = (source) -> {
			System.out.println("Cab is called from " + source);
		};
		
		c.bookcab("Jammu");

	}

}
