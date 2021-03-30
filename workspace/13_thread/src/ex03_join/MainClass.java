package ex03_join;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		calc1.setFrom(1);
		calc1.setTo(500);
		
		calc2.setFrom(501);
		calc2.setTo(1000);
		
		calc1.start();
		calc2.start();

		calc1.run();
		calc2.run();
		//둘이 끝나는 시점이 다름. 때문에 결과 다를수도있음.
		//쓰레드 종료를 기다리는 메소드 :join()
		//join은 예외처리 필요
		try {
			calc1.join();
			calc2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(calc1.getResult()+calc2.getResult());
	}

}
