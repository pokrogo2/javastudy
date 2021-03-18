package Quiz06;

public class Book {

	String title;
	String author;
	int price;
	
	Book(String title,String author, int price) {
		this.title =title;
		this.author=author;
		this.price=price;
	}
	Book(String title,int price) {
		this(title,"미상",price);
	}
	Book(String title,String author) {
		this(title,author,0);
	}
	
	Book() {
		this("없음","미상",0);
	}
	
	void info() {
		System.out.println("제목 : "+ title+" 저자 : " + author + " 가격 : " + price);
	}
}
