package test;

import static org.junit.Assert.*;

import java.time.LocalTime;

import src.Clock;

import org.junit.Assert;
import org.junit.Test;

public class FiveMinuteLampTest {

	@Test
	public void zeroMinutesReturnsOOOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		int numberOfLamps = 0;
		String output = clock.provideFiveMinutesLamp(numberOfLamps);
		
		//Assert
		Assert.assertEquals("OOOOOOOOOOO", output);
		
	}
	
	
	@Test
	public void fiveMinutesReturnsYOOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		int numberOfLamps = 1;
		String output = clock.provideFiveMinutesLamp(numberOfLamps);
		
		//Assert
		Assert.assertEquals("YOOOOOOOOOO", output);		
	}
	
	@Test
	public void tenMinutesReturnsYYOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		int numberOfLamps = 2;
		String output = clock.provideFiveMinutesLamp(numberOfLamps);
		
		//Assert
		Assert.assertEquals("YYOOOOOOOOO", output);		
	}
	
		
	
	@Test
	public void fiftynineMinutesReturnsYYRYYRYYRYY() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		int numberOfLamps = 11;
		String output = clock.provideFiveMinutesLamp(numberOfLamps);
		
		//Assert
		Assert.assertEquals("YYRYYRYYRYY", output);		
	}
}
