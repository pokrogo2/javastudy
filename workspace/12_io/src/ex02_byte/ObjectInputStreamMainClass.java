package ex02_byte;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamMainClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("board.dat"));
			
			Board board = (Board)ois.readObject();
			System.out.println(board);
			
			List<Board> boardList = (ArrayList<Board>)ois.readObject();
			for (Board b : boardList) {
				System.out.println(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (ois != null) { ois.close(); }
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}

