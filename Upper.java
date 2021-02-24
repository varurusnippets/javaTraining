class Upper{
	
	int i =10;
	
	
	
	class Lower{
		
		int j = 15;
		
		public int getIValue(){
			return i;
		}
		
	}
	
	
	public static void main(String [] args){
		
		Upper u = new Upper();
		 //Upper.Lower l = new Upper.Lower(); // static
		Upper.Lower l = u.new Lower(); // non-static
		
		System.out.println(u.i + "   " +l.getIValue());
		
		
		
	}
	
	
	
}