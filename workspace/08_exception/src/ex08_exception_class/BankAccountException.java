package ex08_exception_class;

@SuppressWarnings("serial")
public class BankAccountException extends Exception {
	private int errorCode;
	public BankAccountException(String message,int errorCode) {
		super(message); // exception클래스로 message를 전달. >> 예외메세지로 생성됨
		this.errorCode = errorCode;
		
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	
}
