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
		
		String[] returnString = {"O","O","O","O"};
		for (int i = 0; i <= minute - 1; i++)
		{
			returnString[i] = "Y";			
		}
		
		String result = String.join("",returnString);
		return result;
	}
}
