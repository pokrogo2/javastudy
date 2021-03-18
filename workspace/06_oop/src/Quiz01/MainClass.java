package Quiz01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		watch watch = new watch(10,45,30);//10:45:30
		
		watch.addHour(25);// 1시간후
		
		watch.addMin(61);// 1시간 1분
		watch.addSec(3661);//1시간 1분 1초

		watch.see();//13시 47분 31초
	}

}
