 class Test1 extends Test2{
	
	
	public static void main(String[] args){
		
		final int i =10;
		
		//i =11;
		
		System.out.println(i);
		
		Test1 test1 =  new Test1();
		
		long result = test1.factorial(18L);
		
		System.out.println(test1.count);
		
		Test1 test2 =  new Test1();
		
		test2.factorial(2L);
		System.out.println(test2.count);
	}
	
}

class Test2{
	
	 static int count = 0;
	
	public long factorial(long n){
		
		if( n == 1){
			count++;
			return 1;
		}
		count++;
		return n * factorial(n-1);
			
	}
	
	public long factorial1(long n){
		
		long result = 1;
		
		for(long i =1; i<= n; i++){
			
			result *= i;
		}
		
		return result;
	}
	
	
}