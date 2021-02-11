public class Test{
/**
* This is my first main method.
*/
	public static void main(String[] args){
		
		//Customer cust = new Customer();
		 int i = 10; // stack
		
		String st = new String ("abc"); // heap, st == stack
		
		System.out.println(" class loader "+ Test.class.getClassLoader());
	}

}