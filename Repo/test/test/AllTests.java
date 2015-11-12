package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SecondsLampTest.class, SingleMinutesLampTest.class, 
	FiveMinuteLampTest.class, SingleHoursLampTest.class})
public class AllTests {

}
