package ex02_String;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.lang.StringBuilder // 기본 java.lang클래스에 속함
		//문자열생성
		StringBuilder sb =  new StringBuilder("hello");
		StringBuilder sb1 =  new StringBuilder("hello");
		StringBuilder sb2 =  new StringBuilder("hello");
		//문자열 추가
		sb.append(" ").append("java");
		
		

		System.out.println(sb); // +로해도되는데 왜쓸까?? String의 + 연산자를 많이 사용하면 성능이떨어짐. 메모리 사용 많아짐.
		// 메모리에 a + b+ c 면 a b c 가 남아있음. 메모리 소모심해짐 .append쓰면 합쳐진것만남음.
		
		StringBuilder str1 =  new StringBuilder("hello");
		StringBuilder str2 =  new StringBuilder("hello");
		
		System.out.println(str1.equals(str2));//stringbuilder라 안됨.
		String str3 = sb1.toString();
		String str4 = sb2.toString();
		System.out.println(str3.equals(str4));
		
	}

}
