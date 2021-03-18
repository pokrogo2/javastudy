package Quiz11;

public class Day {

	//field
	private String schedule;
	//constructor

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public void info() {
		if(schedule == null ||schedule.isEmpty()) {//null또는 빈문자열
			System.out.println("[없음]");
		}else {
			System.out.println(schedule);
		}
	}
}
