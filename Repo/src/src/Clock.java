package src;

import java.time.LocalTime;

public class Clock {
	
	public String provideSecondsLamps(int second)
	{
		if (second % 2 == 0)
		{
			return "Y";
		} else
		{
			return "O";
		}		
	}
	
	public String provideFourLampString(int numberOfLamps, String color){
		String[] returnString = {"O","O","O","O"};
		for (int i = 0; i <= numberOfLamps - 1; i++){
			returnString[i] = color;	
		}
		String result = String.join("",returnString);
		return result;
	}
		
	public void DisplayTime(LocalTime time) {
		int second = time.getSecond();
		System.out.println("seconds " + provideSecondsLamps(second));
		
		int hour = time.getHour();
		FiveHoursLamp fiveHoursLamp = new FiveHoursLamp();
		PrintDisplayTime(hour, "hour", "R", fiveHoursLamp);
		
		int minute = time.getMinute();
		FiveMinutesLamp fiveMinutesLamp = new FiveMinutesLamp();
		PrintDisplayTime(minute, "minute", "Y", fiveMinutesLamp);
	}
	
	public void PrintDisplayTime(int timeUnit, String desc, String color, FiveUnitLamp fiveLamp){
		ResultSet result = DisplayMinutesAndHours(timeUnit, desc, color, fiveLamp);
		System.out.println(result.fiveRow);
		System.out.println(result.singleRow);
	}
	
	public ResultSet DisplayMinutesAndHours(int timeUnit, String desc, String color, FiveUnitLamp fiveLamp) {
		int modulus = timeUnit % 5; 
		timeUnit = timeUnit - modulus;
		int numberOfLamps = timeUnit / 5;
		
		ResultSet resultSet = new ResultSet();
		
		resultSet.setFiveRow("single " + desc + " " + fiveLamp.provideLamps(numberOfLamps, color));
		resultSet.setSingleRow("single " + desc + " " + provideFourLampString(modulus, color));
		return resultSet;
	}
}
