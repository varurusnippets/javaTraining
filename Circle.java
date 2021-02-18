class Circle implements Shape{
	
	public void draw(){
		System.out.println("In Circle");
	}
	
	public static void main(String [] args){
		
		Shape s = new Circle();
		s.draw();
	}
	
}