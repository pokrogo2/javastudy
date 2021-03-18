package Quiz09;

public class Soldier {

	private String name;
	private gun[] guns;
	private int idx;
	
	public Soldier(String name,int count) {
		this.name = name;
		this.guns = new gun[count];
		
	}
	public void addGun(gun guns) {
	
		if(idx<this.guns.length) {
		this.guns[idx]=guns;
		idx++;}
	}
	public void shoot() {
		for(int i =0;i<guns.length;i++) {
			if(guns[i]!=null)
			guns[i].shoot();
			
			
			
		}
	}
		
		// TODO Auto-generated method stub
		
	
	public void shoot(int i) {
		if(guns[i]!=null)
		guns[i].shoot();
	}
	public void shoot(String name) {
		for(int i=0;i<guns.length;i++) {
			if(guns[i]!=null) {
			if(guns[i].getModel().equals(name)) {
				guns[i].shoot();
			}
			
		}}
	}
	public void info() {
		System.out.println("이름 : " +this.name);
		for(int i=0;i<guns.length;i++) {
			if(guns[i]!=null) {
			guns[i].info();}
		}
		
	}
	public void reload(int i) {
		for(int j =0;j<guns.length;j++) {
			if(guns[j]!=null) {
			guns[j].reload(i);
		}}
		
	}
	public void reload(int i, int j) {
		// TODO Auto-generated method stub
		if(guns[i]!=null) {
		guns[i].reload(j);
		}
	}
}
