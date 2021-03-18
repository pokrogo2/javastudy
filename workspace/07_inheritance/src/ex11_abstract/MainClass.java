package ex11_abstract;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staff staff = new SalaryMan("alice",300);
		staff.info();
		// staff의 
	
		//staff클래스에 getpay()를 추가
		//>모든 staff는 어차피 getpay를 가져야하므로 이방법으로 해결
		 // 다운캐스팅
		System.out.println(staff.getPay());
	}

}
