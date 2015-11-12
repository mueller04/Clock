package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import src.Clock;
import src.FiveHoursLamp;
import src.FiveMinutesLamp;
import src.ResultSet;

public class SingleHoursLampTest {

	@Test
	public void zeroHourReturnsOOOO() {
		//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();
		
		//Act
		int hour = 0;
		ResultSet result = clock.DisplayMinutesAndHours(hour, "hour", "R", fiveLamp);

			
		//Assert
		Assert.assertEquals("single hour OOOO", result.getSingleRow());
	}

	@Test
	public void oneHourReturnsROOO() {
		//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();

		//Act
		int hour = 1;
		ResultSet result = clock.DisplayMinutesAndHours(hour, "hour", "R", fiveLamp);
			
		//Assert
		Assert.assertEquals("single hour ROOO", result.getSingleRow());
	}
	
	@Test
	public void fourHourReturnsRRRR() {
		//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();

		//Act
		int hour = 4;
		ResultSet result = clock.DisplayMinutesAndHours(hour, "hour", "R", fiveLamp);
			
		//Assert
		Assert.assertEquals("single hour RRRR", result.getSingleRow());
	}
	
}
