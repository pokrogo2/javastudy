package ex01_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//길이가 3인 String 타입 배열 선언
		// 3개의 이름을 입력받음.
		//String[] friendList = {"타요","짱구","스폰지밥"}
		//새로 사귄 친구의 수를 입력받아서, friend 리스트 배열의 길이를 늘이기.
		
		String[] friendList = {"타요","짱구","스폰지밥"};
		Scanner sc = new Scanner(System.in);

		System.out.println("새친구는 총몇명?");
		int newf = sc.nextInt();
		String[] temp = new String[friendList.length+newf];
		for(int i =0; i<friendList.length;i++) {
			temp[i]=friendList[i];
		}

		

		for(int i =friendList.length; i<temp.length;i++) {
		System.out.println("새 친구를 입력하세요 : ");
		temp[i]=sc.next();
		}
		friendList=temp;
		
		
		for(String j : temp) {
			System.out.println("새친구 목록 : " + j);
			
			
		}
		System.out.println(temp.length);
	}

}
