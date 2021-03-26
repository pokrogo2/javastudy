package ex02_byte;

import java.io.Serializable;

//oos에 의해 writeObject 메소드로 호출되는 클래스
//직렬화가 필요함. Serializable
public class Board implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9123626088273496189L;
	private String title;
	private String content;
	private String winter;
	public Board(String title, String content, String winter) {
		super();
		this.title = title;
		this.content = content;
		this.winter = winter;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", winter=" + winter + "]";
	}
	
}
