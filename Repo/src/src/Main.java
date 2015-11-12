package src;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		Clock clock = new Clock();
		LocalTime time = LocalTime.of(13,32,2,0);
		clock.DisplayTime(time);
	}
	


}
