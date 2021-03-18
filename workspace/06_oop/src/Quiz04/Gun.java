package Quiz04;

public class Gun {

	private String model;
	private int bullet;
	private final int FULL_BULLET = 6;
	
	public Gun(String model,int bullet) {
		this.model=model;
		this.bullet=bullet;
	}
	public void shoot() {
		if(bullet==0) {
			System.out.println("남은총알이없습니다.");
		}
		else {
		this.bullet-=1;
		System.out.println(bullet+"발 남았습니다.");
	}
	}
	public void reload(int i) {
		if(bullet+i>=FULL_BULLET) {
			int rb=FULL_BULLET-this.bullet;
			this.bullet+=rb;
			System.out.println(rb+"발이 충전되었다. 현재 " +this.bullet);
		}else {
			this.bullet+=i;
		System.out.println(i+"발이 충전되었다. 현재"+ this.bullet+"만큼 충전되어있다.");
	}
	}
	public void info() {
		System.out.print(this.bullet);
	}
}
