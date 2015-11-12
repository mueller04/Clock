package test;

import static org.junit.Assert.*;

import java.time.LocalTime;

import src.Clock;
import src.FiveHoursLamp;
import src.FiveMinutesLamp;
import src.ResultSet;

import org.junit.Assert;
import org.junit.Test;

public class SingleMinutesLampTest {

	@Test
	public void zeroMinutesReturnsOOOO() {
		//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();
		
		//Act
		int minute = 0;
		ResultSet result = clock.DisplayMinutesAndHours(minute, "minute", "Y", fiveLamp);
		
		//Assert
		Assert.assertEquals("single minute OOOO", result.getSingleRow());
	}
	
	@Test
	public void oneminuteReturnsYOOO() {
	//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();
		
		//Act
		int minute = 1;
		ResultSet result = clock.DisplayMinutesAndHours(minute, "minute", "Y", fiveLamp);
		
		//Assert
		Assert.assertEquals("single minute YOOO", result.getSingleRow());
	}
	
	@Test
	public void twominuteReturnsYYOO() {
	//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();
		
		//Act
		int minute = 2;
		ResultSet result = clock.DisplayMinutesAndHours(minute, "minute", "Y", fiveLamp);
		
		//Assert
		Assert.assertEquals("single minute YYOO", result.getSingleRow());
	}
	
	@Test
	public void fourminuteReturnsYYYY() {
	//Arrange
		Clock clock = new Clock();
		FiveHoursLamp fiveLamp = new FiveHoursLamp();
		
		//Act
		int minute = 4;
		ResultSet result = clock.DisplayMinutesAndHours(minute, "minute", "Y", fiveLamp);
		
		//Assert
		Assert.assertEquals("single minute YYYY", result.getSingleRow());
	}
}
