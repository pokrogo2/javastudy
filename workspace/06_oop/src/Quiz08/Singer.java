package Quiz08;

public class Singer {

	private String name;
	private Song[] songs;
	private int idx;
	
	public Singer(String name,int songCount) {
		this.name=name;
		this.songs= new Song[songCount];
	}
	public void addSong(Song song) {
		if(idx<songs.length) {
		songs[idx]=song;
		idx++;//add할때마다 idx증가, idx는 노래갯수랑 동일
		}else
			System.out.println("더이상 추가 불가능");
	}
	public void info() {
		//가수 이름 노래 목록
		System.out.println("이름 : " +name);
		System.out.println("노래 목록 ");
		for(int i =0; i<songs.length;i++) {
			if(songs[i] !=null) {
				songs[i].info();
				
			}
		}
	}
}
