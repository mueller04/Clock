package src;

public class FiveMinutesLamp implements FiveUnitLamp{

	public String provideLamps(int numberOfLamps, String color){
		

		
		String[] returnString = {"O","O","O","O","O","O","O","O","O","O","O"};
		
		for (int i = 0; i <= numberOfLamps - 1; i++){
			returnString[i] = color;	
			
			if (i == 2 || i == 5 || i == 8) {
				returnString[i] = "R";		
			}
		}	
		
		String result = String.join("", returnString);
		return result;
	}
	
}
