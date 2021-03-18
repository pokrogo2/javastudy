package Quiz01;

public class watch {
	int hour;
	int min;
	int sec;


	watch(int hour,int min, int sec) {
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	void addHour(int hour) {
		this.hour+=hour%24;//25가 들어오면 나머지니까 1
	}
	void addMin(int min) {
		this.min+=min;
		addHour(this.min/60);
		this.min= this.min%60;
	
	}
	void addSec(int sec) {
		this.sec+=sec;
		addHour(this.sec/3600);
		addMin((this.sec%3600)/60);
		this.sec=(this.sec%3600)%60;
	}
	
	void see() {
		System.out.println(hour + "시 " + min + "분 " + sec+"초");
	}

}
//7222초 : (sec-3600*(sec/3600)) =22초

