package Quiz04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun gun = new Gun("k2",2);
		Soldier soldier = new Soldier("람보", gun);
		
		soldier.shoot();//한발남았다.
		soldier.shoot();//0발남았다.
		soldier.shoot();//헛빵
		
		soldier.reload(2); // 2발장전 현재 2발.
		
		soldier.reload(6); // 4발이 장전되었다 .현재 6발
		soldier.reload(6); // 0발이 장전되었다 .현재 6발

		soldier.info();//람보 k2에 6발ㄴ마았다.
	}

}
