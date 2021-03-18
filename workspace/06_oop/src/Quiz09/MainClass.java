package Quiz09;

import Quiz09.Soldier;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier soldier = new Soldier("람보",3);//람보는 총을 최대 3개가질수있다.

		soldier.addGun(new gun("콜트",6));
		soldier.addGun(new gun("베레타",6));
		soldier.addGun(new gun("스미스웨슨",6));
		
		soldier.shoot(); //모든거 한발씩
		soldier.shoot(0);// 1번총 한발
		soldier.shoot("베레타");//베레타 한발

		soldier.info();
		//이름 : 람보
		//콜트 : 4발
		//베레타 : 4발
		//스미스웨슨 : 5발
		
		soldier.reload(6);//모든총 6발장전
		soldier.reload(1,6);//1번총에 6발장전
		
	}

}
