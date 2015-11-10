package src;

import java.time.LocalTime;

public class Clock {
	
	public String provideSecondsLamps(LocalTime time)
	{
		int second = time.getSecond();
		if (second % 2 == 0)
		{
			return "Y";
		} else
		{
			return "O";
		}
				
	}
	
	public String provideSingleMinutesLamp(LocalTime time)
	{
		int minute = time.getMinute();
		String minuteStr = String.valueOf(minute);
		int length = minuteStr.length();
		
		if (length > 1)
		{
			String[] characters = minuteStr.split("_");
			minute = Integer.parseInt(characters[0]);
		}
		
		if (minute == 0)
		{
			return "OOOO";
		} else
		{
			return "error";
		}
		
	}
}
