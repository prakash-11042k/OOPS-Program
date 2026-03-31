package Object;

import java.util.Scanner;

public class MainClass6 {

	public static Food getFood(int choice) {
		
		if(choice==1) {
			Biriyani b=new Biriyani();
			return b;
		}
		else if(choice==2) {
			CurdRice c=new CurdRice();
			return c;
		}
		else {
			Parotta p=new Parotta();
			return p;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:");
		int choice=sc.nextInt();
		
		//UpCasting
		Food f=getFood(choice);
		
		if(f instanceof Biriyani) {
			Biriyani b=(Biriyani)f;
			b.details();
		}
		else if(f instanceof CurdRice) {
			CurdRice c=(CurdRice)f;
			c.details();
		}
		else {
			Parotta p=(Parotta)f;
			p.details();
		}
	}
}
