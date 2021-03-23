package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	public Library(String name) {
		this.name=name;
	}
	//method
	public void addBook(Book book) {
		books.add(book);
		
	}
	public void removeBook(int bNo) {
		//int removeIdx=-1;
		for(Book book: books) {
			if(book.getBNo()==bNo) {
				books.remove(book);
				break;
			}
		}
		
		/*
		if(removeIdx==-1) {
			System.out.println(bNo+"번이 없음");
		}else {
			books.remove(removeIdx);
			System.out.println(bNo+"번이 삭제");
		}*/
	}
		public void booksInfo() {
			System.out.println("도서관 : " + name);
			for(Book book : books) {
				System.out.println(book);
		}
	}

}
