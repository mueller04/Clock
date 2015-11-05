package test;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import src.Clock;

public class clockTest {

	@Test
	public void secondsLampReturnsYEvenSeconds() {
		//arrange
		Clock clock = new Clock();
		
		//act
		LocalTime localtime = LocalTime.of(0, 0, 0, 0);
		String output = clock.provideLamps(localtime);
		
		//assert
		Assert.assertEquals("Y", output);
	}
	
	@Test
	public void secondsLampReturnsOOddSeconds() {
		//arrange
		Clock clock = new Clock();

		//act
		LocalTime localtime = LocalTime.of(0, 0, 1, 0);
		String output = clock.provideLamps(localtime);

		//assert
		Assert.assertEquals("O", output);
	}
	

}
