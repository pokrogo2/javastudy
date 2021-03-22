package ex03_generic;

public class Box <T>{

	private T[] items; // T[] items = new T[10] 안되는 이유. compiletime 후 runtime T[10]이 먼저생성해야되는데 T의 타입을 모름. 안만들어짐.
	private int idx;
	
	public Box(int itemCount) {
		//items = new T[itemCount]; 코드 작성시점에는 T의 구체적인 종류를 알 수 없어서, 메모리 할당이 불가능하다.
		items = (T[])(new Object[itemCount]); // object 배열 생성 뒤에는 캐스팅을 해줘야 함.
		
	}
	public T[] getItems() {
		return items;
	}
	public void setItems(T[] items) {
		this.items = items;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	

	public void addItem(T item) {
		if(idx == items.length) {
			System.out.println("FULL");
			return;
		}
		items[idx++]=item;
	}
	@Override
	public String toString() {
		String result = "";
		for(T item : items) {
			if(item!=null) {
				result +=item.toString();// item.toString >> fruit의 toString
			}
			
		}return result;
	}
	
	
}
