class OracleDBConnection extends DBConnection{
	
	
	public void executeQuery(String query){
		
		System.out.println("In oracle way");
	}
	
	public static void main(String [] args){
		
		DBConnection db = new DBConnection();
		
		db.executeQuery("adfafddsfa");
		
	}
	
}