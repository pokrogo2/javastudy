package ex01_char;

import java.io.IOException;
import java.io.PrintWriter;

/*
  printWriter 클래스
  FileWriter 클래스와 같은 목적으로 사용합니다.
   출력 메소드 : writer(),print(),println()
   println()메소드를 사용하면 자동 줄바꿈
 */

public class PrintWriterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter out = null;
		try {
			out = new PrintWriter("index.html");
			out.println("<script>");
			out.println("alert('hello java')");
			out.println("</script>");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out !=null) {out.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
