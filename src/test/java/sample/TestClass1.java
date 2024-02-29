package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void demo() {
		Reporter.log("Hello World!", true);
	}
}
