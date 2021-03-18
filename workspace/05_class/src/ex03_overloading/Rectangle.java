package ex03_overloading;
/*
 오버로딩
 이름 같음. 매개변수가 다름
 int getArea 와 double getArea는 그냥 짤수가없음. 매개변수만 달라야함.
 */
public class Rectangle {

	int width;
	int height;
	
	void set(int w,int h) {
		if(w>0) {
			width=w;
		}
		if(h>0) {
			height=h;
		}
		
	}
	void set(int w) {
		if(w>0) {
			width=w;
			height=w;
		}
		
	}
	int getArea() {
		return height*width;
	}
}
