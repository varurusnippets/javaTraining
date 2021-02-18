class Child extends Parent{

	String fname;
	
	
	public Child(){
		System.out.println(" Child Constructore");
		fname = "Child";
		
	}
	
	public Child(String fname){
		super("abcd");
		this.fname = fname;
	}
	
	public static void main(String [] args){
	
		
		
		
		Child c = new Child("aaaaaaa"); // valid statement //run time polymorphism
		
		
		System.out.println(c.fname);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}