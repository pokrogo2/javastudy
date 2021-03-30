package ex05_synchronized;
//critical section
//임계영역
//공유자원을 관리하기 위해서 한번에 한 쓰레드의 접근만 허용
public class Dyson {

	//한 스레드만  fllor나 other 에 접근할 수 있다.
	//동시 접근이 안됨.
	//메소드
	public synchronized void floorCleaning() {
		try {
		System.out.println("바닥 청소를 하고 있다.");
		Thread.sleep(1000);// 1000밀리초 = 1초
		notify(); // 다른 스레드에게 floorCleaning이 끝났음을 알림.
		wait(); // 다른 스레드가 끝났다고 알려줄때까지 기다립니다.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void homeCleaning() {
		try {
			System.out.println("집안을 청소 하고 있습니다.");{
				Thread.sleep(1000);
				notify();
				wait();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
