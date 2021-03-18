package Quiz04;

public class Book {
	String title;
	String author;
	int price;
	void set(String t,String a, int p) {
		title=t;
		author=a;
		price=p;
	}
	void set(String t,int p) {
		title=t;
		author = "작자미상";
		price=p;
	}
	void set(String t,String a) {
		title=t;
		author=a;
	}
	String info() {
		return "제목 : " + title +" 작가 : "+ author+" 가격 : " + price;
	}

}
