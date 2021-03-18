package ex02_String;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fullname = "2021-03-10.jpg";
		// 파일명과 확장자 명 분리하기.
		String filename = fullname.substring(0,fullname.indexOf(".")); //2021-03-10
		String extname = fullname.substring(fullname.indexOf(".")+1);//jpg

		
		System.out.println(filename);
		System.out.println(extname);
	}

}
