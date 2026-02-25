package Object;

public class TrainObjGen {

	public static void main(String[] args) {
		
		Train t1=new Train(1204,"Chennai Express",100);
		Train t2=new Train(1605,"Kaveri Express",500);
		Train t3=new Train(1702,"Coimbatore Express",1000);
		
		t1.detailOfTrain();
		t2.detailOfTrain();
		t3.detailOfTrain();
	}
}
