package Quiz10;

import java.text.DecimalFormat;

public class Lecture {

	String[] names;
	Student student[];
	String lecture;
	public Lecture(String lecture,String[] names) {
		this.names=names;
		student = new Student[names.length];
		this.lecture=lecture;
		
		for(int i=0; i<names.length; i++) {
			student[i] = new Student(names[i]);
		}
		
	}
	public void exam(int scoreCount) {
		for(Student student : this.student) {
			student.setScores(scoreCount);
		}
	}
	public double getLectureAverage() {
		double total =0.0;
		for(Student student : this.student) {
			total+=student.getAverage();
		}
		return total/student.length;
	}
	public void info() {
		System.out.println("강좌명 : " + lecture);
		System.out.println("강좌평균 : " + new DecimalFormat("0.00").format(getLectureAverage()));
		System.out.println();
		
		for(Student student : this.student) {
			student.info();
		}
	}
	
}
