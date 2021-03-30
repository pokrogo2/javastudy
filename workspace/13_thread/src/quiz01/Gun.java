package quiz01;

public class Gun extends Weapon implements Runnable{ //extends Thread(x)/implements Runnable(o)

	private String name;
	private int bullet;
	
	
	public Gun(String name, int bullet) {
		super();
		this.name = name;
		this.bullet = bullet;
	}


	@Override
	public void run() {
	
		
		for(int i=0; i<bullet; i++) {
		shoot(i);
		}
	}
	public void shoot(int i) {
		//한발씩쏘는 메소드
		if(bullet ==0) {
			System.out.println("헛빵");
			return;
		}else {
			System.out.println(name +(i+1)+"발 쐇다.");
		}
	}
}
