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
	
	public String provideSingleMinutesLamp(int minute)
	{
		String[] returnString = {"O","O","O","O"};
		
		for (int i = 0; i <= minute - 1; i++)
		{
			returnString[i] = "Y";			
		}
		
		String result = String.join("",returnString);
		return result;
	}
	
	public String provideFiveMinutesLamp(int numberOfLamps){
		

		
		String[] returnString = {"O","O","O","O","O","O","O","O","O","O","O"};
		
		for (int i = 0; i <= numberOfLamps - 1; i++){
			returnString[i] = "Y";	
			
			if (i == 2 || i == 5 || i == 8) {
				returnString[i] = "R";		
			}
		}	
		
		String result = String.join("", returnString);
		return result;
	}
	
	
	public void DisplayTime(LocalTime time) {
		int second = time.getSecond();
		System.out.println("seconds " + provideSecondsLamps(second));
		
		int minute = time.getMinute();
		int modulus = minute % 5; 
		minute = minute - modulus;
		int numberOfFiveMinuteLamps = minute / 5;
		System.out.println("single minutes " + provideSingleMinutesLamp(modulus));
		System.out.println("five minutes " + provideFiveMinutesLamp(numberOfFiveMinuteLamps));
		
	}
	
}
