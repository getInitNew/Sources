import java.util.*;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int i = scr.nextInt();
	//	double ii = scr.nextDouble();
	//	Double jj = ii;
		Integer j = i; //Autoboxing
		System.out.println(j + " Autoboxing Done");
		int k = j; // Unboxing
		System.out.println(k + " Unboxing Done");

	}

}
