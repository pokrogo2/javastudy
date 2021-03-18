package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "apple";
		String b= "apple"; //동일한 글자리터럴 다시 안만듬. 둘다 같은곳을 가리킴
		System.out.println(a==b);
		// new는 무조건 다시만듬
		// 둘이 같아보이지만 new때메 다른 바나나임.
		String c = new String("banana");
		String d = new String("banana");

		//문자열 길이는 length()메소드
		System.out.println(a.length());
		
		//substring 메소드 : 문자열 일부를 추출
		//1.substring(시작인덱스) // 2.substring(시작인덱스,종료인덱스):시작인덱스는 포함,끝은포함 안함.n<=부터<m
		
		System.out.println(a.substring(0,3));
		//문자열 양 옆의 공백문자(white space)를 제거하려면 trim()메소드를 사용합니다.
		String name = "        alice     ";
		System.out.println(name.trim()+name.trim().length());
		//특정 문자를 찾는경우 indexOf()메소드 사용
		//찾고자하는 문자(열)의 인덱스반환
		
		String str = "best of best of best";
		int index = str.indexOf("best");
		System.out.println("첫 번째 best의 인덱스" + str.indexOf("best"));
		System.out.println("두 번째 best의 인덱스" + str.indexOf("best",str.indexOf("best")+1));
		System.out.println("세 번째 best의 인덱스" + str.indexOf("best",str.indexOf("best")+1));
		System.out.println("찾는 문자열이 없으면 "+str.indexOf("v")  + "가 나타납니다.");
	
		//lastIndexOf()메소드가 있다.
		System.out.println("마지막 best의 인덱스 : " +  str.lastIndexOf("best"));
		
		//기존 문자를 새로운 문자로 변경하는 replace() 메소드가 있다.
		System.out.println(str.replace("b","B"));
		System.out.println(str.replace("f", ""));
	}
	
	

}
