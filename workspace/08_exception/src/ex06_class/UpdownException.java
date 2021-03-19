package ex06_class;
//예외 클래스는 " 직렬화"를 대비해서 serialVersionID를 생성하라고 경고띄움.
//직렬화 처리를 할 필요가 없다면 경고메세지를 무시하라는 @suppressWarnings
@SuppressWarnings("serial")

public class UpdownException extends Exception {

	//예외클래스는 주로 어떤일을 하는가.
	//예외 메세지(예외가 발생한 이유)
	public UpdownException() {
		super("1~100사이의 값을 입력해야합니다."); // 예외 메세지 exception에게 전달함
	}
}
