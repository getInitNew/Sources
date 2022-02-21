
public class ExceptionHandlingDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int i,j ,k = 0;
	/*	i =8;
		j= 0;
		try {
			k = i/j;
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero" + e);
		}
		finally {
			System.out.println("Done");
		} */
		i = 7;
		try {
			if(i<15) {
				throw new CreatedException("Exception thrown, please change your input");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done");
		}

	}
	
}

class CreatedException extends Exception{
	public CreatedException(String msg) {
		super(msg);
	}
}

