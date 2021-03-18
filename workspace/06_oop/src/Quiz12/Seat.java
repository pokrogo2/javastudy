package Quiz12;

public class Seat {

	// field
	private String name;
	//constructor 없음 , 빈좌석이 있을 수 있음
	//method

	//1.예매자 이름 확인
	public String getName() {
		return name;
	}
	//2. 예매할때 저장용
	public void setName(String name) {
		this.name = name;
	}
	//3.예매 취소
	public void cancel() {
		this.name = null;
	}
	//4. 예매 여부 확인
	//1) 예매가 된 좌석 : false , 예매가 된 좌석 true
	public boolean check() {
		return (name ==null);
	}
	//5. 확인
	public void info() {
		if(name == null) {
			System.out.print("가능");
		}else {
			System.out.println(name.charAt(0)+"*"+(name.length()>2 ? name.charAt(name.length()-1) : " "));
		}
	}
}
