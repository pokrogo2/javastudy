package ex02_2d_array;

public class Quiz03 {
//3. 369 의 결과를 저장하고출력
	//1 2 짝 4 5 짝 7 8 짝 10 0,0~0,9
	//12 12 짝 .. 29
	//짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
	//...짝짝(99)8,0~8,9
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		String [][]a = new String[10][10];
		
		for(int i =0;i<10;i++) {
			System.out.println();
			for(int j=0; j<10;j++) {
			int units = n%10;
			int tens = n/10;
			//369검사
			boolean check1 = n%10==3||n%10==6||n%10==9;
			boolean check2 = n/10 ==3||n/10==6||n/10==9;
				if(check1||check2) {

					a[i][j] ="짝";
				}
				else if(check1&&check2){
					a[i][j]="짝짝";
					
				}
				else {
				a[i][j] = Integer.toString(n);
				}
				
				n++;
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
