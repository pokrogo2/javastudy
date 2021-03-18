package Quiz07;

public class Game {
	private Player[] players;
	
	public Game(int playerCount) {
		// TODO Auto-generated constructor stub
		this.players = new Player[playerCount];
		
	}

	public void setPlayer() {
		// TODO Auto-generated method stub
		String[] names = {"a","b","c","d","e"};
		for(int i =0; i<players.length;i++) {
			//players[i].setName(name);
			
			players[i]=new Player(names[(int)(Math.random()*names.length)]);
		}
	}

	public void play() {
		//Player들의 플레이결과를 저장할 int타입의 배열
		int [] times = new int [players.length];
		for(int i =0; i<players.length;i++) {
			times[i]=players[i].play();
		}
		int min=Math.abs(times[0]-10);
		int winner=0;
		for(int j =1;j<times.length;j++) {
		if(min>Math.abs(times[j]-10)) {
			min = Math.abs(times[j]-10);//times-10의 절대값을 구한뒤 그중 가장 작은값 |10-11| = |10-9| 절대값은 Math.abs(n)
			winner = j;
		}
		
		}
		for(int i=0; i<players.length;i++) {
			System.out.println(players[i].getName() + "'s result : " + times[i]+"sec");
		}
		System.out.println(players[winner].getName()+"'s victory");
	}

	
}
