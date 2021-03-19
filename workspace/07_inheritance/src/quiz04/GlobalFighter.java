package quiz04;

public class GlobalFighter extends Fighter {

	public GlobalFighter(String name) {
		super(name,(int)(Math.random()*100)+1,(int)(Math.random()*10)+1);
		// TODO Auto-generated constructor stub
	}
//attack 10퍼확률 ko

	@Override
	public void attack(Fighter fighter) {
		if((int)(Math.random())<0.1) {
			fighter.setEnergy(0);
			System.out.println(fighter.getName()+"K O !");
		}else {
			fighter.setEnergy(fighter.getEnergy()-this.getPower());
			System.out.println("공격 : " + this.getName() );
			System.out.println(fighter.getEnergy() +"의 체력이 남았음" );
		}
	}
	
}
