package Object;

public class SongObjGen {

	public static void main(String[] args) {
		
		Song s1=new Song("Kolaveri",5.2,"Dhanush");
		Song s2=new Song("Nooru Swami",4.2,"Vijay Antony");
		Song s3=new Song("Kanna",6.5,"Ram");
		
		s1.detailsOfSong();
		s2.detailsOfSong();
		s3.detailsOfSong();
	}
}
