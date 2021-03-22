package ex08_static;

public class MyMath {

	private MyMath() {} // private생성자 MyMath내부에서만 생성이 가능하다. 다른곳에서 new를 못하게하는것
	public static final double PI = 3.141592; //static처리된건 클래스이름으로접근 왜? Math math= new Math();이거안할려고 그냥 Math.PI하면됨. 객체마다다른게아니니까
	
	public static double abs(double n) {
		return (n>0) ? n: -n;
		
	}
	public static double pow(double a, double b) {
		double result =1;
		for(int i = 0; i<b;i++) {
			result *=a;
		}
		return result;
		
	}
	
	
}
