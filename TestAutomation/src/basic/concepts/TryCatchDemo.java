package basic.concepts;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
		int x = 10;
		int y = 0;
		int z = x/y;
		System.out.println(z);
	}
	catch (Exception e) {
		System.out.println("y-value should not be zero");
	}
		finally {
			System.out.println("Demo exception Handling");
		}
		}

}
		
