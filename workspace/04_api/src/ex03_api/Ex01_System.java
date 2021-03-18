package ex03_api;

public class Ex01_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 시스템종료
		 * System.exit(0)
		 * 현재 시간 알아내기
		 * timestamp : 1970 -0 1-01 00 :00: 00 부터 경과한 시간(단위 :밀리초)
		 * */
		
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		//현재시간 알아내기
		//자바가 마음대로 결정한 기준일로 부터 경과한 시간(나노초)
		//경과된 시간을 알아내는게 목적
		long something = System.nanoTime();
		
		System.out.println(something);
		
		//배열 복사하기
		int [] a= {1,2,3,4,5};
		int[] b= new int[10];
		
		System.arraycopy(a, 0, b, 0, a.length);// a[0] 에서 b[0]로 복사. a.length만큼 복사작업.
		
		for(int i = 0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
