package ex04_priority;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("가장 낮은 순위 " + Thread.MIN_PRIORITY);
		System.out.println("가장 낮은 순위 " + Thread.MAX_PRIORITY);
		System.out.println("가장 낮은 순위 " + Thread.NORM_PRIORITY);

		Thread homework = new Thread(new Homework());
		Thread watchTV = new Thread(new WatchTV());
		
		homework.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		
		watchTV.start();
		homework.start();
		
	
	}

}
