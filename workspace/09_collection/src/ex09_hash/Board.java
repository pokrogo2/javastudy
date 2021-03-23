package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Board {

	//field
	private int bNo;
	private String title;
	private String writer;
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}

}
/*
 
	hashSet 에 board 를 저장하려한다.
	동일한 board의 경우
	저장이 안되도록 설정해야한다.
	
	자바의 기본동작
	1.자바의 기본동작
		1)저장할 board의 해시코드 확인(저장된 주소)
		2)같은해시코드를 가진 board가 있습니까? x
		3)같은 board는 없다. new로 만들기때문
		4)무조건 저장됨.
		5)그럼 중복을 어떻게처리?
	2. 같은 board는 같은 해시코드를 가질 수 있도록 hashCode()메소드를 오버라이드한다.
		같은 보드인지 비교할 equals메소드를 오버라이드
		같은 해시코드를 가지고 equals결과가 true이면 동일한 보드가 있다고 판단. 저장 x
		object equals는 주소비교
 
 
 	결론
 	
 	hash 기반의 컬렉션 프레임워크 (HashSet,HashMap 등) 에 저장할 객체들은 모두Generate hashCode and equals 를 추가하여 사용
 */


