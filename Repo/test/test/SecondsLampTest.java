package test;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import src.Clock;

public class SecondsLampTest {

	@Test
	public void secondsLampReturnsYEvenSeconds() {
		//arrange
		Clock clock = new Clock();
		
		//act
		int second = 0;
		String output = clock.provideSecondsLamps(second);
		
		//assert
		Assert.assertEquals("Y", output);
	}
	
	@Test
	public void secondsLampReturnsOOddSeconds() {
		//arrange
		Clock clock = new Clock();

		//act
		int second = 1;
		String output = clock.provideSecondsLamps(second);

		//assert
		Assert.assertEquals("O", output);
	}
	

}
