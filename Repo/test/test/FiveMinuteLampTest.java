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
		LocalTime time = LocalTime.of(0, 0,0,0);
		String output = clock.provideFiveMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("OOOOOOOOOOO", output);
		
	}
	
	
	@Test
	public void fiveMinutesReturnsYOOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 5,0,0);
		String output = clock.provideFiveMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("YOOOOOOOOOO", output);		
	}
	
	@Test
	public void tenMinutesReturnsYYOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 10,0,0);
		String output = clock.provideFiveMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("YYOOOOOOOOO", output);		
	}
	
	@Test
	public void elevenMinutesReturnsYYOOOOOOOOO() {
		//Arrange
		Clock clock = new Clock();
		
		//Act
		LocalTime time = LocalTime.of(0, 11,0,0);
		String output = clock.provideFiveMinutesLamp(time);
		
		//Assert
		Assert.assertEquals("YYOOOOOOOOO", output);		
	}
}
