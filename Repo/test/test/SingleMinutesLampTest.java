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

}
