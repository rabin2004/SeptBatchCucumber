package stepDefination;

import basePkg.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{

	@Before
	public void loadApp() {
		initialization();
	}
	
	@After
	public void closeApp() {
		tearDown();
	}
}
