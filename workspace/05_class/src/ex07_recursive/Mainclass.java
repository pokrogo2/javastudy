package ex07_recursive;

public class Mainclass {

	public static void main(String[] args) {
	SayHello sh = new SayHello();
	sh.Say(5);

	Adder adder = new Adder();
	adder.calculate(10);//1~10까지합
	

	System.out.println(adder.getTotal());
	
	Calculator cal = new Calculator();
	int n =3;
	System.out.println(n+"! = "+cal.getFactorial(n));
}
}
