package test;

import static org.junit.Assert.*;

import java.time.LocalTime;

import src.Clock;
import src.FiveMinutesLamp;

import org.junit.Assert;
import org.junit.Test;

public class FiveMinuteLampTest {

	@Test
	public void zeroMinutesReturnsOOOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		FiveMinutesLamp fiveMinutesLamp = new FiveMinutesLamp();
		
		//Act
		int numberOfLamps = 0;
		String output = fiveMinutesLamp.provideLamps(numberOfLamps, "Y");
		
		//Assert
		Assert.assertEquals("OOOOOOOOOOO", output);
		
	}
	
	
	@Test
	public void fiveMinutesReturnsYOOOOOOOOOO() {
		//Arrange
		FiveMinutesLamp fiveMinutesLamp = new FiveMinutesLamp();
		
		//Act
		int numberOfLamps = 1;
		String output = fiveMinutesLamp.provideLamps(numberOfLamps, "Y");
		
		//Assert
		Assert.assertEquals("YOOOOOOOOOO", output);		
	}
	
	@Test
	public void tenMinutesReturnsYYOOOOOOOOO() {
		//Arrange
		FiveMinutesLamp fiveMinutesLamp = new FiveMinutesLamp();
		
		//Act
		int numberOfLamps = 2;
		String output = fiveMinutesLamp.provideLamps(numberOfLamps, "Y");
		
		//Assert
		Assert.assertEquals("YYOOOOOOOOO", output);		
	}
	
		
	
	@Test
	public void fiftynineMinutesReturnsYYRYYRYYRYY() {
		//Arrange
		FiveMinutesLamp fiveMinutesLamp = new FiveMinutesLamp();
		
		//Act
		int numberOfLamps = 11;
		String output = fiveMinutesLamp.provideLamps(numberOfLamps, "Y");
		
		//Assert
		Assert.assertEquals("YYRYYRYYRYY", output);		
	}
}
