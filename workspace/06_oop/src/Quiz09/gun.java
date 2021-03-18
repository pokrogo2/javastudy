package Quiz09;

public class gun {

	private String model;
	private int bullet;
	private final int FULL_BULLET=6;
	

	public gun(String model,int bullet) {
		this.model =model;
		this.bullet=bullet;
		
	}
	public void shoot() {
		if(bullet>0) {
			this.bullet--;
			System.out.println(model + " 빵! ("+bullet+"발 남았다.)");
			
		}else if(bullet==0) {
			System.out.println(model + " 0발");
		}
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	public void info() {
		System.out.println(model + "("+bullet+"발)");
	}
	public void reload(int bullet) {
		if(this.bullet+bullet<=FULL_BULLET) {
			this.bullet+=bullet;
			System.out.println(model + "(" + bullet + "발 추가되었다. 현재 " + this.bullet + "발)" );
			
		}else {
			this.bullet=FULL_BULLET;
			System.out.println("풀충전");
		}
	}
}
