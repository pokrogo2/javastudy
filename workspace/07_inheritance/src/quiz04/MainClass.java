package quiz04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter fighter1 = new KoreanFighter("정찬성");//// 에너지 공격력은 랜덤생성
		Fighter fighter2 = new GlobalFighter("에드가");
		
		//선빵
		boolean myTurn = Math.random()<0.5;
		System.out.println(fighter1.getName() + "의 체력은 : " +fighter1.getEnergy()+" 공격력 : " + fighter1.getPower());
		System.out.println(fighter2.getName() + "의 체력은 : " +fighter2.getEnergy()+" 공격력 : " + fighter2.getPower());
		
		do {
			if(myTurn) {
				fighter1.attack(fighter2);
				myTurn = false;
			}else {
				fighter2.attack(fighter1);
				myTurn =true;
			}
		}while (fighter1.isAlive() && fighter2.isAlive());
	
		System.out.println("종료 ");

		if(fighter1.isAlive()) {
			System.out.println(fighter1.getName() + " 승리    남은 체력 : " + fighter1.getEnergy() );
		}else {
			System.out.println(fighter2.getName() + " 승리    남은 체력 : " + fighter2.getEnergy() );
		}
	}

}

