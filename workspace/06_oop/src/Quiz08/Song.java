package Quiz08;

public class Song {
	
	private String title;
	private String genre;
	
	public Song(String title, String genre) {
		this.title=title;
		this.genre=genre;
		
	}
	
	public void info() {
		System.out.println(title + "("+genre+")");
	}

}
