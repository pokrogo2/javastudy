package ex02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//runnable 인터페이스 구현한 스레드는
	//1생성
	//2.thread로 변경
	
	Player p1 = new Player("레이디버그");
	Thread player1 = new Thread(p1);
	Player p2 = new Player("블랙캣");
	Thread player2 = new Thread(p2);
	
	player1.start();
	player2.start();

}
}
