abstract class DBConnection{
	
	
	public void getConnection(){
		
		System.out.println(" in Dbconnection");
		
		
	}
	
	public abstract void executeQuery(String query);
	
}