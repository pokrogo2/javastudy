package Starcraft;

public class Bunker {

	private int idx;
	private Terran[] terrans;
	
	public Bunker() {
		terrans = new Terran[10];
	}
	
	public void add(Bunkable terran) {
		if(idx<terrans.length) {
			terrans[idx++]=(Terran)terran; //벙커블 타입이므로 테란타입으로 변환
		}
		
	}
}
