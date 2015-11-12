package src;

public class FiveHoursLamp implements FiveUnitLamp{
	
	public String provideLamps(int numLamps, String color){
		Clock clock = new Clock();
		return clock.provideFourLampString(numLamps, color);
	}

}
