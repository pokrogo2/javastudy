package Quiz04;

public class Soldier {
		private String name;
		private Gun gun;
		
		public Soldier(String name,Gun gun) {
			this.gun=gun;
			this.name=name;
		}
		public void shoot() {
			gun.shoot();
		}
		
		public void reload(int i) {
			// TODO Auto-generated method stub
			gun.reload(i);
		}
		public void info() {
			// TODO Auto-generated method stub
			System.out.print(name + "에는 " );
			gun.info();
			System.out.println("발 남았다.");
		}
		



}
