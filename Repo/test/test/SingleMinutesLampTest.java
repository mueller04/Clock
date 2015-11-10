package test;

import static org.junit.Assert.*;

import java.time.LocalTime;

import src.Clock;

import org.junit.Assert;
import org.junit.Test;

public class SingleMinutesLampTest {

	@Test
	public void zeroMinutesReturnsOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 0, 0, 0);
		String output = clock.provideSingleMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("OOOO", output);
	}
	
	@Test
	public void oneminuteReturnsYOOO() {
	//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 1, 0, 0);
		String output = clock.provideSingleMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("YOOO", output);
	}
	
	@Test
	public void twominuteReturnsYYOO() {
	//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 2, 0, 0);
		String output = clock.provideSingleMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("YYOO", output);
	}
	
	@Test
	public void fourminuteReturnsYYYY() {
	//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 4, 0, 0);
		String output = clock.provideSingleMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("YYYY", output);
	}
}
