// given an array, print sum of elements

// {1,4,5,8,3,5,2,9}  -- 37

class Array{
	
	
	
	
	
	public static void main(String [] args){
		
		int[] arr ={1,4,5,8,3,5,2,9}; // initialization of array.
		int sumValue = 0;
		//index
		for( int i =0; i<arr.length; i++){
			
			sumValue = sumValue + arr[i];
			
		}
		
		//element
		//for(int ele : arr){ // for Each 
			
			//sumValue += ele; // sumValue = sumValue+ele;
			
		//}
		System.out.println(sumValue);
		
		
		int i =10;
		
		process(i);
		
		System.out.println(i); // 10 or 20
		System.out.println("Before");
		for(int j :arr){
			System.out.print(j +",");
		}
		process(arr);
		System.out.println("After");
		for(int j :arr){
			System.out.print(j +",");
		}
		
	}
	
	
	//pass by value
	public static void process(int i){
		
		i = 20;
		
		System.out.println(" Inprocess method");
	}
	//pass by reference
	public static void process(int[] arr){
		
		arr[0] = 5;
		arr[1] =5;
		arr[2]=5;
		
	}
	
	
}