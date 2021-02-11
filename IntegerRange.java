public class IntegerRange{
	
	public static void main(String [] args){
		
		short s = 32767;
		
		System.out.println(s);
	

		//unary operator
		
		int i =10;
		
		
		
		System.out.println("i++ "+ i++); 
		
		System.out.println("++i "+ ++i); 


		boolean b = false;
		
		System.out.println(" negation operator " + !b);
		
		
		int j =20;
		
		if( j % 2 ==1){
			System.out.println("Odd Number");
		}else{
			System.out.println("Even Number");
		}
		
		String st = j %2 ==1 ? "Odd Number" : "Even Number";
		
		System.out.println(" the number is " + st);
		
		
		//ShiftOperator
		
		
		System.out.println(10<<2);
		
		int weekday = 9;
		
		if( weekday ==1){
			System.out.println("Monday");
		}else if( weekday ==2){
			System.out.println("Tuesday");
		}else if( weekday ==3){
			System.out.println("Wednesday");
		}else if( weekday ==4){
			System.out.println("Thursday");
		}else if( weekday ==5){
			System.out.println("Friday");
		}else if( weekday ==6){
			System.out.println("Saturday");
		}else if( weekday ==7){
			System.out.println("Sunday");
		}else{
			System.out.println("Invalid Input");
		}
		
		switch(weekday){
			
			case 1: System.out.println("Monday"); break;
			case 2 :System.out.println("Tuesday");break;
			case 3 :System.out.println("Wednesday");break;
			case 4 :System.out.println("Thursday");break;
			case 5 :System.out.println("Friday");break;
			case 6 :System.out.println("Saturday");break;
			case 7 :System.out.println("Sunday");break;
			default: System.out.println("Invalid Input");
			
		}
		
		
		for(int p= 0; p<10; p++){
			System.out.print(p + " ");
		}
		System.out.println("");
		for(int p =10; p>0; p--){
			System.out.print(p + " ");
		}
		System.out.println("");
		int p=0;
		while( p<10){
			System.out.print(p + " ");
			p++;
			
		}
		System.out.println("p value" + p); // 10
	
		do{
			System.out.print("do while " + p);
			
			
		}while(p<10);
		
		int arr[] = { 1,3,4,6,7,9};
		
		for( int a : arr){
			System.out.println(a);
		}
		
		String str = " abccdefggggg";
		char temp = ' ';
		
		for( char ch : str.toCharArray()){
			
			if (temp != ch){
				System.out.print(ch);
			}
			temp = ch;
		}
		
	
	}
	
}