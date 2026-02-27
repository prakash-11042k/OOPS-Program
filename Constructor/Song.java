package Object;

public class Song {

	String tittle;
	double duration;
	String singer;
	static String language="Tamil";
	
	public Song(String tittle,double duration,String singer) {
		this.tittle=tittle;
		this.duration=duration;
		this.singer=singer;
	}
	
	public void detailsOfSong() {
		
		System.out.println("Song Name:"+tittle);
		System.out.println("Song Duration:"+duration);
		System.out.println("Song Singer:"+singer);
		System.out.println("Song Language:"+language);
		
		System.out.println("************************");
	}
}
