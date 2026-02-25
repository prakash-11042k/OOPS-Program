package Object;

public class Train {

	int train_no;
	String name;
	int total_passenger;
	static String country="India";
	
	public Train(int t_no,String tittle,int total) {
		train_no=t_no;
		name=tittle;
		total_passenger=total;
	}
	
	public void detailOfTrain() {
		
		System.out.println("Train No:"+train_no);
		System.out.println("Train Name:"+name);
		System.out.println("Total Passengers in train:"+total_passenger);
		System.out.println("It is from:"+country);
		
		System.out.println("**************************");
	}
}
