package ex07_override;

public class GogumaPizza extends Pizza{

	private String goguma;

	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma;
	}
	
	//고구마 정보의 출력을 위해서 Pizza 의 인포를 다시만들어야합니다.
	@Override
	public void info() {
		System.out.println("원산지 : " +goguma);
		super.info();
	}
}
