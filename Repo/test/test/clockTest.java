package test;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class clockTest {

	@Test
	public void secondsLampShouldBlinkEvery2Seconds() {
		//arrange
		
		
		//act
		LocalTime localtime = LocalTime.of(0, 0, 0, 0);
		String output = provideLamps(localtime);
		
		//assert
		Assert.assertEquals("Y", output);
	}

}
