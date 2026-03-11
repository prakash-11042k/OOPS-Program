package Object;

public class Database {

	private String vender="Oracle";
	private int total_tables=5;
	private static Database db=null;
	
	public static Database getDatabaseObj() {
		
		if(db==null) {
			db=new Database();
		}
		return db;
	}
}
