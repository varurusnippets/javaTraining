class Parent{

	String name;
	
	public Parent(){
		System.out.println("Parent Constructore");
	this.name = "Parent";
	}
	
	public Parent(String customName){
		System.out.println("Parent parameterized Constructore");
		this.name = customName;
	}
	
	
	public String getSurname(){
	
		return name;
	}
	
	public static void main(String [] args){
		
		Parent p = new Parent();
		System.out.println(p.getSurname());
		
		
	}











}