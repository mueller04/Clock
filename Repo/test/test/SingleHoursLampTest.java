package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import src.Clock;

public class SingleHoursLampTest {

	@Test
	public void zeroMinuteReturnsOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		int hour = 0;
		String result = clock.provideSingleHourLamp(hour);
			
		//Assert
		Assert.assertEquals("OOOO", result);
	}

	@Test
	public void oneMinuteReturnsROOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		int hour = 0;
		String result = clock.provideSingleHourLamp(hour);
			
		//Assert
		Assert.assertEquals("ROOO", result);
	}
	
}
