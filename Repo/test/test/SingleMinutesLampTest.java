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
		int minute = 0;
		String output = clock.provideSingleMinutesLamp(minute);
		
		//Assert
		Assert.assertEquals("OOOO", output);
	}
	
	@Test
	public void oneminuteReturnsYOOO() {
	//Arrange
		Clock clock = new Clock();
		
		//Act
		int minute = 1;
		String output = clock.provideSingleMinutesLamp(minute);
		
		//Assert
		Assert.assertEquals("YOOO", output);
	}
	
	@Test
	public void twominuteReturnsYYOO() {
	//Arrange
		Clock clock = new Clock();
		
		//Act
		int minute = 2;
		String output = clock.provideSingleMinutesLamp(minute);
		
		//Assert
		Assert.assertEquals("YYOO", output);
	}
	
	@Test
	public void fourminuteReturnsYYYY() {
	//Arrange
		Clock clock = new Clock();
		
		//Act
		int minute = 4;
		String output = clock.provideSingleMinutesLamp(minute);
		
		//Assert
		Assert.assertEquals("YYYY", output);
	}
}
