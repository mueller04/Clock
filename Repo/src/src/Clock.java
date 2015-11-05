package src;

import java.time.LocalTime;

public class Clock {
	
	public String provideLamps(LocalTime time)
	{
		int minute = time.getSecond();
		if (minute % 2 == 0)
		{
			return "Y";
		} else
		{
			return "O";
		}
				
	}
}
