package ex17_Object.quiz;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Score {
	private int kor,eng,mat;

	public Score(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "국어 : " +kor + "수학 : " +mat + "영어 : " + eng;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Score) {
			Score s =(Score)obj;
			return (kor==s.kor&&eng==s.eng&&mat==s.mat);
		}
		return false;
	}

}
