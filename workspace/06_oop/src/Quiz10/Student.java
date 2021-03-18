package Quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {

	private String name;
	private int[] scores;//점수
	private double average;//평균
	private char grade;//학점A~f
	private boolean isPass;//합격유무 평균 60이상 합격
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public double getAverage() {
		return average;
	}

	private void setAverage(double average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isPass() {
		return isPass;
	}

	private void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	
	public void setScores(int scoreCount) {
		int sum=0;
		//scoreCount만큼 임의의  scores배열에저장
		// 30퍼학률  : 0~50 임의로 생성
		//40퍼 확률 : 50~80임의로 생성
		//30퍼 확률 80~100
		scores = new int[scoreCount];
		for(int i=0; i<scores.length;i++) {
			if(Math.random()<0.3) {
				scores[i] = (int)(Math.random()*50)+0;
			}else if(Math.random()<0.7) {
				scores[i] = (int)(Math.random()*30)+50;
			}else {
				scores[i] = (int)(Math.random()*21)+80;
			}
		}
		for(int score : scores) {
			
			sum+=score;
			setAverage((double)(sum/scores.length));
		}
	}
	
		
	public void info() {
		
		System.out.println("이름 :" +name);
		System.out.println("점수 : "+Arrays.toString(scores)); // [50,72,95,84,60]

	
		if(average>=90) {setGrade('A');}
		else if(average>=80) {setGrade('B');}
		else if(average>=70) {setGrade('C');}
		else if(average>=60) {setGrade('D');}
		else {setGrade('F');}
		
		System.out.println("평균 : " + new DecimalFormat("0.00").format(average) + "점");
		System.out.println("학점 : " +grade + "학점");
		System.out.println(isPass ? "합격" :"불합격");
	}
	
}
