

import java.util.Scanner;

class Customer{
	
	String name; // instance variable - null 
	
	int id; //instance variable -- 0
	
	static int i =10;
	
	public String getCustomerNameInUpperCase(){
		
		return name.toUpperCase();
	}
	
	public static void main(String [] args){
		//classname - variblename = new classname 
		
		Customer cust = new Customer(); // we create object 
		
		Scanner scanner = new Scanner(System.in);
		
		
		cust.name = scanner.nextLine();
		cust.id= 1;
		
		
	System.out.println(cust.getCustomerNameInUpperCase());
	
		System.out.println( cust.i);
	
	
	
		
	}
	
}