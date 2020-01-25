package dummy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunThisTest {

	@Test
	public void log() {
		Reporter.log("This is a dummy project.", true);

	}

}
