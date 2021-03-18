package Quiz03;

public class Student {

	String name;
	int korean;
	int english;
	int math;
	
	void set(String n,int k, int e,int m) {
		name=n;
		korean=k;
		english=e;
		math=m;
	}
	double getAverage() {
		return (korean+math+english)/3;
		
	}
	String getPass() {
		if(getAverage()>=60) {
			 return "합격";
		}
		else {
			return "불합격";
		}
	}
}
