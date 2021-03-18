package Quiz10;

public class MainClass {
public static void main(String[] args) {
	String[] name= {"브레드","짱구","타요","띠띠뽀","자두"};
	Lecture lecture = new Lecture("스프링프레임워크",name);
	

	lecture.info();// 힉생정보 출력+ 강좌 전체평균
}
}
