package Quiz03;

public class Song {
	private String title;
	private double playTime;
	
	public Song(String title,double playTime) {
		this.playTime=playTime;
		this.title=title;
		
	}
	public void info() {
		System.out.println(title + ", " + playTime);
	}

}
