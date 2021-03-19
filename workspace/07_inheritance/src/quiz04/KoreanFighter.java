package quiz04;

public class KoreanFighter extends Fighter {

	public KoreanFighter(String name) {//에너지,공격력은 랜덤
		super(name,(int)(Math.random()*100)+1,(int)(Math.random()*10)+1);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack(Fighter fighter) {
		//나 : this
		//상대 :fighter
		if (Math.random()<0.2) {
			fighter.setEnergy(0);//k.o
			System.out.println(fighter.getName()+" K O !");
		}else {
			//내 power만큼 에너지 줄으면됨
			fighter.setEnergy(fighter.getEnergy()-this.getPower());
			System.out.println("공격 : " + this.getName() );
			System.out.println(fighter.getName()+"의 체력이"+fighter.getEnergy() +" 남았음" );
		}
	}

	//attack시 20퍼확률로 ko
	
}
