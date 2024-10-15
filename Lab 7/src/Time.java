
public class Time {
	private long hour;
	private long minute;
	private long second;

	Time() {
		this(System.currentTimeMillis());	
	}

	Time(long elapseTime) {
		setTime(elapseTime);
	}
	
	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;

		if (elapseTime > 0) {
			totalSeconds = elapseTime / 1000;
			second = totalSeconds % 60;
			totalMinutes = totalSeconds / 60;
			minute = totalMinutes % 60;
			totalHours = totalMinutes / 60;
			hour = totalHours % 24;
		}
	}
}
