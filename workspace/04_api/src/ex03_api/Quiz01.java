package ex03_api;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.String 과 StringBuilder의 성능비교
		//1~100000을 모두 연결합니다.(12345678910...
		//각 클래스별 연결에 소요된 시간을 ns로 출력
		
		String a1 = "";
		long start1 = System.nanoTime();
		for(int n=1;n<=100000;n++) {
			a1 +=n;
			
		}
		long end1 = System.nanoTime();
		System.out.println("String 경과시간 " + (end1-start1)/1000000000.0 + "sec");
		StringBuilder a2 = new StringBuilder();
		long start2 = System.nanoTime();
		for(int n=1;n<=100000;n++) {
			a2.append(n);
		}
		long end2 = System.nanoTime();
		System.out.println("StringBuilder 경과시간" + (end2-start2)/1000000000.0+"sec");
	}

}
